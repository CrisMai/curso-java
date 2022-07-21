package br.com.cris.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
	
	public static void main(String[] args) {
		
		// FIFO => O primeiro a entrar é o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		fila.add("Ana");
		fila.add("Cris");
		fila.add("Eliz");
		fila.offer("Carla"); // Esses dois métodos adicionam elementos ao final da fila.
		
		System.out.println(fila);
		System.out.println(fila.peek()); // Método que tras o próximo elemento da fila.
		System.out.println(fila.poll()); // Método que remove o elemento do início da fila.
		System.out.println(fila);
		
		
		/* Outros métodos disponíveis em LinkedList */
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio"); // Método que adiciona um elemento ao início da fila.
		f.addLast("Rui"); // Adiciona no final da fila.
		System.out.println(f);
		
		f.pollFirst();
		f.pollLast();
		System.out.println(f);
	}

}

/* Collection Queue representam filas de espera.
Existem duas classes que implementam as interfaces Queue:
LinkedList e PriorityQueue. */ 