/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import com.accure.mismo.pojo.PARTIES;
import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author sansari
 */
public class Party {

    public PARTIES getParty() {
        PARTIES parties = new PARTIES();
       // parties.set
        return parties;
    }

    public Iterable<CSVRecord> readMapping() throws Exception{
        Reader in = new FileReader("parties_mapping");
        Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        return records;
    }
}
