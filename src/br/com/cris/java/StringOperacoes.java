package br.com.cris.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once"; // Criando string com aspas duplas;
		String s2 = s1 + "Run AnyWhere"; // Concatenacao de strings;
		String s3 = new String("Java Vitual Machine"); // Método construtor da string;
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		
		// OPERAÇÕES com strings
		int tamanho = s1.length(); // Acessa o nº de caracteres dentro da string;
		char letra = s1.charAt(0); // Localiza determinado caractere dentro da string;
		String texto = s1.toString(); // Retorna a própria string;
		
		// LOCALIZAÇÃO de caracteres e strings
		int posicao = s3.indexOf('v'); // método que retorna a posição de um caractere;
		int ultima = s3.lastIndexOf('a'); // retorna a posição do último caractere informado;
		boolean vazia = s3.isEmpty(); // Verifica se a string está ou não vazia;
		//System.out.println(posicao);
		
		// COMPARAÇÃO de strings
		String xti = "XTI";
		boolean x = xti.equals("xti"); // Método que compara os valores de duas strings;
		boolean y = xti.equalsIgnoreCase("xti"); // Ignora as diferenças entre letras maiúsculas e minúsculas;
		System.out.println(y);
		
		// EXTRAÇÃO de dados 
		String l = "O Brasil é Lindo";
		String sl = l.substring(11); // Método que permite encontrar uma substring; 
		sl = l.substring(2,8); // Método que pode ser passado o inicio e o fim de uma string;
		
		// MODIFICAÇÃO de string
		sl = l.concat(" que Maravilha"); // Concatena strings;
		sl = l.replace('s', 'z'); // Troca caracteres dentro da string;
		sl = l.toUpperCase(); // Converte todas as letras em maiúsculas;
		sl = l.toLowerCase(); // Converte todas as letras em minúsculas;
		sl = l.trim(); // Remove todos os espaços antes e no final da string;
		

	}

}
