package com.java2.threading;

public class Horse extends Thread{
	
//	已解決名次問題
	@Override
	public void run(){
		for(int i=0;i<=100;i++){
//			getName = 他幫你設名字
			System.out.println(getName()+":"+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
