package $1_condicioncarrera;

public class SumaArray2Hilos2Solucion2 {
	
	private static final int TAMANN0=100_0000;
	private static int contador=0;
		
	public static void main(String[] args) {
		Thread hiloSuma=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					incremento();
				}
			}
			
		});
		Thread hiloResta=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					decremento();
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
	
	private static synchronized void incremento() {
		contador++;
	}
	
	private static synchronized void decremento() {
		contador--;
	}

}
