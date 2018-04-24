package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeFiletester {

	public static void main(String[] args) {
    try {
		FileOutputStream out =new FileOutputStream("data1.txt");
		out.write(104);
		out.flush();
		out.close();
	} catch (FileNotFoundException e) {
		System.out.println("Can't find the file!");
	} catch (IOException e) {
		System.out.println("Eorror!");
	}
    
		
	}

}
