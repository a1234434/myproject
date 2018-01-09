package com.Judy.shop;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		int amount;
		
	ArrayList list = new ArrayList();
	list.add(94);//像陣列一樣,這是0
	list.add(77);//這是1
	list.add(61);//這是2
	list.add(4.2);//這是3
	int a =(int)list.get(1);
	System.out.println(list.get(0));
	System.out.println(list.size());//這個會跑出他有幾個數字
	for(int y =0;y<list.size();y++){
		System.out.println(list.get(y));//get才會把裡頭的數字跑出來,ex:在0這格的數字是94,就會跑出94
	}
//要加轉型(int),因為list裡不是只有整數還有double(4.2),如果裡頭全是整數的話就不用加轉型(int)	
//4.2是double,4.2f是浮點數		
	
/*法一
   Customer c1 =new Customer(1000);
   c1.print();
 SliverCustomer c2 =new SliverCustomer(1000);
   c2.print();
  GoldenCustomer c3=new GoldenCustomer(1000);
  c3.print();
*/
	
//法二
ArrayList<Customer> customers =new ArrayList<>();
customers.add(new Customer(10000));
customers.add(new SliverCustomer(10000));
customers.add(new GoldenCustomer(10000));
//底下要特別注意,不要跟上面的搞混了
for(int u =0;u<customers.size();u++){
	Customer c =customers.get(u);
	c.print();
}
	}

}
