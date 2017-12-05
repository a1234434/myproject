package com.Judy.oo;

public class Student {
   int english;
   int math;
   int chinese;
   String name;
   int print;
	public Student(String n,int e,int m,int c){
		english=e;
		math=m;
		chinese=c;
		name=n;
	}
	public void print(){
		System.out.println(english+"\t"+math+"\t"+chinese+"\t");
        
	
	}
//要用return	
	public int m(){
		return(english+math+chinese)/3;
	}
}
