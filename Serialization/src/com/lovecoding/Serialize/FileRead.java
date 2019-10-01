package com.lovecoding.Serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileRead {

	public void readFile() throws Exception{
		FileInputStream fiRead=new FileInputStream("userDetails.txt");
		ObjectInputStream objRead=new ObjectInputStream(fiRead);
		System.out.println(objRead.readObject().toString());
		objRead.close();
}
}
