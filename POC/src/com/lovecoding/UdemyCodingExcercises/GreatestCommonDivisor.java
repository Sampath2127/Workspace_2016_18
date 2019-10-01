package com.lovecoding.UdemyCodingExcercises;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int x, int y){
		if(x<10 || y<10) return -1;
		int number=0;
		if(x>y) number=y;
		else number=x;
		int count=1;	
		int gcdVal = 0;
		while(count<=number){
			
			if(x%count==0 && y%count==0) gcdVal=count;
			
			count++;
		}
		return gcdVal;
	}
	public static void main(String[] args) {
	System.out.println(getGreatestCommonDivisor(12, 30));	
	}

}
