package com.java2.threading;

import java.util.List;

public class RankHorse extends Thread{
 List<RankHorse> rank;
 
 public RankHorse(List<RankHorse> rank) {
	this.rank=rank;
}
	public void run() {
		try {
			sleep(100);
			System.out.println(getName()+":"+"到達終點");
			rank.add(this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(getName()+":"+"中途中斷");
			e.printStackTrace();
		}
	}
}
