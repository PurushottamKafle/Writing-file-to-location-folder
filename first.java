package pksoft;
import java.io.*;

public class first{

	public static void main(String[] args) throws Exception { // this throws exception for future problems
		
		FileOutputStream os = new FileOutputStream("F://pksoft/second.java"); // we know that
		// OutputStream mean to write so, declaring class and passing param. as a location, where to put files.
		
		String str= "Hello, Purushottam"; 
		byte[] pk= str.getBytes();//  converting string into sequences of bytes
		
		os.write(pk); // writing pk into os
		os.close(); // closing Stream
		System.out.println("Success.."); // printing sucess message
	}
}
