package br.com.cris.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 350;
		ferrari.segundosZeroACem = 3.1;
		
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; //adiciona o motor ao carro
		
		Carro K = new Carro("Koenigsegg CCXR", 430, 3);
		Motor v8 = new Motor("V8", 1018);
		K.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.print(bugatti.modelo);
		System.out.print(bugatti.motor.potencia);
		
	}

}
