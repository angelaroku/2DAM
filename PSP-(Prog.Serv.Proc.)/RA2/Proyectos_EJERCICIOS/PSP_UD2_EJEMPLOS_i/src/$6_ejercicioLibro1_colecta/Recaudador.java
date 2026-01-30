package $6_ejercicioLibro1_colecta;

import java.util.Random;

public class Recaudador implements Runnable{
	
	private Colecta colecta;
	private String nombre;
	
	public Recaudador(Colecta colecta,String nombre) {
		this.colecta=colecta;
		this.nombre=nombre;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean fin=false;
		while(true) {
			try {
				int tiempo = (new Random()).nextInt(191) + 10;
				Thread.sleep(tiempo);
				int cantidad = (new Random()).nextInt(21) + 4;
				fin=colecta.addCantidad(cantidad);
				if ((fin)) {
					break;
				}				
				System.out.println(nombre+  " recauda "+cantidad
						+" habiendo un total de "+colecta.getCantidad());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
