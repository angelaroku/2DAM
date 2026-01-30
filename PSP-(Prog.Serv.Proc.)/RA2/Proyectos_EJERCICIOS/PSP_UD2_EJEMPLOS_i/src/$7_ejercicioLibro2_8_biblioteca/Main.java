package $7_ejercicioLibro2_8_biblioteca;

import javax.swing.JFrame;

public class Main {
	/*
	 * Hay cuatro estudiantes que comparten nueve libros. Los libros se pueden almacenar en un
	 * array Libro[] libros = new Libro[9]. Los estudiantes seleccionan dos libros al azar y,
	 * una vez obienidos [para lo que podrían tener que esperar si, en ese momento, hay otro
	 * estudiante utilizando alguno de ellos), los utilizan durante un tiempo aleatorio de entre una
	 * y tres horas. Pasado este tiempo, los devuelven, de manera que puedan utilizarlos otros
	 * estudiantes, y descansan un tiempo aleatorio de entre una y dos horas. Entonces, vuelven
	 * a seleccionar otros dos libros, y continúa el ciclo. La clase Libro puede no tener ninguna ncionalidad especial,
	 * más allá de tener un identificador,que puede utilizarse en los mensajes en los que se haga referencia al libro. 
	 * La simulación no tiene por qué ser en tiempo real.
	 * Se pueden seleccionar los tiempos al azar en minutos en lugar de horas, y esperar un milisegundo por cada minuto. 
	 */
	public static void main(String[] args) {
		
		JFrame ventana=new JFrame();
		ventana.setSize(750, 900);
		ventana.setVisible(true);
		Biblioteca biblioteca=new Biblioteca();
		ventana.setContentPane(biblioteca);
		
		Libro[] libros = new Libro[9];
		libros[0] = new Libro("Libro 1");
		libros[1] = new Libro("Libro 2");
		libros[2] = new Libro("Libro 3");
		libros[3] = new Libro("Libro 4");
		libros[4] = new Libro("Libro 5");
		libros[5] = new Libro("Libro 6");
		libros[6] = new Libro("Libro 7");
		libros[7] = new Libro("Libro 8");
		libros[8] = new Libro("Libro 9");
		
		// Reserva reserva = new Reserva(libros);
		
		//Thread estudiante1 = new Thread(reserva);
		//Thread estudiante2 = new Thread(reserva);
		//Thread estudiante3 = new Thread(reserva);
		//Thread estudiante4 = new Thread(reserva);
		
		
		Thread estudiante1 = new Thread(new Reserva(libros, 1,biblioteca));
		Thread estudiante2 = new Thread(new Reserva(libros, 2, biblioteca));
		Thread estudiante3 = new Thread(new Reserva(libros, 3,biblioteca));
		Thread estudiante4 = new Thread(new Reserva(libros, 4, biblioteca));
		
		
		estudiante1.start();
		estudiante2.start();
		estudiante3.start();
		estudiante4.start();

	}
}
