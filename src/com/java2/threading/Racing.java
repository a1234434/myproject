package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		// 只有兩匹馬
		// Horse h1=new Horse();
		// Horse h2=new Horse();
		// h1.start();
		// h2.start();

		// 一次有8匹馬
		// List<Horse> horses = new ArrayList<>();
		// for(int i=0; i<8;i++){
		// Horse h =new Horse();
		// horses.add(h);
		// h.start();
		// }

		//Runnable用法
		Horse h1 = new Horse();
		h1.start();

		HorseRunnable h2 = new HorseRunnable();
		Thread thr = new Thread(h2);
		thr.start();
		
//		join是等待,如此一來,Main ended才會在兩隻馬都跑完後才印出
        try {
			h1.join();
			thr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Main ended");
        
	}

}
