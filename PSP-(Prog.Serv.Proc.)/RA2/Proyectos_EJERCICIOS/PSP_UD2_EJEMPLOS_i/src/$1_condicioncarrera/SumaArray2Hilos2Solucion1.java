package $1_condicioncarrera;

import java.util.concurrent.atomic.AtomicInteger;

public class SumaArray2Hilos2Solucion1 {
	
	private static final int TAMANN0=100_0000;
	private static AtomicInteger contador=new AtomicInteger();
		
	public static void main(String[] args) {
		Thread hiloSuma=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					contador.incrementAndGet();
				}
			}
			
		});
		Thread hiloResta=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					contador.decrementAndGet();
				}
			}
			
		});
		hiloSuma.start();
		hiloResta.start();
		try {
			hiloSuma.join();
			hiloResta.join();			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Resultado: "+contador);
		
	}

}
