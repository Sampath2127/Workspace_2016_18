package com.lovecoding.UdemyCodingExcercises;

public class YearsToMinutesDaysCalc {

	public static void printYearsAndDays(long minutes){
		if(minutes<0) System.out.println("invalid value");
		else{
			int years=(int) (minutes/(365*24*60));
			int days=(int) (minutes-(years*365*24*60))/(24*60);
			System.out.println(minutes+" min = "+years+" y and "+days+" d");
		}
	}
	
	public static void main(String[] args) {
		printYearsAndDays(561600);
	}

}
