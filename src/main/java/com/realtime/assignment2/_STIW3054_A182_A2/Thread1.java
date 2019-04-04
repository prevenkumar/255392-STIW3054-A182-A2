package com.realtime.assignment2._STIW3054_A182_A2;

public class Thread1 extends PdfReader implements Runnable {
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int course=0;
		super.run();
		

		
		for(int i=0; i<=txt.length(); i++) {
			
	  		if(txt.contains(i +".")) 
	  			
	  			course=course+1; 
		} 	
		System.out.println("Thread-1: The total number of courses: " + (course-1));
		System.out.println("");
		
	}
}