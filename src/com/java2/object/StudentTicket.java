package com.java2.object;
//老師我還沒做完,我晚上會繼續
public class StudentTicket extends AdultTicket{
	private float discount = 0.1f;

	public StudentTicket(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount + "\t" + (int) (amount * (1 - discount)));
	}
}
