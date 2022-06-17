package br.com.cris.erros;

import br.com.cris.heranca.Animal;
import br.com.cris.heranca.Cachorro;
import br.com.cris.heranca.Galinha;

public class ExcecoesComuns {
	
	static int[] arrayNull = new int[0];

	public static void main(String[] args) {
		
		//NullPointerException 
		System.out.println(arrayNull.length);
		
		//ArithmeticException
		int x = 5 / 0;
		
		//ArrayIndexOutOfBoundsException
		System.out.println(arrayNull[1]);
		
		//ClassCastException 
		Animal a = new Galinha();
		Cachorro c = (Cachorro) a;
		
		//NumberFormatException
		double d = Double.parseDouble("XTI");
		
	}

}



/*
 * EXCEÇÕES COMUNS
 * NullPointerException -tentando acessar um objeto nulo.
 * ArithmeticException - dividir um número por zero.
 * ArrayIndexOutOfBoundsException - tentar acessar uma posição que não existe.
 * ClassCastException - erro de teste de conversão de tipos de uma forma explicita.
 * NumberFormatException - erro ao tentar converter uma string em numero.
 */
