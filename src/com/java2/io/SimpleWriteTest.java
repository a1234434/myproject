package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {
    // 第一種方法,在main(String[] args)後面加上throws FileNotFoundException,但出錯你不知道,因為他就擺爛了
	public static void main(String[] args) throws FileNotFoundException  {
		PrintStream out = new PrintStream("data.txt");
		//如果只有print的話,就只會顯示一行
		//如果是printlin的話,會顯示一行完後,跳到下一行
        out.print("Amy Lin\t 1\t500");
        out.flush();
        out.close();
       
		
		
	}

}
