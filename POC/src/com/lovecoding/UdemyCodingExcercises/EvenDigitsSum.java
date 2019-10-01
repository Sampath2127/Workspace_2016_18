package com.lovecoding.UdemyCodingExcercises;

public class EvenDigitsSum {

	public static int getEvenDigitSum(int number){
		if(number>=0){
			int evenSum=0;
			int lastNumber;
			while(number>0){
			lastNumber=number%10;
			if(lastNumber%2==0) evenSum+=lastNumber;
			number=number/10;
			}
			return evenSum;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(0));
	}

}
