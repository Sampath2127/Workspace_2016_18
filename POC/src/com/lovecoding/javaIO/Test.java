package com.lovecoding.javaIO;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		y=y++; 
		y=y++; 
		y=y++;	
		System.out.println("Y value before "+y);
		x=4*++y-3+x*y; 
		x=x++;
		System.out.println("x value "+x+" Y value "+y);
		/*Scanner sc = new Scanner(System.in,"utf-8");
		System.out.println("Encoding is :" + Charset.defaultCharset());

		System.out.println("Enter the path:");
		String inputFilePath = sc.nextLine();
		try {
			System.out.println("Input path:" + new String(inputFilePath.getBytes("utf-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
