package br.com.cris.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				
				System.out.print("Numero: ");
				int a = s.nextInt();
			
				System.out.print("Divisor: ");
				int b = s.nextInt();
			
				System.out.println(a / b);
				continua = false;
			}
			
			catch(InputMismatchException e1) {
				System.out.println("Numeros devem ser inteiros");
				s.nextLine(); //descarta a entrada errada e libera novamente para o usuário digitar
				
			}
			
			catch(ArithmeticException e2) {
				System.out.println("Divisor deve ser diferente de zero");
				
			}
			finally {
				System.out.println("Finally executado...");
			}
			
		} while(continua);
		
	}

}




/*
TRATAMENTO DE EXCESSÕES
Com o tratamento de excessões um programa pode continuar 
executando suas ações, ao invés de encerrar.
Try: significa tente - é onde podemos colocar o código
que queremos tentar executar.
Catch: captura o tipo de erro e trata.
Finally: é um bloco que é executado independente se teve
erro ou não dentro do método.
*/