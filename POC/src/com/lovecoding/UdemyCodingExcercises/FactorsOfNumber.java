package com.lovecoding.UdemyCodingExcercises;

public class FactorsOfNumber {

	public static void printFactors(int number){
		int count=1;
		if(number<0) System.out.println("Invalid Value");
		else{
		while(count<=number){
			if(number%count==0) System.out.println(count);
			count++;
		}
		}
	}
	public static void main(String[] args) {
		printFactors(-6);
	}

}
