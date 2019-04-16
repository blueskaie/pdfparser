/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accure.converter;

/**
 *
 * @author sansari
 */
import java.io.File;
import javax.imageio.ImageIO;
import org.apache.pdfbox.cos.COSName;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;

@SuppressWarnings({"unchecked", "rawtypes", "deprecation"})
public class PDF2Image {
    
    

    public static void main(String[] args) throws Exception{
        PDDocument document = PDDocument.load(new File("/Users/sansari/Documents/mismo/PADULa+Appraisal.pdf"));
    PDPageTree list = document.getPages();
    for (PDPage page : list) {
        PDResources pdResources = page.getResources();
        for (COSName c : pdResources.getXObjectNames()) {
            PDXObject o = pdResources.getXObject(c);
            if (o instanceof org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject) {
                File file = new File("/Users/sansari/imagefrompdf/" + System.nanoTime() + ".png");
                ImageIO.write(((org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject)o).getImage(), "png", file);
            }
        }
    }
    }
}
