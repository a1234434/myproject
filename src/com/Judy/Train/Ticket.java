package com.Judy.Train;

/*
一張車票:
1.乘車日期
2.發車日期時間
3.起站
4.訖站(你要到的站)
5.票價  
 */
public class Ticket {
	String a;
	String b;
	String c;
	String d;
	String Total;
	int e;
	
public Ticket(String total){
	this.Total=total;
	a="2018-01-08";
	b="18:30";
	c="松山";
	d="八堵";
	e=65;
}

public void print(){
	System.out.println(a+" "+b+" "+c+"  "+d+"  "+e);
}
}
