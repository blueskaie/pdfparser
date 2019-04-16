/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.converter;

import com.accure.mismo.util.CSVUtil;
import com.accure.mismo.util.Mapping;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
public class XPath2MISMO {

    private XPath xpath = null;

    static Document doc = null;
    static final String xpathMappingFilePath = "xpathmapping.csv";
    static List<Map<String, String>> missingNodeList = null;
    static final String mappingPath = "mapping.csv";
    static final String pdfFileName = "E:/MyWorks/Others/java/dataextractor/testdata/PADULa+Appraisal.pdf";

    public XPath2MISMO() throws Exception {
        XPathFactory xPathfactory = XPathFactory.newInstance();
        xpath = xPathfactory.newXPath();
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        doc = docBuilder.newDocument();
    }

    public String create() throws Exception {
        
        

        /*------ */
        // Map<String, String> fieldValueMap = csvUtil.fieldValueToMap(fieldValueMappingFilePath, 0, 1);
        PDF2XML pdf = new PDF2XML();
        Document dcx = pdf.toXMLDoc(pdfFileName);
        //System.out.println(pdf.toString(dcx));

        Map<String, String> fieldValueMap = new Mapping().pdfToMap(mappingPath, dcx);
        
        String xml = null;
        CSVUtil csvUtil = new CSVUtil();
        Iterable<CSVRecord> xpaths = csvUtil.getCSVRecords(xpathMappingFilePath);

        for (CSVRecord record : xpaths) {
            missingNodeList = new ArrayList<>();
            String page = record.get("FormPage");
            String fieldNum = record.get("FormReferenceNumber");
            //String defaultValue = record.get("DefaultValue");
            String xpath = record.get("XPath");

            String attributeOrText = xpath.substring(xpath.lastIndexOf("/") + 1);
            String attributeCandiValue = "";
            String checkedValue = "";
            String uncheckedValue = "";
            System.out.println("attributeOrText:" + attributeOrText);
            String parentNodeXpath = xpath.substring(0, xpath.lastIndexOf("/"));
            System.out.println("parentNodeXpath:" + parentNodeXpath);
            
            if(attributeOrText.contains("[") && attributeOrText.contains("]")){
                attributeOrText = "";
                parentNodeXpath = xpath;
            }
            
            if(attributeOrText.contains(",")){
                attributeCandiValue = attributeOrText.substring(attributeOrText.lastIndexOf(",") + 1);
                attributeOrText = attributeOrText.substring(0, attributeOrText.lastIndexOf(","));
                if (attributeCandiValue.contains("|")){
                    checkedValue = attributeCandiValue.substring(0, attributeCandiValue.lastIndexOf("|"));
                    uncheckedValue = attributeCandiValue.substring(attributeCandiValue.lastIndexOf("|") + 1);
                } else {
                    checkedValue = attributeCandiValue;
                }
            }

            //Get the parent node using xpath
            NodeList parentNodes = getOrCreateNodes(parentNodeXpath);
            if (parentNodes != null && parentNodes.item(0) != null) {
                //System.out.println("Node name:" + parentNodes.item(0).getNodeName());
                int size = parentNodes.getLength();
                for (int i = 0; i < size; i++){
                    Node candidateNode = parentNodes.item(i);
                    System.out.println("Name:" + candidateNode.getNodeName());
                    Element e = (Element) candidateNode;
                                            
                    String cvalue = fieldValueMap.get(page + "_" + fieldNum);

                    if (attributeOrText.startsWith("@")) {
                        cvalue = getAttribute(attributeOrText.substring(1, attributeOrText.length()), cvalue);
                        
                        if (attributeCandiValue.isEmpty()){
                            e.setAttribute(attributeOrText.substring(1, attributeOrText.length()), cvalue);
                        } else if (fieldValueMap.containsKey(page + "_" + fieldNum)){
                            e.setAttribute(attributeOrText.substring(1, attributeOrText.length()), checkedValue);
                        } else if (!uncheckedValue.isEmpty()) {
                            e.setAttribute(attributeOrText.substring(1, attributeOrText.length()), uncheckedValue);
                        }
                    } else {
                        candidateNode.setTextContent(cvalue);
                    }
                }
            }
        }

        /* ---- Only for display---- */
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
//        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        doc.setXmlStandalone(true);
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("E:/MyWorks/Others/java/dataextractor/testdata/final.xml"));

