package br.com.cris.heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha carijo = new Galinha();
		carijo.fazerBarulho();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal );

	}

}



/*
 * Como criar uma HERANÇA?
 * Procurar os objetos que possuam atributos e comportamentos 
 * em comum.
 * 
 * Quando tiver um comportamento que deve ser compartilhado
 * entre várias classes do mesmo tipo -> use a Herança.
 * 
 * Quando uma classe é uma subclasse de outra é pq ela
está herdando atributos e métodos da superclasse, ou seja,
pode utilizar esses atributos como se fossem aplicados
dentro dela.

Para verificar o tipo de uma classe usa o operador
instanceof.

 */
