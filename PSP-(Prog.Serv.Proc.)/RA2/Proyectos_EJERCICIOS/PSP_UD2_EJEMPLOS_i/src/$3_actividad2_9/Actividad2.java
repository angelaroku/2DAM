package $3_actividad2_9;

import java.util.Random;

public class Actividad2 implements Runnable{
	
	private Destornillador destornillador;
	private Alicate alicate;
	private String nombreAgente;
	
	public Actividad2(Destornillador destornillador,
			Alicate alicate,
			String nombreAgente) {
		this.destornillador=destornillador;
		this.alicate=alicate;
		this.nombreAgente=nombreAgente;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				synchronized(alicate) {
					synchronized(destornillador) {
						int tiempo=(new Random()).nextInt(150)+50;
						System.out.println(nombreAgente+" realiza la actividad 2 durante "+tiempo);			
						Thread.sleep(tiempo*10);
					}
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
