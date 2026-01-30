package $5_ejercicioLibro2_tallerpintura;

import java.util.Random;

public class ColorRojo implements Runnable{
	
	private DepositoAmarillo amarillo;
	private DepositoMagenta magenta;
	
	public ColorRojo (DepositoMagenta magenta, DepositoAmarillo amarillo) {
		this.amarillo = amarillo;
		this.magenta = magenta;
	}

	@Override
	public void run() {
		try {
			while (true) {
				synchronized (amarillo) {
					synchronized (magenta) {
						System.out.println("Mezclando color rojo...");
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