package com.realtime.assignment2._STIW3054_A182_A2;

public class Thread4 extends PdfReader implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
			
		String [] kod = {"STIA","STQM","STID","STIJ","STIX","STIN","STIK","STIW","STQS"};
		int num=0;
		super.run();
		
		for(int i=0;i<text.length;i++) {
			for(int s=1000;s<=5000;s++) {
				for(int k=0;k<kod.length;k++) {
					if(text[i].contains(kod[k]+s)) {
						num++;
				}
			}
			
		}
	}
		System.out.println("Thread-4: The number of courses from SOC: "+num);
		System.out.println("");
		}
	}
