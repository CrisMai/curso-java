package br.com.cris.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {
	
	public static void main(String[] args) {
		
		String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "branco", "verde"};
		
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
	}

}

/* As classes que implementam as coleções
 set não aceitam duplicatas de registros.*/
