
public class ArrayMultidimensional {
	
	public static void main (String[] args) {
		
		String [][] duas = {
			{"Ricardo", "M", "DF"},
			{"Sandra", "F", "MG"}};
			
		System.out.println(duas[0][0]);
		
		//Alterar os valores de um Array com várias dimensões
		duas[1][0] = "SANDRA";
		
		System.out.println(duas[1][0]);
	
	}
}