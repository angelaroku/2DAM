package $3_actividad2_9;

import java.util.Random;

public class Actividad1 implements Runnable {
	private Destornillador destornillador;
	private Taladro taladro;
	private String nombreAgente;
	
	public Actividad1(Destornillador destornillador,
			Taladro taladro, String nombreAgente) {
		this.destornillador=destornillador;
		this.taladro=taladro;
		this.nombreAgente=nombreAgente;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				synchronized(destornillador) {
					synchronized(taladro) {				
						int tiempo=(new Random()).nextInt(150)+50;
						System.out.println(nombreAgente+" realiza la actividad 1 durante "+tiempo);
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