        // Output to console for testing
//        StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);
        /* ------ display ends */
        return xml;
    }
    private String getItems(String str, String regex, int index) {
        if (str == null) return null;
        String[] strarray = str.split(regex);
        if (!str.contains(regex)) return str;
        if (strarray.length > index) 
            return strarray[index]; 
        else 
            return "";
    }
    public String getAttribute(String attribute, String cvalue){
        String result = cvalue;
        switch (attribute) {
            case "GSEBelowGradeTotalSquareFeetNumber":
                result = getItems(result, "sf", 0);
                break;
            case "GSEBelowGradeFinishSquareFeetNumber":
                result = getItems(result, "sf", 1);
                break;
            case "GSEBasementExitType":
                result = getItems(result, "sf", 2);
                if (result.equals("wo"))
                    result = "WalkOut";
                else if (result.equals("wu"))
                    result = "WalkUp";
                else if (result.equals("in"))
                    result = "InteriorOnly";
                break;
            case "GSEBelowGradeRecreationRoomCount":
                //1rr0br1.0ba1o
                result = getItems(result, "rr", 0); //RecreationRoom
                break; 
            case "GSEBelowGradeBedroomRoomCount":
                result = getItems(result, "rr", 1); //RecreationRoom
                result = getItems(result, "br", 0); //RecreationRoom
                break;  
            case "GSEBelowGradeBathroomRoomCount":
                result = getItems(result, "br", 1); //BathroomRoom
                result = getItems(result, "ba", 0); //
                break; 
            case "GSEBelowGradeOtherRoomCount":
                result = getItems(result, "ba", 1);
                result = getItems(result, "o", 0);
                break; 
            case "GSEListingStatusType":
                result = getItems(result, ";", 0);
                if (!result.isEmpty()) result = result.substring(0,1);
                if (result.equals("e")) result = "Expired";
                if (result.equals("w")) result = "Withdrawn";
                if (result.equals("c")) result = "Contract";
                if (result.equals("s")) result = "SettledSale";
                break; 
            case "GSEFinancingTypeOtherDescription":
                result = "";
                break;
            case "GSEDataSourceDescription":
                result = getItems(result, ";", 0);
                break;
            case "GSEDaysOnMarketDescription":
                result = getItems(result, ";", 1);
                result = getItems(result, "DOM ", 1);
                break;
            case "GSEShortDateDescription":
                result = getItems(result, ";", 0);
                if (!result.isEmpty()) result = result.substring(1, result.length());
                break;
            case "GSELocationType":
            case "GSEViewType":
                result = getItems(result, ";", 1);
                result = getItems(result, ";", 0);
                if (!result.isEmpty() && result.equals("Wtr")) result = "WaterView";
                if (!result.isEmpty() && result.equals("Pstrl")) result = "PastoralView";
                if (!result.isEmpty() && result.equals("Woods")) result = "WoodsView";
                if (!result.isEmpty() && result.equals("Prk")) result = "ParkView";
                if (!result.isEmpty() && result.equals("Glfvw")) result = "GolfCourseView";
                if (!result.isEmpty() && result.equals("CtySky")) result = "CityViewSkylineView";
                if (!result.isEmpty() && result.equals("Mtn")) result = "MountainView";
                if (!result.isEmpty() && result.equals("Res")) result = "ResidentialView";
                if (!result.isEmpty() && result.equals("CtyStr")) result = "CityStreetView";
                if (!result.isEmpty() && result.equals("Ind")) result = "IndustrialView";
                if (!result.isEmpty() && result.equals("PwrLn")) result = "PowerLines";
                if (!result.isEmpty() && result.equals("LtdSght")) result = "LimitedSight";
                break;
            case "GSEViewOverallRatingType":
            case "GSEOverallLocationRatingType":
                result = getItems(result, ";", 0);
                if (!result.isEmpty() && result.equals("N")) result = "Neutral";
                if (!result.isEmpty() && result.equals("B")) result = "Beneficial";
                if (!result.isEmpty() && result.equals("A")) result = "Adverse";
                break;
            case "GSEFinancingType":
                result = getItems(result, ";", 0);
                if (!result.isEmpty() && result.equals("FHA")) result = "FHA";
                if (!result.isEmpty() && result.equals("VA")) result = "VA";
                if (!result.isEmpty() && result.equals("Conv")) result = "Conventional";
                if (!result.isEmpty() && result.equals("Cash")) result = "Cash";
                if (!result.isEmpty() && result.equals("Seller")) result = "Seller";
                if (!result.isEmpty() && result.equals("RH")) result = "RuralHousing";
                if (!result.isEmpty() && result.equals("*")) result = "Other";
                break;
            case "GSESaleType":
                if (!result.isEmpty() && result.equals("REO")) result = "REOSale";
                if (!result.isEmpty() && result.equals("Short")) result = "ShortSale";
                if (!result.isEmpty() && result.equals("CrtOrd")) result = "CourtOrderedSale";
                if (!result.isEmpty() && result.equals("Estate")) result = "EstateSale";
                if (!result.isEmpty() && result.equals("Relo")) result = "RelocationSale";
                if (!result.isEmpty() && result.equals("NonArm")) result = "NonArmsLengthSale";
                if (!result.isEmpty() && result.equals("ArmLth")) result = "ArmsLengthSale";
                break;
            case "_City":
            case "PropertyCity":
                result = getItems(result, ", ", 0);
                break;
            case "_State":
            case "PropertyState":
                result = getItems(result, ", ", 1);
                result = getItems(result, " ", 0);
                break;
            case "_PostalCode":
            case "PropertyPostalCode":
                result = getItems(result, ", ", 1);
                result = getItems(result, " ", 1);
                break;
            case "_TotalTaxAmount":
            case "GSEPropertyTaxTotalTaxAmount":
                result = getItems(result, " ", 1);
                break;
            case "InspectionDate":
            case "_ExpirationDate":
            case "AppraiserReportSignedDate":
            case "DataSourceEffectiveDate":
            case "GSEPriorSaleDate":
            case "AppraisalEffectiveDate":
                SimpleDateFormat pref=new SimpleDateFormat("MM/dd/yyyy");  
                SimpleDateFormat newf=new SimpleDateFormat("yyyy-MM-dd");  
                try {
                    if (result != null){
                        Date realdate = pref.parse(result);
                        result = newf.format(realdate);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(XPath2MISMO.class.getName()).log(Level.SEVERE, null, ex);
                    result = "";
                }
                break;
            case "_StreetAddress":
                result = getItems(result, ",", 0);
                break;
            case "_StreetAddress2":
                result = getItems(result, ",", 1);
                break;
            case "ValueIndicatedBySalesComparisonApproachAmount":
            case "ComparableListingsPriceRangeHighAmount":
            case "ComparableListingsPriceRangeLowAmount":
            case "ComparableSalesPriceRangeHighAmount":
            case "ComparableSalesPriceRangeLowAmount":
            case "AdjustedSalesPriceAmount":
            case "PropertySalesAmount":
            case "SalePriceTotalAdjustmentAmount":
            case "SalesPricePerGrossLivingAreaAmount":
            case "PropertyAppraisedValueAmount":
            case "GrossLivingAreaSquareFeetCount":
            case "SquareFeetCount":
                if (result != null) result = result.replace("$", "");
                if (result != null) result = result.replace(",", "");
                break;
            case "CostServiceQualityRatingDescription":
                if (result != null && result.equals("GD")) result = "GOOD";
                break;
            default:
                break;
        }
         return result;
    }
    public NodeList getOrCreateNodes(String xPath) throws Exception {
        NodeList nodes = getNodes(xPath);
        if (nodes == null || nodes.getLength() < 1) {
            createMissingNodes(xPath);
        }
        nodes = getNodes(xPath);
        return nodes;
    }

    public void createMissingNodes(String xpath) throws Exception {
        NodeList nodeList = null;
        Map<String, String> missingMap = new HashMap<>();
        String lastElement = xpath.substring(xpath.lastIndexOf("/") + 1);
        String parentNodeXpath = xpath.substring(0, xpath.lastIndexOf("/"));
        //split with value tags and create a map and add to the missing list
        if (lastElement.contains("[") && lastElement.contains("]")) {
            String elementName = lastElement.substring(0, lastElement.indexOf("["));
            String elementValue = lastElement.substring(lastElement.indexOf("[") + 1, lastElement.length() - 1);

            missingMap.put("element", elementName);
            missingMap.put("elementValue", elementValue);
        } else if (!parentNodeXpath.equals("")) {
            missingMap.put("element", lastElement);
        }
        if (!missingMap.isEmpty()) {
            missingNodeList.add(missingMap);
        }

        NodeList parentNodeList = null;
        Node parentNode = null;

        if (parentNodeXpath != null && parentNodeXpath.trim().equals("")) {
            Node root = doc.createElement(lastElement);
            doc.appendChild(root);
            parentNodeList = getNodes(xpath);
        } else {
            parentNodeList = getNodes(parentNodeXpath);
        }

        if (parentNodeList != null && parentNodeList.getLength() > 0) {
            parentNode = parentNodeList.item(parentNodeList.getLength() - 1);
        }

        if (parentNode != null) {
            //parentNode = parentNodeList.item(parentNodeList.getLength() - 1);
            // append missing children
            for (int i = missingNodeList.size() - 1; i >= 0; i--) {
                missingMap = missingNodeList.get(i);
                Node node = doc.createElement(missingMap.get("element"));
                parentNode = parentNode.appendChild(node);
                if (missingMap.containsKey("elementValue")) {
                    String valueStringFull = missingMap.get("elementValue");
                    String[] valueStringComponents = valueStringFull.split(" and ");
                    for (int m = 0; m < valueStringComponents.length; m++) {
                        String valueString = valueStringComponents[m];
                        //-----------------------
                        if (valueString.contains("=")) {
                            String[] valueSplit = valueString.split("=");
                            if (valueSplit[0].contains("@")) {
                                String attribute = valueSplit[0].substring(1, valueSplit[0].length());
                                String value = valueSplit[1].replaceAll("'", "").replaceAll("\"", "");
                                Element e = (Element) node;
                                e.setAttribute(attribute, value);
                            }
                        }
                        //---------------------

                    }

                }
            }

        } else {
            createMissingNodes(parentNodeXpath);
        }

    }

    //This method is not used
    public NodeList createMissingNodes2(String xpath) throws Exception {
        String[] tags = xpath.split("/");
        List<String> missedNodes = new ArrayList<>();
        NodeList nodes = null;
        for (int i = tags.length - 1; i > 1; i--) {
            if (tags[i].equals("")) {
                System.out.println("tag is the root: " + tags[i]);
            } else {
                System.out.println("Tag is: " + tags[i]);
                String subPath = xpath.substring(0, xpath.indexOf(tags[i]));
                System.out.println("subpath: " + subPath);
                NodeList intermediateNodes = null;
                if (i > 1) {
                    intermediateNodes = getNodes(subPath.substring(0, subPath.length() - 1));
                }
                if (intermediateNodes != null && intermediateNodes.getLength() > 0) {
                    System.out.println("Found node. adding child to it");
                    Node node = doc.createElement(tags[i]);

                    intermediateNodes.item(intermediateNodes.getLength() - 1).appendChild(node);
                    nodes = intermediateNodes;
                    System.out.println("---- breaking now==");
                    missedNodes.add(tags[i]);
                    break;
                } else {
                    missedNodes.add(tags[i]);
                    System.out.println("Did not find the tag.. ");
                }

                if (i == 2 && nodes == null) {
                    Node node = doc.createElement(tags[i - 1]);
                    Node root = doc.appendChild(node);
                    nodes = getNodes(subPath.substring(0, subPath.length() - 1));
                }
            }
        }
        if (nodes != null && missedNodes.size() > 0) {
            Node parentNode = nodes.item(nodes.getLength() - 1);
            for (int j = missedNodes.size() - 1; j >= 0; j--) {
                System.out.println("Adding child: " + missedNodes.get(j));
                Node node = doc.createElement(missedNodes.get(j));
                parentNode = parentNode.appendChild(node);

            }
        }

        return nodes;
    }

    public NodeList getNodes(String xPath) throws Exception {
        XPathExpression expr = xpath.compile(xPath);
        NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

        return nodes;
    }

    public static void main(String[] args) throws Exception {
        XPath2MISMO mismo = new XPath2MISMO();
        mismo.create();
    }

}
