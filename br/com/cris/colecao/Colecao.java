package br.com.cris.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	
	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		c.add("A"); // Método que adiciona elementos em uma coleção.
		c.add("B");
		c.add("C");
		System.out.println(c.toString()); // Método que apresenta a coleção em forma de string;
		System.out.println(c.isEmpty()); // Método que verifica se a coleção está vazia;
		System.out.println(c.contains("C")); // Método que pesquisa por um determinado elemento;
		
		c.remove("A"); // Remove elementos;
		System.out.println(c.toString());
		
		
		/* Métodos para trabalhar com grupos de elementos */
		
		Collection<String> c2 = Arrays.asList("D", "E");
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2)); // Verifica se todos os elementos da coleção c2 estão dentro de c.
		
		/* Converter uma coleção em um Array */
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		c.clear(); // Limpa toda a coleção;
		System.out.println(c);
		
	}

}

/* COLEÇÕES
São estruturas de dados, interfaces e métodos para
manipular esses dados.
A interface Collection é a interface raiz na hierarquia
das coleções - Set, List e Queue.
A interface set trabalha com registro sem duplicidade - registros únicos.
List trabalha com registros na ordem que são incluídos na lista.
Queue trabalha com fila de espera.
Map trabalha com chave-valor e não é filha de Collection.
*/