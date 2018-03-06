package com.java2.object;

public class ElderTicket65up extends AdultTicket{
    float discount=0.5f;
    boolean yes;
    boolean no;
	public ElderTicket65up(int amount) {
		super(amount);
		
	}
	
	private void print1() {
		System.out.print("Are you order than 65 years old?");
		if(yes) {
			System.out.println(number+"張"+"\t"+ (int) (amount * (1 - discount)));
		}else {
			System.out.println(number+"張"+"\t"+ amount);
		}
	}

	
	
}
