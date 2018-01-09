package com.Judy.Train;
/*
來回票:
1.乘車日期
2.發車日期時間
3.起站
4.訖站(你要到的站)
5.票價(打85折,ex:(65+65)*0.85)
6.回程發車日期時間

*/
public class Ticket2 extends Ticket{
	String f;
public Ticket2(String total){
	super(total);
	super.e=(int)((65+65)*0.85);

}
@Override
public void print(){
	String f ="2018-01-16";
	String g="19:10";
	System.out.println(a+" "+b+" "+c+"  "+d+"  "+e+" "+f+" "+g);
}	
	
}
