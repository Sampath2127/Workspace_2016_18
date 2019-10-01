package com.lovecoding.dateFormats;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Date {

	public static void main(String[] args) {
		
		Calendar enrolledDate=new GregorianCalendar(2016, Calendar.FEBRUARY, 29);
		Calendar currentDate=new GregorianCalendar(2017, Calendar.FEBRUARY, 28);
		int yearsDiff= currentDate.get(Calendar.YEAR)-enrolledDate.get(Calendar.YEAR);
		int numberOfMonths=yearsDiff*12+(currentDate.get(Calendar.MONTH)-enrolledDate.get(Calendar.MONTH));
		int numberOfDays=0;
		if(currentDate.get(Calendar.MONTH)==enrolledDate.get(Calendar.MONTH)){
		numberOfDays=currentDate.get(Calendar.DAY_OF_MONTH)-enrolledDate.get(Calendar.DAY_OF_MONTH);
		}
		if(numberOfMonths<12 ){
			System.out.println("new");
		}else if(numberOfMonths==12 && numberOfDays<0){
			System.out.println("new");
		}
		else{
			System.out.println("tenured");
		}
	}

}
