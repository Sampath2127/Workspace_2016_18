package com.lovecoding.Serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWrite {

	protected void writeObjectsToFile() throws IOException{
		FileOutputStream fio;
		ObjectOutputStream objWriter = null;
	try{
			
		fio=new FileOutputStream(new File("userDetails.txt"));
	
		objWriter=new ObjectOutputStream(fio);
		
		objWriter.writeObject(new User("Sam", "LKJLKJJLK"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}finally{
		objWriter.close();
	}
	}
}
