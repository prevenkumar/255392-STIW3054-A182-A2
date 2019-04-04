package com.realtime.assignment2._STIW3054_A182_A2;

public class Thread5 extends PdfReader implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<text.length;i++) {
			if(text[i].contains("STIW3054")) 
				//System.out.println(text[i]);
				

		System.out.println("Thread-5: Display the information of STIW3054: "+text[i]);
		
		}
		
		}
}