package com.Judy.oo;

public class Student {
//因為有private的關係,所以隔壁的GraduateStudent就不能用,只有Student這裡可以用	
    int english;
//沒有public在前面,但仍然可以在隔壁的GraduateStudent使用是因為他們是同個package的,如果不同的話就不能使用了
	int math;
//如果有protected在前面的話,即使不同package也可以使用,就像媽媽帶小孩一樣,Student是媽媽,GraduateStudent是小孩,媽媽把東西給小孩用	
	protected int chinese;
//  public protected private 可以使用各種用法,但都各自有限制,才能使用
	String name;
	static int pass = 60;

	public Student() {

	}

	// 為了讓別人看懂,所以打了全部字母;
	public Student(String name, int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.name = name;
	}

	// 下面Student(在裡面放String是因為"王大華"字串)
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
