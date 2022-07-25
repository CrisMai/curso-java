package br.com.cris.redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem:" + s.nextLine());
		s.close();

	}

}


/* Socket
 É o objeto que representa uma conexão de redes entre
 duas máquinas.
 Para criar uma conexão de socket é necessário
 saber dois pontos sobre o servidor: quem é ele
 (enderço IP)e em que porta está sendo executado.
 */
