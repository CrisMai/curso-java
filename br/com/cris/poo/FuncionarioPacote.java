package br.com.cris.poo;

public class FuncionarioPacote {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Cris"; //não deixa ter acesso com o modificador private
		f.getNome();

	}

}
