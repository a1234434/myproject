package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java2.collection.Main;

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
	public CourseMain() {
		readCourse();
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入星期(1-7):");
			int weekday = scanner.nextInt();
			System.out.print("請輸入時(0-24):");
			int hours = scanner.nextInt();
			boolean avail = true;
			for (Courses c : courses) {
				if (!c.isAvailable(weekday, hours)) {
					System.out.println(
							"【有課: " + c.getCode() + " " + c.name + "到" + (c.getHours() + c.getDuration()) + "時】");
					avail = false;
					break;

				} else {
					if (avail) {
						System.out.println("有空檔");
						break;
					}
				}
			}
		}

	public void readCourse() {
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while (line != null) {
				String token[] = line.split(",");
				String code = token[0];
				String name = token[1];
				int weekday = Integer.parseInt(token[2]);
				int hours = Integer.parseInt(token[3]);
				int duration = Integer.parseInt(token[4]);
				Courses c = new Courses(code, name, weekday, hours, duration);
				courses.add(c);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CourseMain();
	}

}
