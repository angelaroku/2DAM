package parking;

import java.util.Random;

public class Coche implements Runnable{
	
	private Garaje garaje;
	private String matricula;
	
	public Coche(Garaje garaje, 
			String matricula) {
		this.garaje=garaje;
		this.matricula=matricula;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		
		try {
			garaje.aparcarCoche(matricula);
			// Tiempo estacionado
			Thread.sleep((new Random()).nextInt(200));
			Thread.sleep(5000);
			garaje.salirCoche(matricula);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
