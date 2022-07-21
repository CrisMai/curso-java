package br.com.cris.poo;


public class Funcionario {
	
	//private String nome; Deixa ter acesso dentro da mesma classe
	
	//String nome; //Package são acessíveis por todos os membros dentro do mesmo pacote
	
	public String nome;
	
	
	public String getNome() { //método public é acessível por todas as outras classes
		return nome;
	}

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Cris";
		
	}

}
