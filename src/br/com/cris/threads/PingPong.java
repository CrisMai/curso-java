package br.com.cris.threads;

public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;

	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {

		new PingPong("ping", 1500).start();
		new PingPong("PONG", 2000).start();
		System.out.println();

	}

}

/* THREADS 
 Ciclo de vida de uma Thread:
 New => start();
 Run();
 Sleep();
 Stop();
 
 A vantagem do uso das Threads é que as atividade são
 executadas simultaneamente.
 O método Run é chamado pela JVM para executar a sua thread. 
 Com o método sleep a thread vai para um estado "esperando", ou seja, 
 passa aguardar para que aquele tempo passe e ela volte ao estado de 
 pronta para ser novamente interpretada pela JVM.
 
 */
