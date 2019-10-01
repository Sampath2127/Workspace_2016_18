package com.lovecoding.UdemyCodingExcercises;

public class NumberToWords {

	public static void numberToWords(int number){
		if(number<0) System.out.println("Invalid Value");
		else{
			int lastDigit;
			 int count=getCount(number);
			 number=reverse(number);
			 while(count>0){
				 lastDigit=number%10;
				 number=number/10;
				 switch(lastDigit){
					case 0:
						System.out.println("ZERO");
						break;
					case 1:
						System.out.println("ONE");
						break;
					case 2:
						System.out.println("TWO");
						break;
					case 3:
						System.out.println("THREE");
						break;
					case 4:
						System.out.println("FOUR");
						break;
					case 5:
						System.out.println("FIVE");
						break;
					case 6:
						System.out.println("SIX");
						break;
					case 7:
						System.out.println("SEVEN");
						break;
					case 8:
						System.out.println("EIGHT");
						break;
					case 9:
						System.out.println("NINE");
						break;
			 }
				 	count--;
			 }
		}
	}
	private static int reverse(int number) {
		int reverse=0;
		while(number>0){
			reverse=reverse*10+(number%10);
			number=number/10;
		}
		return reverse;
	}

	private static int getCount(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		numberToWords(100);
	}

}
