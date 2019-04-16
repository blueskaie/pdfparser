/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo.util;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author sansari
 */
public class CSVUtil {

    public Iterable<CSVRecord> getCSVRecords(String path) throws Exception {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(path).getFile());
        Reader in = new FileReader(file);
        Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader().parse(in);
        return records;
    }

    public Map<String, String> fieldValueToMap(String path, int keyindex, int valueindex) throws Exception {
        Map<String, String> dataMap = new HashMap<>();
        Iterable<CSVRecord> records = getCSVRecords(path);

        for (CSVRecord record : records) {
           dataMap.put(record.get(keyindex), record.get(valueindex));
        }

        return dataMap;
    }

    public static void main(String[] args) throws Exception {

        /*    String path = "xpathmapping.csv";
        Iterable<CSVRecord> records = new CSVUtil().getCSVRecords(path);
        
        for(CSVRecord record : records){
            
            System.out.println(record.get("XPath"));
            System.out.println(record.get("FormReferenceNumber"));
        }
         */
        
        String path = "fieldvaluemapping.csv";
        System.out.println(new CSVUtil().fieldValueToMap(path, 0,1));
    }

}
