package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(105);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot FOUND the File!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Eorror");
		}
        
		
	}

}
