package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*有一個紀錄一台飲料機資訊的檔案,規格如下:

投入5,10,50元
選擇飲料:1,2,3

*/
public class VendingMain {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		FileReader fr;
		try {
			fr = new FileReader("Vending.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String token[] = line.split(",");
			int count = Integer.parseInt(token[0]);
			for (int i = 0; i <= count; i++) {
				String name = token[(i * 2 + 1)];
				int price = Integer.parseInt(token[(i * 2 + 2)]);
				System.out.println(name+" "+price);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}