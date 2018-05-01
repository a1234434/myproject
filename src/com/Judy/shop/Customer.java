package com.Judy.shop;

public class Customer implements Destroyable {
	int amount;
	float discount = 0.05f;

	public Customer(int amount) {
		this.amount = amount;

	}

	public void print() {
		System.out.println(amount + "\t" + (int) (amount * (1 - discount)));
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
