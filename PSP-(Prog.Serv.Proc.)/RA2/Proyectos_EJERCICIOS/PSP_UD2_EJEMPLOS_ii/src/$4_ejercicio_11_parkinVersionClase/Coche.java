package $4_ejercicio_11_parkinVersionClase;

public class Coche implements Runnable {

	private String matricula;
	private Garaje garaje;

	public Coche(String matricula, Garaje garaje) {
		this.matricula = matricula;
		this.garaje = garaje;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			garaje.aparcar(matricula);
			// Thread.sleep((new Random().nextInt(9000)) + 500);
			Thread.sleep(20000);
			garaje.salir(matricula);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
