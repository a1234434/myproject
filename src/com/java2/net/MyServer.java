package com.java2.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class MyServer extends JFrame{
       public MyServer(){
    	   setSize(600,200);
    	   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	   setVisible(true);
       }
	public void start() {
		try {
			ServerSocket server =new ServerSocket();
			Socket socket =server.accept();
			System.out.println("Connected");
			InputStream is =socket.getInputStream();
			InputStreamReader isr =new InputStreamReader(is);
			BufferedReader br =new BufferedReader(isr);
			String line = br.readLine();
			System.out.println(line);
			String token[] =line.split(":");
			String command =token[0];
			String option =token[1];
			System.out.println(command+"/"+option);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Eorror!!!");
		}
		
	}
	public static void main(String[] args) {
        
        
	}

}
