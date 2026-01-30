package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

public class Tomate {
	
	private final int cantidadInicial = 3;
	private int cantidad;
	
	public void quitarTomates() {
		this.cantidad-=1;
	
	}
	public void reponerTomates() {
		this.cantidad=cantidadInicial;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
