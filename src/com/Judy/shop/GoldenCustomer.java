package com.Judy.shop;

public class GoldenCustomer extends SliverCustomer {
    int returnMoney;
	public GoldenCustomer(int amount) {
		super(amount);
		
	}
    @Override
	public void print() {
//因為discount是float,但returnMoney是int,所以要轉型    	
    	returnMoney=(int)(amount*discount);
		System.out.println(amount + "\t" + (int)(amount * (1 - discount))+"\t"+returnMoney);
	}
}
