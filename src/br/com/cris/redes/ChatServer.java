package br.com.cris.redes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	
	public ChatServer() {
		ServerSocket server;
		Scanner leitor;
		
		try {
			server = new ServerSocket(5000);
			while (true) {
				Socket s = server.accept();
				leitor = new Scanner(s.getInputStream());
				System.out.println(leitor.nextLine());
			}
		} catch (IOException e) {}
		
	}

	public static void main(String[] args) throws IOException {
		new ChatServer();

	}

}
