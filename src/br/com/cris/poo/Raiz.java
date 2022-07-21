package br.com.cris.poo;

public class Raiz {
	
	/** @return a raiz quadrada segundo a equação de Pell's */
	
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		
		while(numero >= impar) {
			numero -= impar;
			impar += 2; //próximo número ímpar
			++raiz;
			
		}
		
		return raiz;
	}

}
