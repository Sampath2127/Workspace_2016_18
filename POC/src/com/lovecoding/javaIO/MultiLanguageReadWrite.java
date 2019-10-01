package com.lovecoding.javaIO;

import java.nio.charset.Charset;
import java.util.Scanner;

public class MultiLanguageReadWrite {

	static String chinese=new String("こんにちは");
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Encoding is :" + Charset.defaultCharset());

		System.out.println("Enter the path:");
		String inputFilePath = sc.nextLine();
		System.out.println(inputFilePath);
		//System.out.println("Input path:" + new String(inputFilePath.getBytes("utf-8")));

	}
}