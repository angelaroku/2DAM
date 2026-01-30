package $0_ejercicio_7_sinEsperaActiva;

public class ReposicionLechuga implements Runnable{
	
	private Lechuga lechuga;
	
	
	public ReposicionLechuga(Lechuga lechuga) {
		this.lechuga = lechuga;
	}


	@Override
	public void run() {
		while (true) {
			try {
				synchronized (lechuga) {
					lechuga.reponerLechuga();
					System.out.println("Reponedor de lechuga trabajando... ");
					
				}
				Thread.sleep(800);


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		
	}

}
