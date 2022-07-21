package br.com.cris.poo;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Cris";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Laís";
		destino.saldo = 1_000.00;
		destino.exibeSaldo();
		
		
		conta.transferePara(destino, 1000.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
	
	}

}
