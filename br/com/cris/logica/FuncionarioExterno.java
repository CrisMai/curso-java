package br.com.cris.logica;

import br.com.cris.poo.Funcionario;


public class FuncionarioExterno {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Cris"; //não deixa ter acesso com o modificador private e package
		f.getNome();

	}

}
