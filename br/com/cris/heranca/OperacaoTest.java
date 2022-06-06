package br.com.cris.heranca;

public class OperacaoTest {
	
	public static void calcule(OperacaoMatematica o, double x, double y ) {
		
		System.out.println(o.calcular(x, y));
		
	}

	public static void main(String[] args) {
		
		calcule(new Soma(), 5, 5);
		calcule(new Multiplicacao(), 5, 5);	

	}

}


/*
Cada operação tem poliformas, por isso o nome de polimorfismo e se
comporta de maneira diferente também.

*/
