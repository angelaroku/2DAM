package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

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
					tomate.notifyAll();
					System.out.println("Reponedor de tomate trabajando... "+tomate.getCantidad());					
				}
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
	}

}
