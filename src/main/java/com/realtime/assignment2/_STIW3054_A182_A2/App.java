package com.realtime.assignment2._STIW3054_A182_A2;


import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

    		System.out.println("##########################################");
    		System.out.println("Output of thread from analyzed the file:");
    		System.out.println("##########################################");
    		System.out.println("");
    		
    		try {
    		Thread1 total_no_course = new Thread1();
    		Thread Thread1 = new Thread(total_no_course);
    		Thread1.start();
    		Thread1.join();
            Thread.sleep(2000);
            
    		Thread2 total_no_days = new Thread2();
    		Thread Thread2 = new Thread(total_no_days);
    		Thread2.start();
    		Thread2.join();
            Thread.sleep(2000);
            
            Thread4 total_soc_courses  = new Thread4();
    		Thread Thread4 = new Thread(total_soc_courses);
    		Thread4.start();
    		Thread4.join();
            Thread.sleep(2000);
            
            Thread3 listcourses  = new Thread3();
    		Thread Thread3 = new Thread(listcourses);
    		Thread3.start();
    		Thread3.join();
            Thread.sleep(2000);
    		
            Thread5 info_stiw3054  = new Thread5();
    		Thread Thread5 = new Thread(info_stiw3054);
    		Thread5.start();
    		//Thread.sleep(2000);
            
    		
    		
    		}catch(Exception e){
    		    e.printStackTrace();
    		}
    	
    	}
    }


        
        

