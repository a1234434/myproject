package com.Judy.oo;

public class Student {
	int english;
	int math;
	int chinese;
	String name;
   static int pass =60;
	public Student(){
		
	}
//為了讓別人看懂,所以打了全部字母;
	public Student(String name, int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	}
//下面Student(在裡面放String是因為"王大華"字串)
	public Student(String n) {
		this.name = n;
	}

	// this(這個類別裡頭的東西,強調)
	public void print() {
		System.out.println(english + "\t" + math + "\t" + chinese + "\t");

	}

	// 要用return
	public int m() {
		return (english + math + chinese) / 3;
	}
}
