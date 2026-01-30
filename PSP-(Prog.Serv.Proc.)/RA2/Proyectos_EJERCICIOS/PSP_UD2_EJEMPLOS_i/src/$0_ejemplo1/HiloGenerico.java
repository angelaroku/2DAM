package $0_ejemplo1;

public class HiloGenerico implements Runnable {
	
	private int tiempo;
	
	public HiloGenerico (int tiempo) {
		this.tiempo=tiempo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//estado redi
		try {
			System.out.println("Lanzado hilo con tiempo "+tiempo);
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
