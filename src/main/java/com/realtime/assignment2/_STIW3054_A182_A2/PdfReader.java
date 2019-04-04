package com.realtime.assignment2._STIW3054_A182_A2;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.io.File;
import java.io.IOException;


public class PdfReader extends App{
	public String txt;
	public String [] text; 
	
	public void run() {
	try{
		PDDocument pdf = null; 
		pdf = PDDocument.load(new File("timetable.pdf"));
		pdf.getClass();
		if( !pdf.isEncrypted() ){
		    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		    stripper.setSortByPosition( true );
		    PDFTextStripper Tstripper = new PDFTextStripper();
		    txt = Tstripper.getText(pdf);
		    text= txt.split(System.getProperty("line.separator"));
		    //System.out.println("Data from pdf file:"+txt);
		   
		}
		pdf.close();
	}catch(IOException e){
	    e.printStackTrace();
	}
	}
}

