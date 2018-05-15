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
		
		List<Horse> horses = new ArrayList<>();
		for(int i=0; i<8;i++){
			Horse h =new Horse();
			horses.add(h);
			h.start();
		}

	}

}
