package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

public class Principal {

	public static void main(String[] args) {
		
		//DESPENSA
		final Tomate tomate = new Tomate();
		final Lechuga lechuga = new Lechuga();
		final Jamon jamon = new Jamon();
		
		
		Thread trabajador1 = new Thread(new Trabajador(tomate, lechuga, jamon, 1));
		Thread trabajador2 = new Thread(new Trabajador(tomate, lechuga, jamon, 2));
		Thread trabajador3 = new Thread(new Trabajador(tomate, lechuga, jamon, 3));
		Thread trabajador4 = new Thread(new Trabajador(tomate, lechuga, jamon, 4));
		Thread reponedorTomate = new Thread(new ReposicionTomate(tomate));
		Thread reponedorLechuga = new Thread(new ReposicionLechuga(lechuga));
		Thread reponedorJamon = new Thread(new ReposicionJamon(jamon));

		trabajador1.start();
		trabajador2.start();
		trabajador3.start();
		trabajador4.start();
		reponedorTomate.start();
		reponedorLechuga.start();
		reponedorJamon.start();
		
		
		
		
		
		
		
		

		
		
		
	}

}
