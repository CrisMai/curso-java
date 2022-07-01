package br.com.cris.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo3 {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/projects/curso-java/curso-java/texto.txt");
		
		System.out.println(Files.exists(path));
		System.out.println(Files.isDirectory(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.size(path));
		System.out.println(Files.getLastModifiedTime(path)); // Última vez que o arquivo foi executado.
		System.out.println(Files.getOwner(path));
		System.out.println(Files.probeContentType(path)); // Tipo de arquivo.
		
		
		/* EXCLUSÃO (DELETE) DE ARQUIVOS */
		Files.delete(path); // Esse método lança algumas exceções.
		Files.deleteIfExists(path); // Só deleta se o diretório realmente existiu.
		
		/* CRIAÇÃO (CREATE) DE ARQUIVOS */
		Path text = Paths.get("C:/projects/curso-java/curso-java/text.txt");
		
		/* COPIA (COPY) */
		Path copia = Paths.get("C:/projects/curso-java/curso-java/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		/* MOVER (MOVE) */
		Path mover = Paths.get("C:/projects/curso-java/curso-java/move/text.txt");
		Files.createDirectories(mover.getParent());
		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);
		
		
	}

}
