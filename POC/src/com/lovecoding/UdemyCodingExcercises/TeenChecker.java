package com.lovecoding.UdemyCodingExcercises;

public class TeenChecker {

	public static boolean hasTeen(int x, int y, int z){
		return (x<20 && x>12) || (y<20 && y>12) || (z<20 && z>12);
	}
	public static void main(String[] args) {
		System.out.println(hasTeen(12, 20, 22));
	}

}
