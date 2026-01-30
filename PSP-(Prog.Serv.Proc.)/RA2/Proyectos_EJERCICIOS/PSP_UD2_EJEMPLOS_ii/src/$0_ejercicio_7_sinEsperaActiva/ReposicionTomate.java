package $0_ejercicio_7_sinEsperaActiva;

public class ReposicionTomate implements Runnable{
	private Tomate tomate;
	

	public ReposicionTomate(Tomate tomate) {
		this.tomate = tomate;
	}



	@Override
	public void run() {
		while (true) {
			try {
				synchronized (tomate) {
					tomate.reponerTomates();
					System.out.println("Reponedor de tomate trabajando... ");				
				}
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
	}

}
