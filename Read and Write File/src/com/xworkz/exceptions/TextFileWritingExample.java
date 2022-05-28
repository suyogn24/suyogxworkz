package com.xworkz.exceptions;

import java.io.FileWriter;
import java.io.IOException;


public class TextFileWritingExample {

	public static void main(String[] args) {
		
		try {
			
			FileWriter writer = new FileWriter ("MyFile.txt",true);
			writer.write("Hello suyog are you fine");
			writer.write("\r\n");    //write new line
			writer.write("You know playing cricket !");
			writer.close();
		}  catch(IOException e)  {
			
			e.printStackTrace();
			
		}
	}

}
