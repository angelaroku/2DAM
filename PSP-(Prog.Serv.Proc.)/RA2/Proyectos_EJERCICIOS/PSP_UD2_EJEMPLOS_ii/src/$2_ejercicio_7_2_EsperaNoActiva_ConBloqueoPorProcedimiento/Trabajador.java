package $2_ejercicio_7_2_EsperaNoActiva_ConBloqueoPorProcedimiento;

import java.util.Random;

public class Trabajador implements Runnable {
	
	private Tomate tomate;
	private Lechuga lechuga;
	private Jamon jamon;
	private int trabajador;

	public Trabajador(Tomate tomate, Lechuga lechuga, Jamon jamon, int trabajador) {
		this.tomate = tomate;
		this.lechuga = lechuga;
		this.jamon = jamon;
		this.trabajador = trabajador;
		
	}


	@Override
	public void run() {
		
		//BOCADILLO en orden alfabetico para que no haya bloqueo
		
		
		while (true) {

			try {
				jamon.quitarJamon();
				lechuga.quitarLechuga();
				tomate.quitarTomates();
				System.out.println("Trabajador"+trabajador
									+" haciendo bocadillo... "+
									"quedan "+jamon.getCantidad()+ "g de jamon"+
									"quedan "+lechuga.getCantidad()+ "u de lechugas"+
									"quedan "+tomate.getCantidad()+ "u de tomate");
				Thread.sleep((new Random()).nextInt(200)+200);
				
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
