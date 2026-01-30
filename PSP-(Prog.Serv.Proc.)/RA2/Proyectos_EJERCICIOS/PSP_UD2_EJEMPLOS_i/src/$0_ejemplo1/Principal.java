package $0_ejemplo1;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio proceso");
		Thread hilo1 = new Thread(new HiloGenerico(20000)); //segundos = 20 segundos
		hilo1.setName("Hilo 20 segundos");
		hilo1.start();
		
		Thread hilo2 = new Thread(new HiloGenerico(25000)); //segundos = 25 segundos
		hilo2.setName("Hilo 25 segundos");
		hilo2.start();
		
		Thread hilo3 = new Thread(new HiloGenerico(30000)); //segundos = 30 segundos
		hilo3.setName("Hilo 30 segundos");
		hilo3.start();
			
		//equivalente a waitfor() en procesos = join() en los hilos
		
		try {
			hilo1.join();
			hilo2.join();
			hilo3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin de proceso");
		
	}
}
