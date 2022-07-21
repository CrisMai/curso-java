package br.com.cris.logica;
import java.util.ArrayList;

public class ArrayListSimples {
	
	public static void main (String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add ("Branco");
		cores.add (0, "Azul");
		cores.add ("Verde");
		cores.add ("Roxo");
		
		System.out.println(cores.toString());
		
		//Verificar quantos elementos têm dentro do Array usando o método size
		System.out.println("Tamanho=" + cores.size());
		
		//Recuperar um elemento dentro do ArryList usando o método get
		System.out.println("Elemento2=" + cores.get(2));
		
		//Pesquisar o índice de um elemento usando o método indexOf
		System.out.println("Indice Roxo=" + cores.indexOf("Roxo"));
		
		//Remover elementos dentro do ArrayList usando o método remove
		cores.remove("Branco");
		
		//Verificar se o elemento existe dentro do ArrayList usando o método contains
		cores.contains("Roxo");
		System.out.println("Tem Cinza ? " + cores.contains("Cinza"));	
		
	}
}


/**
Collection Framework é um conjunto de classes que permite
mais flexibilidade na manipulação de listas.

ArrayList é possível adicionar elementos na nova lista, remover, pesquisar e recuperar
com muito mais facilidade. 
É necessário especificar o tipo de dados que quiser adicionar.

*/