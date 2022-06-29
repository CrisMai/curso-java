package br.com.cris.java;

public class StringMutavel {
	
	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		// Métodos da StringBuffer e StringBuilder
		s1.toString();
		s1.length();
		s1.capacity(); // Informa a capacidade de armazenamento de novos caracteres sem alocar mais memória.
		//s1.reverse(); // Modifica a ordem dos caracteres.
		
		s1.append(" Trabalhando "); // Adiciona novos conteudos sem criar novos objetos.
		System.out.println(s1);
		
		String url = new StringBuilder("www.java.com").delete(0, 4).toString(); // Método delete remove conteudos.
		System.out.println(url);
		
	}

}



/*
 * StringBuffer e StingBuilder: permite a modificação de textos.
 * A StringBuffer tem métodos sincronizados, já a 
 * StringBuilder não tem esses métodos. 
 */
