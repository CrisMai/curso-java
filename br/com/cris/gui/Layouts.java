package br.com.cris.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {
	
	// Construtor dessa classe
	public Layouts() {
		
		super("Layouts");
		
		Container c = getContentPane();
		// Layout padrão - BorderLayout
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		
		// Layout simples - FlowLayout
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);	
	}
	
	public static void main(String[] Args) {
		
		new Layouts();
		
	}

}
