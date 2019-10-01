package com.lovecoding.UdemyCodingExcercises;

public class PalindromeNumber {

	public static boolean isPalindrom(int number){
		int reverse=0;
		number=Math.abs(number);
		int actualNumber=number;
		while(number>0){
		int lastDigit=number%10;
		number=number/10;
		System.out.println(number);
		reverse=reverse*10+lastDigit;
		}
		return (reverse==actualNumber);
	}
	public static void main(String[] args) {
		System.out.println(isPalindrom(352));
	}

}
