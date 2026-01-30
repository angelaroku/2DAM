package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

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
					lechuga.notifyAll();
					System.out.println("Reponedor de lechuga trabajando... "+lechuga.getCantidad());				
				}
				Thread.sleep(800);


			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		
	}

}
