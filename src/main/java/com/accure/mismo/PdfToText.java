/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.mismo;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an example on how to get the x/y coordinates and size of each
 * character in PDF
 */
public class PdfToText extends PDFTextStripper {

    static List<String> words = null;

    public PdfToText() throws IOException {
        words = new ArrayList<String>();
    }

    public List<String> getPDFTextData(String pdfFile) throws Exception {
        PDDocument document = null;
        try {
            document = PDDocument.load(new File(pdfFile));
            PDFTextStripper stripper = new PdfToText();
            stripper.setSortByPosition(true);
            stripper.setStartPage(0);
            stripper.setEndPage(document.getNumberOfPages());

            Writer writter = new OutputStreamWriter(new ByteArrayOutputStream());
            stripper.writeText(document, writter);

        } finally {
            if (document != null) {
                document.close();
            }
        }
        return words;
    }

    /**
     * Override the default functionality of PDFTextStripper.writeString()
     */
    @Override
    protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
        System.out.println("=============================================================================");
        //       System.out.println(str);     
//            String[] wordsInStream = str.split(getWordSeparator());
        String[] wordsInStream = str.split("\n");
        if (wordsInStream != null) {
            for (String word : wordsInStream) {
                words.add(word);
            }
        }
        System.out.println("========= For string: " + str);
        for (TextPosition text : textPositions) {
            System.out.println(text.getUnicode() + " [(X=" + text.getXDirAdj() + ",Y="
                    + text.getYDirAdj() + ") height=" + text.getHeightDir() + " width="
                    + text.getWidthDirAdj() + "]" + " of character: " + text.getUnicode());
        }
        System.out.println("========= For ending string: " + str);
    }

    public static void main(String[] args) throws Exception {
//        String str = "helloslkhellodjladfjhello";
//        String findStr = "hello";
//        System.out.println(str.split(findStr, -1)[2]);

        String fileName = "/Users/sansari/Documents/mismo/mercury_Uniform_Residential_Appraisal_(FNMA_1004)_Appraisal_Report.pdf";
        PdfToText p2t = new PdfToText();
        List<String> txt = p2t.getPDFTextData(fileName);
        System.out.println(txt);

    }

}
