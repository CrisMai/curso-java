package br.com.cris.poo;

public class Conta {
	
	String cliente;
	double saldo;
	
	void exibeSaldo() { //método sem retorno e sem parâmetro
		
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	void saca(double valor) { //método sem retorno, mas com 1 parâmetro
		
		//saldo = saldo - valor;
		saldo -= valor;	
	}
	
	void deposita(double valor) {
		
		saldo += valor;
	}
	
	void transferePara(Conta destino, double valor) { //método sem retorno, mas com 2 parâmetros
		
		this.saca(valor);
		destino.deposita(valor);	
	}

}
