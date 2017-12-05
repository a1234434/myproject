package com.Judy.oo;
//兩者相互連動
public class Tester {

	public static void main(String[] args) {
             Student st=new Student("王大華",90,50,70);
/*             st.chinese=90;
             st.english=50;
             st.math=70;
*/             
             st.print();
             int j=st.m();
             String s=st.name;
       System.out.print(s+"平均:"+j);      
             
	}

}
