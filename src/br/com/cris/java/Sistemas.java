package br.com.cris.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;

public class Sistemas {

	public static void main(String[] args) throws IOException {
		
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		
		Console c = System.console(); // Recupera um objeto do tipo console
		System.out.print("Usuario: ");
		String user = c.readLine();
		System.out.print("Senha: ");
		char[] pass = c.readPassword();
		System.out.println("Usuario=" + user + "Senha=" + new String(pass));
		
		
		Runtime.getRuntime().exec("notepad");
		

	}

}


/* O objeto console pode ser muito útil se estiver 
 construindo um aplicativo e a interface gráfica
 desse aplicativo seja o prompt de comando, e nesse
 promptd de comando eventualmente você precise capturar
 a senha do usuário.
 
 A classe Runtime permite que seja executado um
 programa diretamente no sistema operacional.
 */