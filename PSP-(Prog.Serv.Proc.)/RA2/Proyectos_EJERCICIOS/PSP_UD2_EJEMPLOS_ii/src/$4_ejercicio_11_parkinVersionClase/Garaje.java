package $4_ejercicio_11_parkinVersionClase;

public class Garaje {

	private String[] plazas;
	private final int NUMEROPLAZAS = 10;
	private final String LIBRE = "LIBRE";
	private int plazasLibres = NUMEROPLAZAS;

	public Garaje() {
		this.plazas = new String[NUMEROPLAZAS];
		for (int i = 0; i < NUMEROPLAZAS; i++) {
			plazas[i] = LIBRE;
		}
	}

	public synchronized void aparcar(String matricula) {
		// int i;
		try {
			while (plazasLibres == 0) {
				System.out.println("El coche con matricula: " + matricula + " está esperando");
				wait();
			}
			for (int i = 0; i < plazas.length; i++) {
				if (plazas[i].equals(LIBRE)) {
					plazas[i] = matricula;
					plazasLibres--;
					System.out.println("Coche con matricula " + matricula + " entra al garaje. Quedan " + plazasLibres
							+ " libres.");
					break;
				}

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(i);
		// if (i == NUMEROPLAZAS) {
		// System.out.println("Coche esperando: " + matricula);
		// }
	}

	public synchronized void salir(String matricula) {

		for (int i = 0; i < plazas.length; i++) {
			if (plazas[i].equals(matricula)) {
				plazas[i] = LIBRE;
				plazasLibres++;
				System.out.println("Coche con matricula " + matricula + " sale del garaje. " + " Quedan " + plazasLibres
						+ " libres.");
				break;
			}
		}
		notify();
	}

}
