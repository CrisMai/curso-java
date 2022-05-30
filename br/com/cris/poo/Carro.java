package br.com.cris.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
	this.modelo = modelo;
	this.velocidadeMaxima = velocidadeMaxima;
	this.segundosZeroACem = segundosZeroACem;
	
	}

}


/*
 *            CONSTRUTORES
 * São blocos de comando que podem ser usados para 
 * inicializar os objetos.Todas as classes têm construtores,
 * mesmo não sendo declarados explicitamente.
 * Um construtor não retorna um valor, já o método
 * retorna valores.
 * Todo construtor têm o mesmo nome da classe.
*/
