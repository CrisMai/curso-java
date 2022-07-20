package br.com.cris.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	
	public static long carregarMemoria() {
		List<Integer> list = new ArrayList<>();
		for (int i=0; i < 100_000; i++) {
			list.add(i);
		}
		return Runtime.getRuntime().freeMemory();
		
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		int MB = 1_048_576; // Total de bytes em 1MB
		double total = rt.maxMemory() / MB; // Método que retorna a quantidade de memória disponível para a JVM executar.
		
		double inicio = total - (carregarMemoria() / MB);
		
		rt.runFinalization();
		rt.gc();
		
		double fim = total - (rt.freeMemory() / MB);
		
		System.out.println("Inicio:" + inicio + "Fim:" + fim);
	}

}


/* Garbage Collector
 Realiza a limpeza de seus dados.
 Alguns métodos da classe Runtime interagem 
 com o Garbage Collector: 
 gc() => solocita à máquina virtual para reciclar objetos que não
 estão sendo mais usados.
 runFinalization() => finalizadores de objetos.
 freeMemory() => estimativa de bytes livres memória.
 totalMemory() => retorna o total de Bytes na memória do sistema.
 maxMemory() => quantidade máxima de memória virtual.
 
 */

