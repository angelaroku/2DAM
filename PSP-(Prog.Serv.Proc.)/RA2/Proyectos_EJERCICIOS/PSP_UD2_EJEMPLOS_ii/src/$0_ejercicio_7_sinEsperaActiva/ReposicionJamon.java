package $0_ejercicio_7_sinEsperaActiva;

import java.util.Random;

public class ReposicionJamon implements Runnable {

	private Jamon jamon;

	public ReposicionJamon(Jamon jamon) {
		this.jamon = jamon;
	}

	@Override
	public void run() {
		while (true) {
			try {
				synchronized (jamon) {
					jamon.reponerJamon();
					System.out.println("Reponedor de jamon trabajando... ");
				
				}
				Thread.sleep(1200);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
