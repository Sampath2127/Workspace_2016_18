package com.lovecoding.Serialize;

public class App {

	public static void main(String[] args) throws Exception {
		new FileWrite().writeObjectsToFile();
		new FileRead().readFile();
	}

}
