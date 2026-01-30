package $7_ejercicioLibro2_8_biblioteca;

import java.util.Random;

public class Reserva implements Runnable{
	private Libro[] libros;
	private int nombreEstudiante;
	private Biblioteca biblioteca;
	
	public Reserva(Libro[] libros, int nombreEstudiante,
			Biblioteca biblioteca) {
		this.libros=libros;
		this.nombreEstudiante=nombreEstudiante;
		this.biblioteca=biblioteca;
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
						biblioteca.getLibros(nombreEstudiante, index1, index2);
						System.out.println("El libro " 
											+ libros[index1].getNombre()
											+" y el libro "
											+ libros[index2].getNombre()
											+ " están siendo prestados por el estudiante "
											+ nombreEstudiante);
						Thread.sleep((new Random()).nextInt(2000)+3000);
					}
				}
				biblioteca.devolverLibros(nombreEstudiante, index1, index2);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
