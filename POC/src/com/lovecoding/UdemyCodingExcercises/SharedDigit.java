package com.lovecoding.UdemyCodingExcercises;

public class SharedDigit {

	public static boolean hasSharedDigit(int x, int y){
		if(x>9 && x<100 && y<100 && y>9){
			int firstLastOfX=x%10;
			x=x/10;
			int secondLastOfX=x%10;
			int firstLastOfY=y%10;
			y=y/10;
			int secondLastOfY=y%10;
			
			if(firstLastOfX==firstLastOfY || secondLastOfX==firstLastOfY || firstLastOfX==secondLastOfY || secondLastOfX==secondLastOfY) return true;
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 56));
	}

}
