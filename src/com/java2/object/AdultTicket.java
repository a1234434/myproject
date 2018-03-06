package com.java2.object;

public class AdultTicket {
	int amount;
    int number;
	public AdultTicket(int amount) {
		this.amount = amount;
        
	}

	public void print() {
		System.out.println(number+"張"+"\t"+amount + "\t");
	}
}
