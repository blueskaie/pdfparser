/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.csv.CSVRecord;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author sansari
 */
public class MISMO {

    static XPath xpath = null;
    static Document doc = null;
    static int firstPage = 1;

    public void setXPath(String xmlfile) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        doc = builder.parse(xmlfile);

        XPathFactory xPathfactory = XPathFactory.newInstance();
        xpath = xPathfactory.newXPath();
    }

    public void setFirstPage() throws Exception {
        String label = "Uniform Residential Appraisal Report";

        Element e = (Element) xpath.evaluate("//text[text()='" + label + "']", doc,
                XPathConstants.NODE);
        String firstPageStr = ((Element) e.getParentNode()).getAttribute("number");
        System.out.println("First page:" + firstPageStr);
        if (firstPageStr != null) {
            firstPage = Integer.parseInt(firstPageStr);
        } else {
            throw new Exception("Unable to determine first page");
        }
    }

    public Map<String, Object> getMismoData(String xmlfile) throws Exception {
        setXPath(xmlfile);
        setFirstPage();
        Map<String, Object> dataMap = new HashMap<>();

        Iterable<CSVRecord> records = Mapping.readMapping();
        Iterator<CSVRecord> itr = records.iterator();
        while (itr.hasNext()) {
            CSVRecord record = itr.next();
            if (record.size() > 3) {
                String label = record.get("label");
                String pageNum = record.get("page");
                System.out.println(label);
                System.out.println("Page number: " + pageNum);
                Map<String, Object> positions = searchPosition(label, pageNum);
                System.out.println("Positions: " + positions);
                getTagValue(positions, pageNum);
            }
        }
        return null;
    }

    public Map<String, Object> searchPosition(String label, String pageNum) throws Exception {
        Map<String, Object> positions = new HashMap<>();
        Element e = (Element) xpath.evaluate("//page[@number='" + pageNum + "']/text[text()='" + label + "']", doc,
                XPathConstants.NODE);
        if (e != null) {
            System.out.println("Pagenumber:::" + ((Element) e.getParentNode()).getAttribute("number"));
            System.out.println("top::" + e.getAttribute("top"));
            positions.put("top", e.getAttribute("top"));
            positions.put("left", e.getAttribute("left"));
            positions.put("width", e.getAttribute("width"));
            positions.put("height", e.getAttribute("height"));
        }

        return positions;
    }

    public String getTagValue(Map<String, Object> positions, String pageNum) throws Exception {
        String value = null;
        if (positions == null) {
            return value;
        }
        int top = Integer.parseInt(positions.get("top").toString());
        int left = Integer.parseInt(positions.get("left").toString());
        int width = Integer.parseInt(positions.get("width").toString());
        int window = 6;
        int topPosition = top - 3;

        for (int m = 0; m < window; m++) {
            topPosition++;
            System.out.println("Top position is: " + topPosition +" for m="+m);
            XPathExpression expr = xpath.compile("//page[@number='" + pageNum + "" + "']/text[@top='" + topPosition + "']");
            NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            System.out.println("Nodes: " + nl.getLength());
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                System.out.println("============");
                System.out.println("node value:" + node.getTextContent());
                System.out.println("node left position: " + node.getAttributes().getNamedItem("left").getNodeValue());
            }
        }
        return value;
    }

    public String getMISMO(String xmlPath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlPath);

        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();

        XPathExpression expr = xpath.compile("//text[text()='Property Address']");
        Element e = (Element) xpath.evaluate("//text[text()='Property Address']", doc,
                XPathConstants.NODE);
        System.out.println(((Element) e.getParentNode()).getAttribute("number"));
        System.out.println(e.getAttribute("top"));

        /*        
            NodeList nl = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            System.out.println("Nodes: " + nl.getLength());
            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                System.out.println("============");
                System.out.println(node.getParentNode().getAttributes().getLength());
                System.out.println(node.getParentNode().getAttributes().item(2).getNodeValue());
                System.out.println(node.getFirstChild());
            }
         */
        return null;
    }

    public static void main(String[] args) throws Exception {
        String xmlPath = "/Users/sansari/Documents/mismo/PADULa+Appraisal.xml";
        MISMO mismo = new MISMO();
        mismo.getMismoData(xmlPath);
    }

}
