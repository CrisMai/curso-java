package br.com.cris.logica;
// Calcular o IMC

import javax.swing.JOptionPane;

public class IMC {
	
	public static void main (String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura?");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 18.9 && imc <= 24.9) ? "IMC adequado" : "Fora do IMC adequado";
		msg = "IMC = " + imc + "\n" + msg;
		
		JOptionPane.showInputDialog(null, msg);
			
	}

}