
//Desafio Fibonacci

public class DesafioFibo {
	
	public static void main (String[] args) {
		
		int anterior = 0;
		int proximo = 1;
		System.out.println(anterior);
		
		while(proximo < 50) {
			System.out.println(proximo);
			proximo = proximo + anterior; //próximo número fibonacci
			anterior = proximo - anterior; //atualizando o número anterior (soma - anterior)
		
		}
			
	}
}