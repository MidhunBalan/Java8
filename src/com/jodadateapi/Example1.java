package com.jodadateapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		System.out.println(dd);
		
		int mm = date.getMonthValue();
		System.out.println(mm);
		
		int yy = date.getYear();
		System.out.println(yy);
		
		
		System.out.println("-------------------");
		
		LocalTime time= LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		System.out.println(h);
		
		int m = time.getMinute();
		System.out.println(m);
		
		int s = time.getSecond();
		System.out.println(s);
		
		int n = time.getNano();
		System.out.println(n);
		

	}

}
