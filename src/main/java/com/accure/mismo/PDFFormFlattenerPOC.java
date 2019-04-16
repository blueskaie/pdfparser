/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import java.io.File;
import java.util.List;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.cos.COSObject;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;

/**
 *
 * @author sansari
 */
public class PDFFormFlattenerPOC {

    public static void main(String[] args) throws Exception {
        String fileName = "/Users/sansari/Documents/mismo/mercury_Uniform_Residential_Appraisal_(FNMA_1004)_Appraisal_Report.pdf";

        //Load the document
        PDDocument pDDocument = PDDocument.load(new File(fileName));
        COSDocument cosDoc = pDDocument.getDocument();
        cosDoc.print();
        
        List<COSObject> cosObjs = cosDoc.getObjects();
        
        for(COSObject cos: cosObjs){
            System.out.println("-0-0-0-0"+cos.getItem(COSName.CATALOG));
        }
        
        PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
        //Fill the document
        if (pDAcroForm != null) {
//Flatten the document
            pDAcroForm.flatten();

//Save the document
            pDDocument.save("/Users/sansari/test/mydoc");
        }
        pDDocument.close();
    }

}
