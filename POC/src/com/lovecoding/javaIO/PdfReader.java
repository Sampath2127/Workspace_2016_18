package com.lovecoding.javaIO;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PdfReader {

	public static void main(String[] args) throws IOException {

		 try (PDDocument document = PDDocument.load(new File("C:/Users/c18477/Desktop/temp/temp2/DevaDas.pdf"))) {

	            document.getClass();

	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                //System.out.println("Text:" + st);

					// split by whitespace
	                String lines[] = pdfFileInText.split("\\r?\\n");
	                for (String line : lines) {
	                    String[] stringArr=line.split(" ");
	                    System.out.println(stringArr[1]);
	                }

	            }


	}

	}
	
}
