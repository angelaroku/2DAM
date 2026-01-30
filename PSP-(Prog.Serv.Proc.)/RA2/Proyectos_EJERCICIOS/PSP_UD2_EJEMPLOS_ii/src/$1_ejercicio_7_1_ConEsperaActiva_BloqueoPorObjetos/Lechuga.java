package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

public class Lechuga {

	private final int cantidadInicial = 6;
	private int cantidad;
	
	public void quitarLechuga() {
		this.cantidad-=2;
	
	}
	public void reponerLechuga() {
		this.cantidad=cantidadInicial;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
