package br.com.cris.logica;

public class FluxoFor {
	
	public static void main (String[] args) {
		
		String texto = "";
		
		for (int i=0; i<3; i++) {
			texto += i + ",";
		}
		
		System.out.println (texto);
		
	}
}