package $1_condicioncarrera;

public class SumaArray2Hilos {
	
	private static final int TAMANN0=100_0000;
	private static int contador=0;
		
	public static void main(String[] args) {
		Thread hiloSuma=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					contador++;
				}
			}
			
		});
		Thread hiloResta=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<TAMANN0; i++) {
					contador--;
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
