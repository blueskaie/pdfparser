/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import com.accure.mismo.pojo.VALUATIONRESPONSE;
import java.io.File;
import java.util.UUID;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author sansari
 */
public class MIMSOCreator {

    public String create(String input, String output) throws Exception{

        VALUATIONRESPONSE valuationResponse = new VALUATIONRESPONSE();

        valuationResponse.setPARTIES(null);
        valuationResponse.setAPPRAISALREVIEW(null);
        valuationResponse.setAPPRAISALUPDATE(null);
        valuationResponse.setMISMOVersionID(null);
        valuationResponse.setPROPERTY(null);
        valuationResponse.setREPORT(null);
        valuationResponse.setVALUATION(null);
        valuationResponse.setVALUATIONMETHODS(null);
        String filePath = toXML(output, valuationResponse);
        return filePath;
    }

    public String toXML(String outputDir, VALUATIONRESPONSE valuationResponse) throws Exception {
        String filePath = outputDir+"/"+UUID.randomUUID().toString()+".xml";
        File file = new File(filePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(VALUATIONRESPONSE.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(valuationResponse, file);
        //jaxbMarshaller.marshal(customer, System.out);
        return filePath;
    }
    
    public static void main(String[] args) throws Exception{
        MIMSOCreator mc = new MIMSOCreator();
        mc.create(null, "/Users/sansari/xmldir");
    }
}
