package $4_ejercicio_11_parkinVersionClase;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Garaje garaje = new Garaje();
		String matricula;
		Random random = new Random();

		while (true) {
			try {
				matricula = "M" + random.nextInt(1000);
				Thread coche = new Thread(new Coche(matricula, garaje));
				coche.start();
				Thread.sleep((random.nextInt(500)) + 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
