package br.com.cris.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/projects/curso-java/curso-java/mytext.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		/* ESCRITA DE ARQUIVOS */
		try (BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Texto\n");
			w.write("Outro Texto\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		/* LEITURA */
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {

			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
