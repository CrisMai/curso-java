
public class CachorroTest {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();                            
		pitbull.raça = "Pit Bull"; //Atributos do objeto Cachorro
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raça = "Vira-Lata";
		viralata.tamanho = 30;
		viralata.latir();

	}

}
