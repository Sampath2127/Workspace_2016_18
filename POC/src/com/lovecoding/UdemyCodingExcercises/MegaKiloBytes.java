package com.lovecoding.UdemyCodingExcercises;

public class MegaKiloBytes {

	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		
		int megaBytes=(kiloBytes/1024);
		int kbleft=kiloBytes-(megaBytes*1024);
		System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+kbleft+" KB");
	}
	
	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);
	}
}
