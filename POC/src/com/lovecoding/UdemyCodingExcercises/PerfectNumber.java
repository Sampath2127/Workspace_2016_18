package com.lovecoding.UdemyCodingExcercises;

public class PerfectNumber {

	public static boolean isPerfectNumber(int number){
		int count=1;
		int sum=0;
		if(number<=0) return false;
		while(count<number){
			if(number%count==0) sum+=count;
			count++;
		}
		return (sum==number);
	}
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
	}

}
