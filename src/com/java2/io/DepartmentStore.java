package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import com.Judy.shop.Customer;
import com.Judy.shop.GoldenCustomer;
import com.Judy.shop.SliverCustomer;

public class DepartmentStore {

	public DepartmentStore() {
		Scanner scanner = new Scanner(System.in);

	}

	public void start() {
		int function = 0;
		while (function != 3) {
			showFunction();
			Scanner scanner = new Scanner(System.in);
			function = scanner.nextInt();
			switch (function) {
			case 1:
				inputSales();
				break;
			case 2:
				List<Sales> list = new ArrayList<>();
				try {
					FileInputStream fis = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fis);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while (line != null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type, amount);
							list.add(sales);
						} catch (NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				// report
				for (Sales sales : list) {
					Customer customer = null;
					switch (sales.type) {
					case 1:
						customer = new Customer(sales.getAmount());
						break;
					case 2:
						customer = new SliverCustomer(sales.getAmount());
						break;
					case 3:
						customer = new GoldenCustomer(sales.getAmount());
						break;

					}
					customer.print();
				}
				break;
			case 3:
				return;
			}

		}
	}

	public void inputSales() {
		try {
			// append=從後面補資料,如果boolean值是true的時候
			FileOutputStream fos = new FileOutputStream("sales.txt", true);
			PrintStream out = new PrintStream(fos);
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入會員等級:");
			int rank = scanner.nextInt();
			System.out.print("請輸入花費金額:");
			int amount = scanner.nextInt();
			out.print(rank + "\t" + amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {

		}
		;
	}

	public void showFunction() {
		System.out.println("請輸入(1-3):");
		System.out.println("1)輸入銷售紀錄:");
		System.out.println("2)輸出銷售報表:");
		System.out.println("3)結束");
	}

	public static void main(String[] args) {
		DepartmentStore de = new DepartmentStore();
		de.start();
	}
}
