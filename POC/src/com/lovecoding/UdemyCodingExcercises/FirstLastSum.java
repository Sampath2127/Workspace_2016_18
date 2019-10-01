package com.lovecoding.UdemyCodingExcercises;

public class FirstLastSum {

	public static int sumFirstAndLastDigit(int number){
	if(number>=0){
	int sum=0;
	int lastDigit=number%10;
	int firstDigit=0;
	while(number>0){
		if(number!=0) firstDigit=number;
		number=number/10;
	}
	sum=lastDigit+firstDigit;
	return sum;
	}
	return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(55));
	}

}
