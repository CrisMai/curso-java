package br.com.cris.poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 350;
		ferrari.segundosZeroACem = 3.1;
		
		Carro Koenigsegg = new Carro("Koenigsegg CCXR", 430, 3);
		
		System.out.print(ferrari.modelo);

	}

}
