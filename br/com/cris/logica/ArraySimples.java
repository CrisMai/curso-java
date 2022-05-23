package br.com.cris.logica;
import java.util.Arrays;


public class ArraySimples {
	
	public static void main (String[] args) {
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		String[] paises = {"Brasil", "EUA", "Chile", "Cuba"};
		
		System.out.println(paises[0]);
		System.out.println(paises.length);
		
		//Classe para manipulação de Arrays
		System.out.println(Arrays.toString(paises));
		
		//Classe para realizar uma pesquisa dentro do Array
		int posicao = Arrays.binarySearch(paises, "EUA");
		System.out.println(posicao);
		
		//Ordenação dentro de Arrays
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		//Acessar os métodos dos objetos dentro dos Arrays
		Double[] valores = {12.35, 34.78};
		System.out.println(valores[1].doubleValue());
	}

}

/** 
Quando for inicializar um array independente se for tipo objeto ou primitivo, 
quando for indicar o número de posições usa a palavra-chave new.
*/
