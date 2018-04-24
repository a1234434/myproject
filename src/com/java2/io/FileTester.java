package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
        try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(105);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot FOUND the File!");
		} catch (IOException e) {
			System.out.println("Eorror");
		}
        
		
	}

}
