package com.java2.io;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.java2.io.PracticeSales;
import com.Judy.shop.Customer;
import com.Judy.shop.GoldenCustomer;
import com.Judy.shop.SliverCustomer;

public class PracticeDemportmentstore {
	Scanner scanner = new Scanner(System.in);

	public void start() {
		int function = 0;
		while (function != 3) {
			showfunction();
			function = scanner.nextInt();
			switch (function) {
			case 1:
				InputSales();
				break;
			case 2:
				List<PracticeSales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales2.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader b = new BufferedReader(isr);
					String line = b.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int rank = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							PracticeSales sales2 = new PracticeSales(rank, amount);
							list.add(sales2);

						} catch (NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = b.readLine();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				for (PracticeSales sales2 : list) {
					Customer customer = null;
					switch (sales2.rank) {
					case 1:
						customer = new Customer(sales2.getamount());
						break;
					case 2:
						customer = new SliverCustomer(sales2.getamount());
						break;
					case 3:
						customer = new GoldenCustomer(sales2.getamount());
						break;
					}
					customer.print();
				}
				break;

			case 3:
				break;
			}
		}
	}

	public void InputSales() {
		try {
			FileOutputStream fos = new FileOutputStream("sales2.txt", true);
			PrintStream ps = new PrintStream(fos);
			System.out.print("請輸入會員等級:");
			int rank = scanner.nextInt();
			System.out.print("請輸入花費金額:");
			int amount = scanner.nextInt();
			ps.print(rank + "\t" + amount);
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void showfunction() {
		System.out.println("請選擇1-3:");
		System.out.println("1)輸入金額:");
		System.out.println("2)印出報表:");
		System.out.println("3)結束程式");
	}

	public static void main(String[] args) {
		PracticeDemportmentstore pd = new PracticeDemportmentstore();
		pd.start();
	}

}
