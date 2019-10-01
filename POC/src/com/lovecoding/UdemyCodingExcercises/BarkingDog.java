package com.lovecoding.UdemyCodingExcercises;

public class BarkingDog {

	public static boolean bark(boolean barking, int hourOfDay){
		
		if(hourOfDay>=8 && hourOfDay<=22){
			return false;
		}else{
			if(hourOfDay>=0 && hourOfDay<24 && barking==true){
				return true;
			}else{
				return false;
			}
		}
		}
	public static void main(String[] args) {
		
	}
}
