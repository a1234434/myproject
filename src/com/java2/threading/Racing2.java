package com.java2.threading;

import java.util.ArrayList;
import java.util.List;


public class Racing2 {

	public static void main(String[] args) {
    List<RankHorse> rank =new ArrayList<RankHorse>();
    RankHorse h1 = new RankHorse(rank);
    RankHorse h2 = new RankHorse(rank);
    h1.setName("h1");
    h2.setName("h2");
    h1.start();
    h2.start();
    
    try {
		h1.join();
		h2.join();
	} catch (InterruptedException e) {
        System.out.println("執行緒被中斷");
		e.printStackTrace();
	}
    System.out.println(rank);
    System.out.println("main執行緒結束");
	}

}
