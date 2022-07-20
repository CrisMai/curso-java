package br.com.cris.threads;

public class ContaConjunta {
	
		private int saldo = 100;
		
		public int getSaldo() {
			return saldo;
		}
		
		public synchronized void sacar(int valor, String cliente) throws InterruptedException {
			if (saldo >= valor) {
				int saldoOriginal = saldo;
				System.out.println(cliente + " vai sacar");
				Thread.sleep(1000);
				saldo -= valor;
				String msg = cliente + "Sacou" + valor 
						+ " [Saldo Original=" + saldoOriginal 
						+", Saldo Final=" + saldo + "]";
			}
			else {
				System.out.println( " saldo insuficiente" + cliente );
			}
		}
	}


