package $2_interbloqueo;

public class Proceso1 implements Runnable{
	
	private DiscoDuro discoDuro;
	private RAM ram;
	
	public Proceso1(DiscoDuro discoDuro, RAM ram) {
		this.discoDuro=discoDuro;
		this.ram=ram;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(discoDuro) {
			try {
				System.out.println("Proceso 1 adquier disco duro");
				Thread.sleep(10000);
				synchronized(ram) {
					System.out.println("Proceso 1 adquier ram");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
