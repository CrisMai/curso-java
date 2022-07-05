package br.com.cris.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {
	
	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance(); // Formatação de números genéricos
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getIntegerInstance(); // Formatação de números inteiros
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance(); // Formatação de números percentuais
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance(); // Formatação de moedas
		System.out.println(f.format(saldo));
		
		/* INTERNACIONALIZAÇÃO DE NÚMEROS */
		
		f = NumberFormat.getCurrencyInstance(Locale.US); 
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
		System.out.println(f.format(saldo));
		
		/* CONVERSÃO DE VALORES */
		f = NumberFormat.getCurrencyInstance(); 
		System.out.println(f.parse("R$ 1.000,34"));
			
	}

}
