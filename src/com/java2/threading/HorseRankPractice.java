package com.java2.threading;

import java.util.List;

public class HorseRankPractice extends Thread {

	List<HorseRankPractice> rank;

	public HorseRankPractice(List<HorseRankPractice> rank) {
		this.rank = rank;
	}

	public void run() {
		try {
			sleep(100);
			System.out.println(getName()+"到達終點");
			rank.add(this);
		} catch (InterruptedException e) {
			System.out.println(getName()+"中斷了");
			e.printStackTrace();
		}
            
	}
}
