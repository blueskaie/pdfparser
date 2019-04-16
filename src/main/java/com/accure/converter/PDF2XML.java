/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.converter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author sansari
 */
public class PDF2XML extends PDFTextStripper {

    String rootTag = "pdf";
    String pageTag = "page";
    String phraseTag = "phrase";
    static Document doc = null;
    static Element rootElement = null;
    static Element page = null;
    static int pageNumber = 0;

    public PDF2XML() throws Exception {
    }

    public Document toXMLDoc(String pdfFilePath) throws Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        doc = docBuilder.newDocument();
        rootElement = doc.createElement("pdf");
        doc.appendChild(rootElement);

        try {
            document = PDDocument.load(new File(pdfFilePath));
            int numberOfPages = document.getNumberOfPages();
            System.out.println("Number of pages in pdf: " + numberOfPages);

            for (int i = 1; i < numberOfPages + 1; i++) {
                System.out.println("Starting Page number " + i);

                pageNumber = i;
                page = doc.createElement("page");
                rootElement.appendChild(page);
                page.setAttribute("number", pageNumber + "");

                PDFTextStripper stripper = new PDF2XML();
                stripper.setSortByPosition(true);
                stripper.setStartPage(i);
                stripper.setEndPage(i);

                Writer writer = new OutputStreamWriter(new ByteArrayOutputStream());
                stripper.writeText(document, writer);

            }

            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                document.close();
            }
        }
        return doc;
    }

    public String toString(Document document) throws Exception {
        System.out.println("XML conversion completed.");
            StringWriter sw = new StringWriter();
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            

            DOMSource source = new DOMSource(document);
            //StreamResult result = new StreamResult(new File("C:\\file.xml"));
            StreamResult result = new StreamResult(sw);
            transformer.transform(source, result);
            String xml = sw.toString();
            return xml;
    }
    
    /**
     * Override the default functionality of PDFTextStripper.writeString()
     */
    @Override
    protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
        Element phraseElement = doc.createElement("phrase");
        page.appendChild(phraseElement);
        phraseElement.appendChild(doc.createTextNode(str));

        for (int i = 0; i < textPositions.size(); i++) {
            TextPosition text = textPositions.get(i);
            if (i == 0) {
                phraseElement.setAttribute("x0", (int)text.getXDirAdj() + "");
                phraseElement.setAttribute("y0", (int)text.getYDirAdj() + "");
                phraseElement.setAttribute("height0", (int)text.getHeightDir() + "");
                phraseElement.setAttribute("width0", (int)text.getWidthDirAdj() + "");

            }

            if (i == textPositions.size() - 1) {
                phraseElement.setAttribute("x1", (int)text.getXDirAdj() + "");
                phraseElement.setAttribute("y1", (int)text.getYDirAdj() + "");
                phraseElement.setAttribute("height1", (int)text.getHeightDir() + "");
                phraseElement.setAttribute("width1", (int)text.getWidthDirAdj() + "");

            }

        }
    }

    public String toXML(Map<String, List<Map<String, Object>>> bagOfWord) throws Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("pdf");
        doc.appendChild(rootElement);
        Set<String> keys = bagOfWord.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String pageNumber = it.next();
            Element page = doc.createElement("page");
            rootElement.appendChild(page);
            page.setAttribute("number", pageNumber);
            List<Map<String, Object>> phrases = bagOfWord.get(pageNumber);
            for (int i = 0; i < phrases.size(); i++) {
                Map<String, Object> phrase = phrases.get(i);
                Set<String> keysAgain = phrase.keySet();
                Iterator<String> itAgain = keysAgain.iterator();
                Element phraseElement = doc.createElement("phrase");
                page.appendChild(phraseElement);
                while (itAgain.hasNext()) {
                    String k = itAgain.next();
                    Object v = phrase.get(k);

                    if (k.equalsIgnoreCase("phrase")) {
                        phraseElement.appendChild(doc.createTextNode(v.toString()));

                    } else {
                        phraseElement.setAttribute(k, v.toString());
                    }
                }
            }
        }
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        //StreamResult result = new StreamResult(new File("C:\\file.xml"));

        // Output to console for testing
        StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

        return null;

    }

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
//        String fileName = "/Users/sansari/Downloads/1.pdf";
        String fileName = "/Users/sansari/Documents/mismo/PADULa+Appraisal.pdf";
//       String fileName = "/Users/sansari/Documents/mismo/ROMEU APPRAISAL_5623412.pdf";
//        String fileName = "/Users/sansari/Documents/mismo/mercury_Uniform_Residential_Appraisal_(FNMA_1004)_Appraisal_Report.pdf";
        PDF2XML pdf = new PDF2XML();
        Document dcx = pdf.toXMLDoc(fileName);
        System.out.println(pdf.toString(dcx));
        System.out.println("Time taken: " + (System.currentTimeMillis() - s));
        
    }

}
