package $5_ejercicio_12_parkingcamiones;

public class Camion implements Runnable{
	
	private Garaje garaje;
	private String matricula;
	
	public Camion(Garaje garaje, String matricula) {
		this.garaje=garaje;
		this.matricula=matricula;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			garaje.aparcarCamion(matricula);
			// Tiempo estacionado
			//Thread.sleep((new Random()).nextInt(2000));
			Thread.sleep(10000);
			garaje.salirCamion(matricula);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
