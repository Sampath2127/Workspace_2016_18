package com.lovecoding.UdemyCodingExcercises;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double val1, double val2){
		int decimalVal1=(int) (val1*1000);
		int decimalVal2=(int) (val2*1000);
		 
		return (decimalVal1==decimalVal2);
	}
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.1756));
	}

}
