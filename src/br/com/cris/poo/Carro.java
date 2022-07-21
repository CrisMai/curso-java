package br.com.cris.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
		
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

/*
 * COMPOSIÇÃO
 * Alguns objetos podem ser compostos de outros objetos, por exemplo,
 * um carro é composto de outros objetos, sendo um muito importante - o motor. 
 * E o relacionamento que o carro tem com um objeto motor é o relacionamento 
 * de composição, pois o carro é composto por 1 motor.
 */
