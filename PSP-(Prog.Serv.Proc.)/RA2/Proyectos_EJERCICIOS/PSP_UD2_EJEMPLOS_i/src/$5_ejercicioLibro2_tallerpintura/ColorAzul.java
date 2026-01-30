package $5_ejercicioLibro2_tallerpintura;

import java.util.Random;

public class ColorAzul implements Runnable{

	private DepositoMagenta magenta;
	private DepositoCian cian;
	
	public ColorAzul(DepositoMagenta magenta, DepositoCian cian) {
		this.magenta = magenta;
		this.cian = cian;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (cian) {
					synchronized (magenta) {
						System.out.println("Mezclando color azul...");
						int tiempo = (new Random()).nextInt(400)+100;
						Thread.sleep(tiempo);
					}
				}
				Thread.sleep((new Random()).nextInt(1000)+1000);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}