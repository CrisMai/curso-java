package br.com.cris.colecao;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {
	
	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("FR", "Franca");
		pais.put("CH", "Chile");
		pais.put("USA", "Estados Unidos");
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR")); // Método que informa se determinada chave existe ou não no mapa.
		System.out.println(pais.containsValue("India")); // Método que informa se determinado valor existe ou não no mapa.
		pais.remove("USA");
		System.out.println(pais);
	}

}
