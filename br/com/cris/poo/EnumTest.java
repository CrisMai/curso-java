package br.com.cris.poo;

public class EnumTest {
	
	public static final double PI = 3.14;

	public static void main(String[] args) {
		
		System.out.println(PeçasXadrez.BISPO);
		System.out.println(Medida.M.titulo);
		
		for(Medida m : Medida.values()) {
			
			System.out.print(m  +  "  :  " + m.titulo);
			
		}	
		
	}

}

/*
 * 			ENUMERAÇÕES
 * Constantes profissionais java.
 * O modificador static garante que variáveis, métodos e
 * constantes sejam de escopo global, ou seja, pertencem
 * a uma classe.
 * As enumerações foram construídas para a criação de 
 * constantes static, final utilizadas dentro de sua 
 * aplicação.
 */
