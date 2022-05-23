import java.util.ArrayList;
import java.util.Scanner;

public class FluxoWhile {
	
	public static void main (String[] args) {
		
		//fluxo de repetição
		
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner (System.in);
		
		System.out.println ("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		
		while(! "FIM".equals (produto = s.nextLine())) {
			produtos.add(produto);
		}
		
		System.out.println(produtos.toString());
			
	}
}