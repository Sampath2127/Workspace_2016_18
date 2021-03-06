package com.lovecoding.UdemyCodingExcercises;

public class LeapYearCalculator {
	
	public static boolean isLeapYear(int year){
		
		return ((year>=1 && year<=9999) && (year%4==0 && (year%400==0 || year%100!=0)));
	}

	public static int getDaysInMonth(int month, int year){
		if((year<1 || year>9999) || (month<1 || month>12)) return -1;
		else {
			switch(month){
			case 1:
				return 31;
			case 2:
				if(isLeapYear(year)) return 29;
				return 28;
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			case 8:
				return 31;
			case 9:
				return 30;
			case 10:
				return 31;
			case 11:
				return 30;
			case 12:
				return 31;
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		System.out.println(getDaysInMonth(8, 2001));
	}

}
