package parking;

import java.util.Random;

public class Camion implements Runnable{

	private Garaje garaje;
	private String matricula;
	
	public Camion(Garaje garaje, 
			String matricula) {
		this.garaje=garaje;
		this.matricula=matricula;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			garaje.aparcarCamion(matricula);
			// Tiempo estacionado
			Thread.sleep((new Random()).nextInt(800));
			Thread.sleep(100);
			garaje.salirCamion(matricula);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
