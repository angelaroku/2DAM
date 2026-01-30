package parking;

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
	
	public synchronized void aparcarCoche(String matricula) {
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
	
	public synchronized void aparcarCamion(String matricula) {
		try {
			while (plazasOcupadas == NUMERO_PLAZAS) {
				wait();
			}
			
			
			for (int i = 0; i < NUMERO_PLAZAS; i++) {
				
				int segundaPlaza =i+1;
				if (plazas[i].equals(LIBRE) && plazas[segundaPlaza].equals(LIBRE)) {
					plazas[i] = matricula;
					plazas[segundaPlaza] = matricula;
					
					plazasOcupadas++;
					plazasOcupadas++;
					
					System.out.println("Camion con matricula "
							+matricula+" aparcando en plazas "+ i +", "+ segundaPlaza);
					garajeVista.aparcar(matricula, i);
					break;
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public synchronized void salirCoche(String matricula) {
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
	
	public synchronized void salirCamion(String matricula) {
		for (int i = 0; i < NUMERO_PLAZAS; i++) {
			if (plazas[i].equals(matricula)) {
				plazas[i] = LIBRE;
				plazasOcupadas--;
				plazasOcupadas--;
				System.out.println("Camion con matricula "+matricula+" saliendo de la plaza "+i);
				garajeVista.salir( i);
				break;
			}
		}
		notify();
	}
	
	
}
