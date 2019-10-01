package com.lovecoding.StringBuilder;

public class StrinBuilderApp {

	public static void main(String[] args) {

		String s1="Sam";
		String s2=new String("Sam");
		String s3=s2;
		s2=s2.intern();
		StringBuilder sb=new StringBuilder();
		sb.append("Sa").append("m");
		
		System.out.println(s1.hashCode() +" "+ s2.hashCode());
		System.out.println(s1==s3);
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(sb.toString()==s1); //false
		System.out.println(sb.toString().equals(s1));// true
	}

}
