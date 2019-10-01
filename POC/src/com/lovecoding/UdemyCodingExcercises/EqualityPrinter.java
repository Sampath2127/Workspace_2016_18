package com.lovecoding.UdemyCodingExcercises;

public class EqualityPrinter {

	public static void printEqual(int i, int j, int k){
		if(i>=0 && j>=0 && k>=0){
		if( i==j && j==k) System.out.println("All numbers are equal");
		else if( i!=j && j!=k && i!=k) System.out.println("All numbers are different");
		else System.out.println("Neither all are equal or different");
		}else{
			System.out.println("Invalid Value");
		}
	}
	public static void main(String[] args) {
	
		printEqual(13, 12, 13);
	}
}
