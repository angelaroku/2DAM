package $5_ejercicioLibro2_tallerpintura;

import java.util.Random;

public class ColorVerde implements Runnable{
	
	private DepositoAmarillo amarillo;
	private DepositoCian cian;
	
	public ColorVerde(DepositoAmarillo amarillo, DepositoCian cian) {
		this.amarillo = amarillo;
		this.cian = cian;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (amarillo) {
					synchronized (cian) {
						System.out.println("Mezclando color verde...");
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