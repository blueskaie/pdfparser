/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author sansari
 */
public class Mapping {

    public static Iterable<CSVRecord> readMapping() throws Exception {
        Reader in = new FileReader("mapping");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        return records;
    }

    public static void main(String[] args) throws Exception{
        Mapping mapping = new Mapping();
        Iterable<CSVRecord> records = mapping.readMapping();
       Iterator<CSVRecord> it = records.iterator();
        while(it.hasNext()){
            CSVRecord record = it.next();
            
            System.out.println(record.toMap());
        }
    }
}
