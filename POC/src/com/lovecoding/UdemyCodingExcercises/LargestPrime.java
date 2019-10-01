package com.lovecoding.UdemyCodingExcercises;

public class LargestPrime {

	 public static int getLargestPrime(int number){
	        if(number<=1) return -1;
	        for(int i=number-1; i>1; i--){
	        	if(number%i==0) number=i;
	        }
	        return number;
	    }
	 
	
	public static void main(String[] args) {
		
		System.out.println(getLargestPrime(39));
	}

}
