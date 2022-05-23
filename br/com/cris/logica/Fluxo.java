

public class Fluxo {
	
	public static void main (String[] args) {
		
		int idade = 31;
		if (idade <= 11) {
			System.out.println ("Crianca");
		} else if (idade > 11 && idade <= 18) {
			System.out.println ("Adolescente");
		} else if (idade > 18 && idade <= 60) {
			System.out.println ("Adulto");
		} else {
			System.out.println ("Idoso");
		}
	
	}
}