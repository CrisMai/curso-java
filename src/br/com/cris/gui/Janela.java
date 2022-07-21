package br.com.cris.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		super("Minha Janela");
		
		// Botão
		JButton botao = new JButton("Clique");
		getContentPane().add(botao); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação
		setSize(300,300); // Tamanho da janela
		setVisible(true); // Visível ou não
		
	}
	
	public static void main(String[] Args) {
		new Janela();
		
	}

}




/* Toda interface gráfica é apresentada dentro de uma janela.
 A classe que representa uma janela é a JFrame.
 Dentro de uma janela temos o Container onde podemos colocar 
 componentes - botões, imagens, campos de texto.
 */