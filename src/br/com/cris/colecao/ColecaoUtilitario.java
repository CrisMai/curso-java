package br.com.cris.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guarana");
		list.add("Uva");
		list.add("Morango");
		list.add("Manga");
		list.add("Banana");
		list.add("Abacaxi");
		System.out.println(list);
		
		Collections.sort(list); // Collections manipula todo tipo de coleção Java.
		System.out.println(list); // Método sort só é encontrado na classe Collections.
		
		Collections.reverse(list); // Reverse inverte a ordem.
		System.out.println(list);
		
		Collections.shuffle(list); // Embaralha os dados.
		System.out.println(list);
		
		Collections.addAll(list, "Laranja", "Uva", "Limao"); 
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Uva"));
		
		List<String> list2 = Arrays.asList("Acerola", "Maca");
		boolean d = Collections.disjoint(list, list2); // Verifica se na minha lista principal tem os elementos informados na lista secundária.
		
		
		// Coleção não modificável
		
		Collection<String> constante =
				Collections.unmodifiableCollection(list); // Método que não permite modificar uma coleção.
	
	}

}
