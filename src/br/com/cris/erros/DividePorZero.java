package br.com.cris.erros;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DividePorZero {
	
public static void dividir(Scanner s) 
		throws InputMismatchException, ArithmeticException
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
	
		System.out.print("Divisor: ");
		int b = s.nextInt();
	
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				
				dividir(s);
				continua = false;
			}
			
			catch(InputMismatchException | ArithmeticException e1) {
				System.out.println("Numero invalido");
				s.nextLine(); //descarta a entrada errada e libera novamente para o usuário digitar
				e1.printStackTrace();
				
			}
			
			finally {
				System.out.println("Finally executado...");
			}
			
		} while(continua);
		
	}

}


/*
TRATAMENTO DE EXCEÇÕES
Multi Catch: possibilita o tratamento de vários tipos de 
exceções no mesmo bloco.
stackTrace: é a pilha de erros.
throws: serve para que as exceções já declaradas dentro de um método
possam ser tratadas evitando que o programa pare.

*/