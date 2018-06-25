package com.java2.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9957);
			Socket socket = server.accept();
			System.out.println("Connected");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			System.out.println(line);
			String token[] = line.split(":");
			String command = token[0];
			String option = token[1];
			System.out.println(command + "/" + option);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Eorror!!!");
		}

	}

}
