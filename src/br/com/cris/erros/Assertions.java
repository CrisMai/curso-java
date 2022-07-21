package br.com.cris.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 10");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <= 10) : "Numero invalido " + numero;
		
		System.out.println("Voce digitou " + numero);

	}

}


/*ASSERTIONS
 * São verificações feitas no sistema em tempo
 * de desenvolvimento. As Assertions são usadas 
 * para testar "coisas" que nunca deveriam acontecer.
 */
