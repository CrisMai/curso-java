package br.com.cris.poo;

public class Matematica {
	
	public int maior(int um, int dois) { //método com retorno e com 2 parâmetros
		if(um > dois) {
			return um;
		}
		else {
			return dois;
		}
		
	}
	
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}

}
