package com.love2code.Expressions;

public class TestExpressions {

	public static void main(String[] args) {
		
		String alphanumeric="abceeedemeeemkekek122abc4564564BBkk";
		System.out.println(alphanumeric.replaceAll(".", "Y"));
		System.out.println(alphanumeric.replaceAll("^abc", "YYYY"));//^ represents starting with
		System.out.println(alphanumeric.matches("^abcdemekekek122BBkk"));
		
		System.out.println(alphanumeric.replaceAll("BBkk$", "THE END"));//$ represents the end
		System.out.println(alphanumeric.replaceAll("[aBe]", "X"));//[] replaces the value provided in between square braces
		System.out.println(alphanumeric.replaceAll("[aec][dm]", "X"));//replaces the characters followed by d or m.
		
		System.out.println(alphanumeric.replaceAll("[a-fA-F1-4]", "X"));// replaces values with the range provided
		System.out.println(alphanumeric.replaceAll("(?i)[a-f1-4]", "X"));//(?i) replaces all the letters with range irrespective of case
		System.out.println(alphanumeric.replaceAll("[0-9]","X"));
		System.out.println(alphanumeric.replaceAll("\\d", "X"));//replaces integers
		System.out.println(alphanumeric.replaceAll("\\D", "X"));//replaces characters
		
		String whiteSpace="I have blanks and\ta tab, and also a newline\n";
		System.out.println(whiteSpace);
		System.out.println(whiteSpace.replaceAll("\\s", ""));//remove white space characters
		System.out.println(whiteSpace.replaceAll("\t", ""));
		System.out.println(whiteSpace.replaceAll("\\S", ""));
		System.out.println(whiteSpace.replaceAll("\\W", "X") );//W replaces white spaces, tab and new line
		
	}

}
