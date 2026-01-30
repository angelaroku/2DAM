package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

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
					jamon.notifyAll();
					System.out.println("Reponedor de jamon trabajando... "+jamon.getCantidad());
				}
				Thread.sleep(1200);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
