package br.com.cris.logica;

public class OperEspeciais {
	
	public static void main (String[] args) {
		
		//int idade = 19;
		//String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
		
		//String sexo = "F", raca = "branca";
		
		//System.out.println(x);
		
		// Diâmetro : 2r
		double raio = 10;
		double diametro = 2 * raio;
		
		System.out.println(diametro);
		
		// Circunferência: 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		
		System.out.println(circunferencia);
		
		// Area PI r2
		double area = pi * (raio * raio);
		
		System.out.println(area);
			
	}

}

/** Operadores especiais
?: operador ternário
, separação de expressões
() chamada de método
(cast) coerção unária 

*/
