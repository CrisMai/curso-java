package br.com.cris.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/projects/curso-java/curso-java/mytext.txt");
		System.out.println("AbsolutePath: " + path.toAbsolutePath());
		System.out.println("GetParente: " + path.getParent());
		System.out.println("GetRoot: " + path.getRoot());
		System.out.println("FileName: " + path.getFileName());
		System.out.println("Path: " + path);
		
		/* CRIAÇÃO DE DIRETÓRIOS */
		
		Files.createDirectories(path.getParent());
		
		/* ESCREVER E LER ARQUIVOS */
		
		byte[] bytes = "Meu texto".getBytes();
		Files.write(path, bytes);
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
	}

}
