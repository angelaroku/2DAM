package $4_ejercicioLibro2_8;

import java.util.Random;

public class Reserva implements Runnable{
	Libro[] libros;
	String nombreEstudiante;
	
	public Reserva(Libro[] libros, String nombreEstudiante) {
		this.libros=libros;
		this.nombreEstudiante=nombreEstudiante;
	}
	@Override
	public void run() {
		try {
			while(true) {
				int index1 = (new Random()).nextInt(9);
				int index2;
				while((index2 = (new Random()).nextInt(9))==index1);
				synchronized (libros[index1]) {
					synchronized (libros[index2]) {
						System.out.println("El libro " 
											+ libros[index1].getNombre()
											+" y el libro "
											+ libros[index2].getNombre()
											+ " están siendo prestados por el estudiante "
											+ nombreEstudiante);
						Thread.sleep((new Random()).nextInt(200)+300);
					}
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
