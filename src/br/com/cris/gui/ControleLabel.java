package br.com.cris.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel() {
		super("Label");
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu Tooltip"); 
		
		Font font = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(font);
		label.setForeground(Color.yellow);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ControleLabel();	
	}

}
