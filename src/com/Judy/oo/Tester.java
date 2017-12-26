package com.Judy.oo;

//兩者相互連動
public class Tester {

	public static void main(String[] args) {
		Student st = new Student("王大華", 90, 50, 70);
		Student st1= new Student("黃小小",85,87,50);
		//Student g = new Student("王大華");
		/*
		 * st.chinese=90; 
		 * st.english=50; 
		 * st.math=70;
		 */
		st.pass=50;
		st.print();
		st1.print();
		int j = st.m();
		String s = st.name;
		System.out.print(st.name + "平均:" + j);
		
		GraduateStudent gst=new GraduateStudent();
		gst.print();

	}

}
