package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 有一文字檔存了課表資料(schedule.txt)
 * 請讀取資料後,設計程式可以檢查是否有空檔
 * 如:
 * 請輸入星期(1-7):2
 * 請輸入時(0-24):11
 * 【有空檔】
 * 請輸入星期(1-7):4
 * 請輸入時(0-24):14
 * 【有課: C004 English 到 16時 】
 */
public class CourseMain {
	List<Courses> courses = new ArrayList<>();

	public CourseMain(){
		readCourse();
int data =-1;
while(data!=0) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("請輸入星期(1-7):");
		int weekday =scanner.nextInt();
		System.out.print("請輸入時(0-24):");
		int hour =scanner.nextInt();
		boolean avail =true;
		if(Courses c :courses){
			
		}
	}
	}

	public void readCourse() {
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String token[] = line.split(",");
			String code = token[0];
			String name = token[1];
			int weekday = Integer.parseInt(token[2]);
			int hour = Integer.parseInt(token[3]);
			int duration = Integer.parseInt(token[4]);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
