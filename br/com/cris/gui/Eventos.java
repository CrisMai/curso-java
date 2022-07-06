package br.com.cris.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	

	JButton botao;
	
	public Eventos() {
		super("Eventos");
		
		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Foi Clicado");
		
	}
	
	public static void main(String[] args) {
		new Eventos();
		
	}

}

/* O tratamento de evento acontece quando é clicado
 sobre o botão, ele gera um evento e lança esse evento
 para cada um dos Listeners, executando os métodos
 actionPerformed desses Listeners.*/
