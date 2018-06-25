package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class RacingPractice3 {

	public static void main(String[] args) {

		List<HorseRankPractice> rank = new ArrayList<>();
	    HorseRankPractice h1 = new HorseRankPractice(rank);
	    HorseRankPractice h2 =new HorseRankPractice(rank);
	    HorseRankPractice h3 =new HorseRankPractice(rank);
	    h1.start();
	    h2.start();
	    h3.start();
	    try {
			h1.join();
			h2.join();
			h3.join();
		} catch (InterruptedException e) {
			System.out.println("啊啊啊執行緒中斷啦!!!");
			e.printStackTrace();
		}
	    System.out.println(rank);
		System.out.println("main執行緒結束");

	}

}
