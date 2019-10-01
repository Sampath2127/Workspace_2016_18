package com.lovecoding.UdemyCodingExcercises;

public class PlayingCat {

	public static boolean isCatPlaying(boolean summer, int temperature){
		return (temperature>=25 && ((summer && temperature<=45) || (!summer && temperature<=35)));
	}
	public static void main(String[] args) {
		System.out.println(isCatPlaying(false, 35));
	}

}
