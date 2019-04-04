package com.realtime.assignment2._STIW3054_A182_A2;

public class Thread3 extends PdfReader implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String [] kod = {"STIA","STQM","STID","STIJ","STIX","STIN","STIK","STIW","STQS"};
		super.run();
		
		for(int i=0;i<text.length;i++) {
			for(int j=1000;j<=5000;j++) {
				for(int k=0;k<kod.length;k++) {
					if(text[i].contains(kod[k]+j)) {
						System.out.println("Thread-3: List of courses from SOC: "+text[i]);		
						
					}
				}
			
			}
	
		}
		System.out.println("");
		}
	}

