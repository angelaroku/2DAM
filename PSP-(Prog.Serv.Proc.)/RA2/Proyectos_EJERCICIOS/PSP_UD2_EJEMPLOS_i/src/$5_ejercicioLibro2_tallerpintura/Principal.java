package $5_ejercicioLibro2_tallerpintura;

public class Principal {

	public static void main(String[] args) {
		
		DepositoCian cian = new DepositoCian();
		DepositoMagenta magenta = new DepositoMagenta();
		DepositoAmarillo amarillo = new DepositoAmarillo();
		
		Thread pintor1 = new Thread(new ColorRojo(magenta, amarillo));
		Thread pintor2 = new Thread(new ColorVerde(amarillo, cian));
		Thread pintor3 = new Thread(new ColorAzul(magenta, cian));
		
		pintor1.start();
		pintor2.start();
		pintor3.start();
	}
}