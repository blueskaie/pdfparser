/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo.util;

import com.accure.converter.PDF2XML;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.csv.CSVRecord;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author sansari
 */
public class Mapping {

    private XPath xpath = null;
    private static final int tinyX = 10;
    private static final int smallX = 30;
    private static final int midX = 40;
    private static final int largeX = 50;
    private static final int tinyHeightMargin = 2;
    private static final int heightMargin = 10;
    private static final int heightPositionMargin = 15;

    public Mapping() {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        xpath = xPathfactory.newXPath();
    }

    public Map<String, String> pdfToMap(String mappingPath, Document doc) throws Exception {
        Map<String, String> dataMap = new HashMap<>();
        CSVUtil util = new CSVUtil();
        Iterable<CSVRecord> records = util.getCSVRecords(mappingPath);
        for (CSVRecord record : records) {
            dataMap.putAll(getValueFromXPath(record, doc));
        }

        return dataMap;
    }

    public Map<String, String> getValueFromXPath(CSVRecord record, Document doc) throws Exception {
        Map<String, String> recordMap = new HashMap<>();
        String page = record.get("page");
        String type = record.get("type");
        String id = record.get("id");
        String label = record.get("label");
        String alternatelabel = record.get("alternatelabel");
        String option = record.get("option");
        String alternateoption = record.get("alternateoption");
        String position = record.get("position");
        String value = record.get("value");
        String nextlabel = record.get("nextlabel");
        String numlines = record.get("numlines");
        String length = record.get("length");
        String lineseparator = record.get("lineseparator");
        String fieldseparator = record.get("fieldseparator");
        String occurance = record.get("occurance");
        
        if (id.equals("115") && page.equals("1")){
            int here = 99;
        }
        int numlinesint = 1;
        
        if (numlines != null && !numlines.equals("")) {
            numlinesint = Integer.parseInt(numlines);
        }

        if (alternatelabel == null || alternatelabel.equals("")) {
            alternatelabel = label;
        }
        if (alternateoption == null || alternateoption.equals("")) {
            alternateoption = option;
        }
        if (lineseparator == null || lineseparator.equals("")) {
            lineseparator = "";
        }
        if (fieldseparator == null || fieldseparator.equals("")) {
            fieldseparator = "";
        }

        if (type != null && type.equalsIgnoreCase("fixed")) {
            recordMap.put(page + "_" + id, value);
        } else if (type != null && type.equalsIgnoreCase("text")) {
            String xpathExpression = "//page[@number='" + page + "']/phrase[text()=\"" + label + "\" or text()=\""+alternatelabel+"\"]";
            XPathExpression expr = xpath.compile(xpathExpression);

            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < nodes.getLength(); i++) {
                if (!occurance.isEmpty()){
                    if (i != Integer.parseInt(occurance)-1)
                        continue;
                }
                Node node = nodes.item(i);
                String x0 = node.getAttributes().getNamedItem("x0").getNodeValue();
                String x1 = node.getAttributes().getNamedItem("x1").getNodeValue();
                String y0 = node.getAttributes().getNamedItem("y0").getNodeValue();
                String y1 = node.getAttributes().getNamedItem("y1").getNodeValue();
                String h0 = node.getAttributes().getNamedItem("height0").getNodeValue();
                String w0 = node.getAttributes().getNamedItem("width0").getNodeValue();

                System.out.println(x0 + ":" + y0 + ":" + x1 + ":" + y1 + ":" + h0);
//===                

                String nodeValue = "";
                int lowerX = 0;
                int upperX = 0;
                int lowerY = Integer.parseInt(y0) - Integer.parseInt(h0);
                int upperY = Integer.parseInt(y0) + heightMargin;

//  Loop for lines starts 
                
                for (int k = 0; k < numlinesint; k++) {
                    if (position != null && position.equalsIgnoreCase("left")) {
                        upperX = Integer.parseInt(x0);
                        lowerX = upperX - largeX;
                        if (length != null && !length.equals("")) {
                            lowerX = upperX - tinyX - Integer.parseInt(w0) * Integer.parseInt(length);
                        } else {
                            lowerX = upperX - largeX;
                        }
                    } else if (position != null && position.equalsIgnoreCase("down") && k == 0) {
                        upperX = Integer.parseInt(x0);
                        lowerX = upperX - tinyX;
                        lowerY = lowerY + Integer.parseInt(h0) + heightMargin;
                        upperY = upperY + heightMargin;
                        if (length != null && !length.equals("")) {
                            upperX = lowerX + smallX + Integer.parseInt(w0) * Integer.parseInt(length);
                        } else {
                            upperX = lowerX + smallX;
                        }
                    } else if (position != null && position.equalsIgnoreCase("first") && k == 0) {
                        upperX = 590;
                        lowerX = 40;
                        lowerY = lowerY + Integer.parseInt(h0) + heightMargin;
                        upperY = upperY + heightMargin;
                    } else if (k == 0) {
                        lowerX = Integer.parseInt(x1);
                        upperX = lowerX;
                        if (length != null && !length.equals("")) {
                            upperX = upperX + tinyX + Integer.parseInt(w0) * Integer.parseInt(length);
                        } else {
                            upperX = upperX + smallX;
                        }
                        System.out.println("k=0");
                    }
                    if (position != null && position.equalsIgnoreCase("down") && k > 0) {
                        upperX = Integer.parseInt(x0);
                        lowerX = upperX - tinyX;
                        lowerY = lowerY + Integer.parseInt(h0) + heightMargin;
                        upperY = upperY + heightMargin;
                    } else if (position != null && position.equalsIgnoreCase("first") && k > 0) {
                        upperX = 580;
                        lowerX = 40;                        
                        lowerY = lowerY + heightMargin;
                        upperY = upperY + heightMargin;
                    } else if (k > 0) {
                        lowerX = Integer.parseInt(x0) - tinyX;
                        upperX = lowerX + Integer.parseInt(w0) * Integer.parseInt(length);
                        lowerY = lowerY + heightMargin;
                        upperY = upperY + heightMargin;
                    }

                    String xpathExpressionValue = "//page[@number='" + page + "']/phrase[@x0 > " + lowerX + " and @x0 < " + upperX + " and @y0 > " + lowerY + " and @y0 < " + upperY + "]";
                    System.out.println("Xpath exp: " + xpathExpressionValue);
                    XPathExpression exprValue = xpath.compile(xpathExpressionValue);
                    NodeList nodesValue = (NodeList) exprValue.evaluate(doc, XPathConstants.NODESET);
                    
                    for (int j = 0; j < nodesValue.getLength(); j++) {
                        Node valueNode = nodesValue.item(j);
                        if (valueNode != null) {
                            nodeValue = nodeValue + valueNode.getTextContent();
                            nodeValue = nodeValue + fieldseparator;
                        }
                    }
                    if (!nodeValue.equals("")) {
                        nodeValue = nodeValue + lineseparator;
                    }
                }
                
//                loop for lines end
                if (!nodeValue.equals("")) {
                    
                    System.out.println("====== value node for " + node.getTextContent() + " is " + nodeValue);
                    System.out.println(id);
                    recordMap.put(page + "_" + id, nodeValue);
                } else {
                    System.out.println("====== value node for " + node.getTextContent() + " is " + nodeValue);
                    System.out.println(id);
                }
//===

            }
        } else if (type != null && type.equalsIgnoreCase("checkbox")) {

            String xpathExpressionLabel = "//page[@number='" + page + "']/phrase[text()='" + label + "' or text()='" + alternatelabel + "']";
            XPathExpression exprLabel = xpath.compile(xpathExpressionLabel);
            NodeList nodesLabel = (NodeList) exprLabel.evaluate(doc, XPathConstants.NODESET);

            String xpathExpressionOption = "//page[@number='" + page + "']/phrase[text()='" + option + "' or text()='" + alternateoption + "']";
            XPathExpression exprOption = xpath.compile(xpathExpressionOption);
            NodeList nodesOption = (NodeList) exprOption.evaluate(doc, XPathConstants.NODESET);

            if (label == null || label.equalsIgnoreCase("")) {
                for (int i = 0; i < nodesOption.getLength(); i++) {
                    if (!occurance.isEmpty()){
                        if (i != Integer.parseInt(occurance)-1)
                            continue;
                    }
                    Node nodeOption = nodesOption.item(i);
                    String x0 = nodeOption.getAttributes().getNamedItem("x0").getNodeValue();
                    String x1 = nodeOption.getAttributes().getNamedItem("x1").getNodeValue();
                    String y0 = nodeOption.getAttributes().getNamedItem("y0").getNodeValue();
                    String y1 = nodeOption.getAttributes().getNamedItem("y1").getNodeValue();
                    String h0 = nodeOption.getAttributes().getNamedItem("height0").getNodeValue();
                    System.out.println(x0 + ":" + y0 + ":" + x1 + ":" + y1);
                    Node sibling = null;
                    if (position.equalsIgnoreCase("left")) {
                        sibling = nodeOption.getPreviousSibling();
                    } else {
                        sibling = nodeOption.getNextSibling();
                    }
                    if (sibling == null) {
                        continue;
                    }
                    String sx0 = sibling.getAttributes().getNamedItem("x0").getNodeValue();
                    String sx1 = sibling.getAttributes().getNamedItem("x1").getNodeValue();
                    String sy0 = sibling.getAttributes().getNamedItem("y0").getNodeValue();
                    String sy1 = sibling.getAttributes().getNamedItem("y1").getNodeValue();
                    String sh0 = sibling.getAttributes().getNamedItem("height0").getNodeValue();
                    String svalue = sibling.getTextContent();
                    System.out.println(sx0 + ":" + sy0 + ":" + sx1 + ":" + sy1 + ":" + svalue);

                    if (position.equalsIgnoreCase("left") && Math.abs(Integer.parseInt(y0) - Integer.parseInt(sy0)) <= Integer.parseInt(h0) && Integer.parseInt(x0) > Integer.parseInt(sx0) && (Integer.parseInt(x0) - Integer.parseInt(sx1)) <= 20 && svalue.equals(value)) {
                        recordMap.put(page + "_" + id, option);
                        System.out.println("======= left side checkbox processing with yes ======");
                        System.out.println(nodeOption.getTextContent() + ":" + sibling.getTextContent());

                    } else if (position.equalsIgnoreCase("right") && Math.abs(Integer.parseInt(y0) - Integer.parseInt(sy0)) <= Integer.parseInt(h0) && Integer.parseInt(sx0) > Integer.parseInt(x1) && (Integer.parseInt(sx0) - Integer.parseInt(x1)) <= 20 && svalue.equals(value)) {
                        recordMap.put(page + "_" + id, option);
                        System.out.println("======= right side checkbox processing with yes ======");
                        System.out.println(nodeOption.getTextContent() + ":" + sibling.getTextContent());

                    } else {
                        System.out.println("======= checkbox processing with no ======");
                        System.out.println(nodeOption.getTextContent() + " is not checked");
                    }
                }
            } else {
                for (int i = 0; i < nodesLabel.getLength(); i++) {
                    Node nodeLabel = nodesLabel.item(i);
                    String x0 = nodeLabel.getAttributes().getNamedItem("x0").getNodeValue();
                    String x1 = nodeLabel.getAttributes().getNamedItem("x1").getNodeValue();
                    String y0 = nodeLabel.getAttributes().getNamedItem("y0").getNodeValue();
                    String y1 = nodeLabel.getAttributes().getNamedItem("y1").getNodeValue();
                    String h0 = nodeLabel.getAttributes().getNamedItem("height0").getNodeValue();
                    System.out.println(nodeLabel.getTextContent() + ":" + x0 + ":" + y0 + ":" + x1 + ":" + y1 + ":" + h0);

                    int lowerOY = (Integer.parseInt(y0) - Integer.parseInt(h0));
                    int upperOY = (Integer.parseInt(y0) + Integer.parseInt(h0));

                    if (position != null && position.equalsIgnoreCase("down")) {
                        lowerOY = Integer.parseInt(y0) - numlinesint * (Integer.parseInt(h0) + heightMargin);
                        upperOY = lowerOY + heightMargin;
                        System.out.println("Lower y: " + lowerOY + " Upper Y: " + upperOY);
                    }
                    //Find the option within the label height
                    String xpathExpressionOption1 = "//page[@number='" + page + "']/phrase[@y0 < " + upperOY + " and @y0 > " + lowerOY + " and (text()='" + option + "' or text()='" + alternateoption + "')]";
                    XPathExpression exprOption1 = xpath.compile(xpathExpressionOption1);
                    NodeList nodesOption1 = (NodeList) exprOption1.evaluate(doc, XPathConstants.NODESET);
                    Node optionNode = null;
                    if (occurance.isEmpty())
                        optionNode = nodesOption1.item(0);
                    else
                        optionNode = nodesOption1.item(Integer.parseInt(occurance)-1);
                    if (optionNode != null) {
                        System.out.println("========= Option node content: " + optionNode.getTextContent());

                        String ox0 = optionNode.getAttributes().getNamedItem("x0").getNodeValue();
                        String ox1 = optionNode.getAttributes().getNamedItem("x1").getNodeValue();
                        String oy0 = optionNode.getAttributes().getNamedItem("y0").getNodeValue();
                        String oy1 = optionNode.getAttributes().getNamedItem("y1").getNodeValue();
                        String oh0 = optionNode.getAttributes().getNamedItem("height0").getNodeValue();

                        //Now lets get the checked checkbox value
                        int lowerX = 0;
                        int upperX = 0;
                        int lowerY = (Integer.parseInt(oy0) + Integer.parseInt(oh0));
                        int upperY = (Integer.parseInt(oy0) - Integer.parseInt(oh0));
                        if (position.equalsIgnoreCase("left")) {
                            lowerX = Integer.parseInt(ox0) - 20;
                            upperX = Integer.parseInt(ox0);
                        } else if (position.equalsIgnoreCase("right")) {
                            lowerX = Integer.parseInt(ox1);
                            upperX = Integer.parseInt(ox1) + 20;
                        } else if (position.equalsIgnoreCase("down")) {
                            lowerX = Integer.parseInt(ox0);
                            upperX = Integer.parseInt(ox1);
//                            upperY = Integer.parseInt(oy0) - numlinesint * (Integer.parseInt(oh0)) + heightMargin;
//                            lowerY = lowerY + heightMargin;
                            lowerY = (Integer.parseInt(y0) + Integer.parseInt(h0));
                            upperY = (Integer.parseInt(y0) - Integer.parseInt(h0));
                        }

                        String xpathExpressionValue = "//page[@number='" + page + "']/phrase[@y0 < " + lowerY + " and @y0 > " + upperY + " and @x0 > " + lowerX + " and @x0 < " + upperX + " and text()='" + value + "']";
                        System.out.println("------- xpath expression for check:::: " + xpathExpressionValue);
                        XPathExpression exprValue = xpath.compile(xpathExpressionValue);
                        NodeList nodesValue = (NodeList) exprValue.evaluate(doc, XPathConstants.NODESET);
                        Node valueNode = nodesValue.item(0);
                        if (valueNode != null) {
                            recordMap.put(page + "_" + id, option);
                            System.out.println(valueNode.getTextContent() + "========= Checked option for " + option + " corresponding to label " + label + " found");
                        } else {
                            System.out.println("============ checkbox value node not fount=====");
                        }

                    } else {
                        System.out.println("==== no option node found======");
                    }
                    /* boolean exitCondition = false;
                    while(!exitCondition){
                        Node nodeOptionSibling = nodeLabel.getNextSibling();
                        String osx0 = nodeOptionSibling.getAttributes().getNamedItem("x0").getNodeValue();
                        String osy0 = nodeOptionSibling.getAttributes().getNamedItem("y0").getNodeValue();
                        String siblingValue = nodeOptionSibling.getTextContent();
                        if(Math.abs(Integer.parseInt(osy0)-Integer.parseInt(y0)) > Integer.parseInt(h0) || 
                               Integer.parseInt(osx0) < Integer.parseInt(x1) ||
                                siblingValue.equalsIgnoreCase(option)){
                            exitCondition = true;
                            
                            
                        }
                    } */
 /*  
                    Node sibling = node.getPreviousSibling();
                    String sx0 = sibling.getAttributes().getNamedItem("x0").getNodeValue();
                    String sx1 = sibling.getAttributes().getNamedItem("x1").getNodeValue();
                    String sy0 = sibling.getAttributes().getNamedItem("y0").getNodeValue();
                    String sy1 = sibling.getAttributes().getNamedItem("y1").getNodeValue();
                    System.out.println(sx0 + ":" + sy0 + ":" + sx1 + ":" + sy1);

                    if (Math.abs(Integer.parseInt(y0) - Integer.parseInt(sy0)) <= 10 && Integer.parseInt(x0) > Integer.parseInt(sx0) && (Integer.parseInt(x0) - Integer.parseInt(sx1)) <= 20) {
                        recordMap.put(page + "_" + id, option);
                        System.out.println("======= checkbox processing with yes ======");
                        System.out.println(node.getTextContent() + ":" + sibling.getTextContent());

                    } else {
                        System.out.println("======= checkbox processing with no ======");
                        System.out.println(node.getTextContent() + " is not checked");
                    } */
                }

            }

        } else if (type != null && type.equalsIgnoreCase("column_text")) {
            String xpathExpression = "//page[@number='" + page + "']/phrase[text()='" + label + "' or text()='" + alternatelabel + "']";
            XPathExpression expr = xpath.compile(xpathExpression);

            NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
            int occuranceCounter = 0;
            Node columnNode = null;
            for (int i = 0; i < nodes.getLength(); i++) {
                columnNode = nodes.item(i);
                if (columnNode != null) {
                    occuranceCounter++;
                    if (occuranceCounter == Integer.parseInt(occurance)) {
                        System.out.println("Found the node " + label + " in " + occuranceCounter + " occurances");
                        break;
                    }
                }
            }
           if(columnNode != null) {
            String x0 = columnNode.getAttributes().getNamedItem("x0").getNodeValue();
            String x1 = columnNode.getAttributes().getNamedItem("x1").getNodeValue();
            String y0 = columnNode.getAttributes().getNamedItem("y0").getNodeValue();
            String y1 = columnNode.getAttributes().getNamedItem("y1").getNodeValue();
            String h0 = columnNode.getAttributes().getNamedItem("height0").getNodeValue();
            System.out.println(label + "::" + x0 + ":" + y0 + ":" + x1 + ":" + y1);
            //Lets get the next column adjescent to this node to calculate the right side boundary.
            Node siblingNode = columnNode.getNextSibling();
            String nsx0 = "10000"; // a large number so that if there is no sibling fetch utp the end of the line
            //This is sibling only if this has the same y-axis (+-2)
            if(siblingNode!=null){
                if(Math.abs(Integer.parseInt(siblingNode.getAttributes().getNamedItem("y0").getNodeValue())-Integer.parseInt(y0)) < 2){
                    nsx0 = siblingNode.getAttributes().getNamedItem("x0").getNodeValue();
                }
            }
            
            //Lets get the next left side column adjescent to this node to calculate the right side boundary.
            Node previousNode = columnNode.getPreviousSibling();
            String psx1 = "0"; // a small number so that if there is no sibling fetch from the beginning of the line
            //This is sibling only if this has the same y-axis (+-2)
            if(siblingNode!=null){
                if(Math.abs(Integer.parseInt(previousNode.getAttributes().getNamedItem("y0").getNodeValue())-Integer.parseInt(y0)) < 2){
                    psx1 = previousNode.getAttributes().getNamedItem("x1").getNodeValue();
                }
            }
            
            String xpathExpressionRow = "//page[@number='" + page + "']/phrase[text()='" + option + "' or text()='" + alternateoption + "']";
            XPathExpression exprRow = xpath.compile(xpathExpressionRow);

            NodeList nodesRow = (NodeList) exprRow.evaluate(doc, XPathConstants.NODESET);
            occuranceCounter = 0;
            Node RowNode = null;
            for (int i = 0; i < nodesRow.getLength(); i++) {
                RowNode = nodesRow.item(i);
                if (columnNode != null) {
                    occuranceCounter++;
                    if (occuranceCounter == Integer.parseInt(occurance)) {
                        System.out.println("Found the option " + option + " in " + occuranceCounter + " occurances");
                        break;
                    }
                }
            }

            String ox0 = RowNode.getAttributes().getNamedItem("x0").getNodeValue();
            String ox1 = RowNode.getAttributes().getNamedItem("x1").getNodeValue();
            String oy0 = RowNode.getAttributes().getNamedItem("y0").getNodeValue();
            String oy1 = RowNode.getAttributes().getNamedItem("y1").getNodeValue();
            String oh0 = RowNode.getAttributes().getNamedItem("height0").getNodeValue();
            System.out.println(option + "::" + ox0 + ":" + oy0 + ":" + ox1 + ":" + oy1);
            
            int lowerX = 0;//Integer.parseInt(x0) - smallX;
            int upperX = 0;//Integer.parseInt(x1) + smallX;
            if(psx1.equals("0")){
                lowerX = Integer.parseInt(x0) - tinyX;
            } else {
                lowerX = Integer.parseInt(x0) - (Integer.parseInt(x0) - Integer.parseInt(psx1))/2 ; //mid point
            }
            
            if(nsx0.equals("10000")){
                upperX = 1000;
            } else {
                upperX = (Integer.parseInt(nsx0) - Integer.parseInt(x0))/2 + Integer.parseInt(x1); //mid point
            }
            
            int lowerY = Integer.parseInt(oy0) - tinyHeightMargin;
            int upperY = Integer.parseInt(oy0) + Integer.parseInt(oh0) + tinyHeightMargin;

            String xpathExpressionValue = "//page[@number='" + page + "']/phrase[@y0 > " + lowerY + " and @y0 < " + upperY + " and @x0 > " + lowerX + " and @x1 < " + upperX + "]";
            XPathExpression exprValue = xpath.compile(xpathExpressionValue);
            System.out.println("xpath for value:  " + xpathExpressionValue);
            NodeList nodesValue = (NodeList) exprValue.evaluate(doc, XPathConstants.NODESET);
            String nodeValue = "";
            for (int j = 0; j < nodesValue.getLength(); j++) {
                Node valueNode = nodesValue.item(j);
                if (valueNode != null) {
                    nodeValue = nodeValue + valueNode.getTextContent() + lineseparator;
                    
                }
                if (!nodeValue.equals("")) {
                    System.out.println("Value node corresponding to : " + label + ":" + option +":"+nodeValue);
                    recordMap.put(page + "_" + id, nodeValue);
                }
                break; // do only once.. there is a better way of doing this.. but this is just a temp.
            }
        } else {
               System.out.println("There is no node corresponding to label " + label);
           }
        } else if (type != null && type.equalsIgnoreCase("area_text")) {
                int lowerX = 0;
                int upperX = 0;
                int lowerY = 0;
                int upperY = 0;
                if (!length.isEmpty()) {lowerX = Integer.parseInt(length);}
                if (!lineseparator.isEmpty()) {upperX = Integer.parseInt(lineseparator);}
                if (!fieldseparator.isEmpty()) {lowerY = Integer.parseInt(fieldseparator);}
                if (!occurance.isEmpty()) {upperY = Integer.parseInt(occurance);}
                String xpathExpressionValue = "//page[@number='" + page + "']/phrase[@y0 > " + lowerY + " and @y0 < " + upperY + " and @x0 > " + lowerX + " and @x1 < " + upperX + "]";
                XPathExpression exprValue = xpath.compile(xpathExpressionValue);
                System.out.println("xpath for value:  " + xpathExpressionValue);
                NodeList nodesValue = (NodeList) exprValue.evaluate(doc, XPathConstants.NODESET);
                String nodeValue = "";
                for (int j = 0; j < nodesValue.getLength(); j++) {
                    Node valueNode = nodesValue.item(j);
                    if (valueNode != null) {
                        nodeValue = nodeValue + valueNode.getTextContent();
                    }
                }
                if (!nodeValue.equals("")) {
                    System.out.println("Value node corresponding to : " + label + ":" + option +":"+nodeValue);
                    recordMap.put(page + "_" + id, nodeValue);
                }
        }
        return recordMap;
    }

    public static void main(String[] args) throws Exception {
//         String fileName = "/Users/sansari/Documents/mismo/ROMEU APPRAISAL_5623412.pdf";
//        String fileName = "/Users/sansari/Documents/mismo/PADULa+Appraisal.pdf";
        String fileName = "E:/MyWorks/Others/java/dataextractor/testdata/PADULa+Appraisal.pdf";
//        String fileName = "/Users/sansari/Documents/mismo/mercury_Uniform_Residential_Appraisal_(FNMA_1004)_Appraisal_Report.pdf";
        String mappingPath = "mapping.csv";

        PDF2XML pdf = new PDF2XML();
        Document dcx = pdf.toXMLDoc(fileName);
        //System.out.println(pdf.toString(dcx));

        Map<String, String> fieldValueMap = new Mapping().pdfToMap(mappingPath, dcx);
        
        System.out.print(fieldValueMap);
        try(FileWriter fw = new FileWriter("E:/MyWorks/Others/java/dataextractor/testdata/check_FieldsValueMap.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(fieldValueMap);
        } catch (IOException e) {
        }
    }

}
