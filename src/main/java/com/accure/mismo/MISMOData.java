/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author sansari
 */
public class MISMOData {

    static List<String> dataList = new ArrayList<>();
    static Map<String, String> dataMap = new HashMap<>();
    static Map<String, String> mismoDataMap = new HashMap<>();
    static Iterable<CSVRecord> mappings = null;

    public String getMismoData(String pdfFile, String outputPath) throws Exception {
        String mismoXMLPath = null;
//  1. Get pdf text as a list
        dataList = new PdfToText().getPDFTextData(pdfFile);

//  3. Load mapping file containing the current and next label list (as per mismo pdf form)
        mappings = Mapping.readMapping();
//  4. For each work in the list, determine the value of the label or form field
        getFieldData();
//  5. Set the values of MIMSMO objects
//  6. Convert into xml
        return mismoXMLPath;
    }

    public void getFieldData() {
        Iterator<CSVRecord> it = mappings.iterator();
        while (it.hasNext()) {
            CSVRecord mapping = it.next();
            if (mapping.size() > 2) {
                String value = null;
                String label = mapping.get("label");
                String nextlabel = mapping.get("nextlabel");
                int labelIndex = dataList.indexOf(label);
                
                int nextlabelIndex = -1;
//  If nextlabel=_NEXT, take the next item from the dataList as the value of the lable
                if (nextlabel.equals("_NEXT")) {
                    nextlabelIndex = labelIndex + 2;
                } else {
                    nextlabelIndex = dataList.indexOf(nextlabel);
                }

//  Get the data from the nextlabel index if its not -1
                    for (int i = labelIndex + 1; i < nextlabelIndex; i++) {
                        if (value != null) {
                            value = value + "|" + dataList.get(i);
                        } else {
                            value = dataList.get(i);
                        }
                    }
               
                mismoDataMap.put(label, value);
                
            }

        }
        System.out.println(new Gson().toJson(mismoDataMap));
    }

    public static void main(String[] args) throws Exception {
        
        String fileName = "/Users/sansari/Documents/mismo/PADULa+Appraisal.pdf";
        //String fileName = args[0];
        MISMOData md = new MISMOData();
        md.getMismoData(fileName, null);
        //System.out.println(dataList);
    }

}
