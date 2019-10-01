package com.lovecoding.UdemyCodingExcercises;

public class LastDigitChecker {

	public static boolean hasSameLastDigit(int x, int y, int z){
		if(x>9 && x<=1000 && y>9 && y<=1000 && z>9 && z<=1000){
			int lastDigitX=x%10;
			int lastDigitY=y%10;
			int lastDigitZ=z%10;
			if(lastDigitX==lastDigitY || lastDigitY==lastDigitZ || lastDigitX==lastDigitZ) return true;
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(9, 11, 309));
	}

}
