/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.converter;

import com.accure.mismo.util.CSVUtil;
import com.accure.mismo.util.Mapping;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.csv.CSVRecord;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author sansari
 */
public class XML2MISMO {

    Map<String, String> idValueMap;

//    static String tag0 = "/VALUATION_RESPONSE/REPORT/@AppraisalFormType";
//    static String tag1 = "/VALUATION_RESPONSE/REPORT/EMBEDDED_FILE/DOCUMENT";
//    static String tag2 = "/VALUATION_RESPONSE/REPORT/@_TitleDescription";
//    static String[] tagArr = {tag0, tag1, tag2};
    static Document doc = null;
   // static final String fieldValueMappingFilePath = "fieldvaluemapping.csv";
    static final String xpathMappingFilePath = "xpathmapping.csv";
    static final String pdfFileName = "/Users/sansari/Documents/mismo/PADULa+Appraisal.pdf";
    static final String mappingPath = "mapping.csv";

    public static String createDoc() throws Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        doc = docBuilder.newDocument();

        CSVUtil csvUtil = new CSVUtil();

        /*------ */
        // Map<String, String> fieldValueMap = csvUtil.fieldValueToMap(fieldValueMappingFilePath, 0, 1);
        PDF2XML pdf = new PDF2XML();
        Document dcx = pdf.toXMLDoc(pdfFileName);
        //System.out.println(pdf.toString(dcx));

        Map<String, String> fieldValueMap = new Mapping().pdfToMap(mappingPath, dcx);

        /*--------*/
        Iterable<CSVRecord> records = csvUtil.getCSVRecords(xpathMappingFilePath);

        for (CSVRecord record : records) {
            String page = record.get("FormPage");
            String fieldNum = record.get("FormReferenceNumber");
            String tag = record.get("XPath");
            String defaultValue = record.get("DefaultValue");
            String attribValue = null;
            if (defaultValue != null && !defaultValue.equalsIgnoreCase("")) {
                attribValue = defaultValue;
            } else {
                attribValue = fieldValueMap.get(page + "_" + fieldNum);
            }

            String[] tags = tag.split("/");

            for (int i = 0; i < tags.length; i++) {
                String elementName = tags[i].trim();
                if (!elementName.isEmpty() && !elementName.equalsIgnoreCase("")) {

                    if (elementName.startsWith("@")) {
                        String attributeName = elementName.substring(1, elementName.length());
                        NodeList parentNodeList = doc.getElementsByTagName(tags[i - 1]);

                        Node parentNodeOfCurrentElement = parentNodeList.item(0);
                        Element e = (Element) parentNodeOfCurrentElement;

                        if (attribValue == null) {
                            continue;
                        }
                        if(e!=null){
                        e.setAttribute(attributeName, attribValue);
                        } else {
                            System.out.println("No parent node for "+tag);
                        }
                    } else {
                        NodeList nodeList = doc.getElementsByTagName(elementName);
                        Node node = nodeList.item(0);
                        //System.out.println("local name: " + node.getBaseURI());
                        if (node == null) {
                            System.out.println("The element is: " + elementName + " for tag " + tag);
                            node = doc.createElement(elementName);
//                            System.out.println("Node just created: " + node.getNodeName());
                            if (i > 0) {
                                if (i == 1) {
                                    // System.out.println("");
                                    Node root = doc.appendChild(node);
//                                    System.out.println("Root element: " + root.getNodeName());
                                } else {
                                    String parentNodeName = tags[i - 1];
//                                    System.out.println("Parent node is:  " + parentNodeName);
                                    NodeList parentNodeList = doc.getElementsByTagName(parentNodeName);
                                    Node parentNode = parentNodeList.item(0);
                                    if(parentNode !=null){
//                                    System.out.println("Parent Node is: " + parentNode.getNodeName());
//                                    System.out.println("Node is:  " + node.getNodeName());
                                    parentNode.appendChild(node);
                                    } else {
                                        System.out.println("No parent found for "+ tag);
                                    }
//                                    System.out.println("The value of i : " + i);
                                    if (i == (tags.length - 1)) {
//                                        System.out.println("Setting node value");
                                        node.setTextContent(attribValue);

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        DOMSource source = new DOMSource(doc);
        //StreamResult result = new StreamResult(new File("C:\\file.xml"));

        // Output to console for testing
        StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);

        return null;
    }

    public static void main(String[] args) throws Exception {

        createDoc();
    }

}
