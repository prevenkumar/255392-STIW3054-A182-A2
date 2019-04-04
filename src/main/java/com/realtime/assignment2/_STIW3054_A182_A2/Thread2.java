package com.realtime.assignment2._STIW3054_A182_A2;

import java.time.temporal.ChronoUnit;
import java.time.Month;
import java.time.LocalDate;

public class Thread2 extends PdfReader implements Runnable {
	
	
	@Override
	public void run() {
		LocalDate firstday = LocalDate.of(2019, Month.MAY, 25);
		LocalDate lastday = LocalDate.of(2019, Month.JUNE, 21);
		
		long day = (ChronoUnit.DAYS.between(firstday, lastday))-9;
		
		System.out.println("Thread-2: The total number of days: "+day);
		System.out.println("");
		
	}

}
