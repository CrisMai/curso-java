package br.com.cris.heranca;

public class Quadrado implements AreaCalculavel {
	
	
	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}







/*
Para utilizar uma interface utiliza a palavra
implements e o nome da interface que vai utilizar.
*/