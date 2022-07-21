package br.com.cris.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {
	
	public static void main(String[] args) {
		
		/* 01 de Jan 1970 */
		System.out.println(System.currentTimeMillis());
		
		/* CRIAR UMA DATA */
		Date agora = new Date();
		System.out.println(agora);

		Date data = new Date(1_000_000_000L);
		System.out.println(data);
		
		/* OUTROS MÉTODOS CONSTRUTORES DA CLASSE DATE */
		data.getTime(); // Recupera o tempo atual em milisegundos
		data.setTime(1_000_000_000L); // Define um tempo em milisegundos
		data.compareTo(agora); // Compara as datas
		
		/* MANIPULAÇÃO DE DATAS 
		 * É usado a classe abstrata Calendar. Não deve ser inicializada.
		 * Essa classe possui o método getInstance*/
		Calendar c = Calendar.getInstance();
		c.set(1985,Calendar.JULY, 12);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.YEAR, 1983); // Altera o ano
		c.set(Calendar.MONTH, Calendar.MAY); // Altera o mês
		c.set(Calendar.DAY_OF_MONTH, 12); // Altera o dia
		System.out.println(c.getTime());
		
		
		c.clear(); // Limpa os campos que desejar
		c.add(Calendar.DAY_OF_MONTH, 1); // Permite adicionar unidades de tempo (dia, mês, ano)
		c.add(Calendar.DAY_OF_MONTH, -1); // Permite diminuir unidades de tempo (dia, mês, ano)
		
		/* SAUDAÇÃO */
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora <= 12) {
			System.out.println("Bom dia");
		}
		else if (hora > 12 && hora < 18) {
			System.out.println("Boa Tarde");
		} 
		else {
			System.out.println("Boa noite");
		}
			
		
	}
}
