package br.com.cris.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(2020, Calendar.MAY, 18);
		Date date = c.getTime(); 
		
		/* FORMATAÇÃO DE DATAS */
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		/* FORMATAÇÃO DE HORA*/
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		/* FORMATAÇÃO DE DATA E HORA*/
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		/* ESTILOS DE FORMATAÇÃO */
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		/* SimpleDateFormat */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
	}
	
}


