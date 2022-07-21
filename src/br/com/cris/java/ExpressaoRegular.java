package br.com.cris.java;

public class ExpressaoRegular {
	
	public static void main(String[] args) {
		
		boolean a = "Java".matches("java");
		System.out.println(a);
		
		/* MODIFICADORES
		 (?i), ignora maiúscula e minúscula
		 (?x), comentários
		 (?m), multilinhas
		 (?s), dottal */
		
		boolean b = "Java".matches("(?i)java");
		System.out.println(b);
		
		/*METACARACTERES
		 .d - qualquer caracter
		 \d - dígitos
		 \D -não é dígito
		 \s - espaços
		 \S - não é espaço
		 \w - letra
		 \W - não é letra */
		
		boolean c = "a".matches("\\d");
		System.out.println(c);
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		//boolean d = "70987-890".matches(cep);
		//System.out.println(d);
		
		/*QUANTIFICADORES
		 X{n} - X, exatamente n vezes
		 X{n,} - X, pelo menos n vezes
		 X{n, m} - X, pelo menos n mas não mais que m vezes
		 X? - X, 0 ou 1 vez
		 X* - X, 0 ou + vezes
		 X+ - X, 1 ou + vezes */
		
		boolean d = "70987-890".matches("\\d{5}-\\d{3}");
		System.out.println(d);
		
		/* METACARACTERE DE FRONTEIRA
		 ^ inicia
		 $ finaliza
		 | ou */
		
		boolean e = "Pier21".matches("^Pier.*");
		//boolean e = "Pier21".matches(".*21$");
		//boolean e = "sim".matches("sim|não");
		System.out.println(e);
		
		/* AGRUPADORES
		 [...] - agrupamento
		 [a-z] - alcance
		 [a-e][i-u] - união
		 [a-z&&[aeiou]] - interseção
		 [^abc] - exceção
		 [a-z&&[^m-p]] - subtração
		 \x - fuga literal */
		
		boolean f = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}"); // Validação de e-mail
		System.out.println(f);
	}

}


/* Expressão Regular: padrão de pesquisa e substituição de texto.
São uteis para validar dados de um programa e assegurar que esses
dados estejam em determinado formato.
*/