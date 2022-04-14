package com.xworkz.exceptions;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * This program demonstrates how to write characters to a text file using
 * a specified charset.
 * @author www.codejava.net
 *
 */

public class TextFileWritingExample2 {

	public static void main(String[] args) {
		try {
			FileOutputStream outputStream = new FileOutputStream("Suyog is a good boy");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("suyog likes to do treeking");
			bufferedWriter.newLine();
			bufferedWriter.write("suyog has join xworkz classes");
			
			bufferedWriter.close();
		}  catch (IOException e)  {
			e.printStackTrace();
		
	
		
		
		}

	}

}
