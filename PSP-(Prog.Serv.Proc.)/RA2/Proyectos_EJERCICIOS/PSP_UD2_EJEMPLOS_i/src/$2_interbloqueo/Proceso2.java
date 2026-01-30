package $2_interbloqueo;

public class Proceso2 implements Runnable{
	private DiscoDuro discoDuro;
	private RAM ram;
	
	public Proceso2(RAM ram, DiscoDuro discoDuro) {
		this.ram=ram;
		this.discoDuro=discoDuro;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(ram) {
			System.out.println("Proceso 2 adquiere RAM");
			try {
				Thread.sleep(10000);
				synchronized(discoDuro) {
					System.out.println("Proceso 2 aquiere discoduro");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
