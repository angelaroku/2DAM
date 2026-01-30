package $5_ejercicio_12_parkingcamiones;

public class Garaje {
	
	private final int NUMERO_PLAZAS=6;
	private final String LIBRE="Libre";
	private int plazasOcupadas;
	private GarajeVista garajeVista;
	
	private String[] plazas;
	
	public Garaje(GarajeVista garajeVista) {
		plazas=new String[NUMERO_PLAZAS];
		for (int i=0; i<NUMERO_PLAZAS; i++) {
			plazas[i]=LIBRE;
		}
		plazasOcupadas=0;
		this.garajeVista=garajeVista;
	}
	
	public synchronized void aparcar(String matricula) {
		try {
			while (plazasOcupadas == NUMERO_PLAZAS) {
				wait();
			}
			for (int i = 0; i < NUMERO_PLAZAS; i++) {
				if (plazas[i].equals(LIBRE)) {
					plazas[i] = matricula;
					plazasOcupadas++;
					System.out.println("Coche con matricula "
							+matricula+" aparcando en plaza "+i);
					garajeVista.aparcar(matricula, i);
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void salir(String matricula) {
		for (int i = 0; i < NUMERO_PLAZAS; i++) {
			if (plazas[i].equals(matricula)) {
				plazas[i] = LIBRE;
				plazasOcupadas--;
				System.out.println("Coche con matricula "+matricula+" saliendo de la plaza "+i);
				garajeVista.salir( i);
				break;
			}
		}
		notify();
	}
	
	public synchronized void aparcarCamion(String matricula) {
		try {
			while (plazasOcupadas == NUMERO_PLAZAS || plazasOcupadas == NUMERO_PLAZAS-1) {
				wait();
			}
			for (int i = 1; i < NUMERO_PLAZAS-1; i+=2) {
				if (plazas[i].equals(LIBRE)) {
					plazas[i] = matricula;
					plazas[i+1] = matricula;
					plazasOcupadas+=2;
					System.out.println("Camion con matricula "
							+matricula+" aparcando en plaza "+i+" y "+(i+1));
					garajeVista.aparcar(matricula, i);
					garajeVista.aparcar(matricula, i+1);
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void salirCamion(String matricula) {
		for (int i = 1; i < NUMERO_PLAZAS-1; i+=2) {
			if (plazas[i].equals(matricula)) {
				plazas[i] = LIBRE;
				plazas[i+1] = LIBRE;
				plazasOcupadas-=2;
				System.out.println("Camion con matricula "+matricula+" saliendo de la plaza "+i+ "y "+(i+1));
				garajeVista.salir( i);
				garajeVista.salir( i+1);
				break;
			}
		}
		notify();
		notify();
	}

}
