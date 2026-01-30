package $1_ejercicio_7_1_ConEsperaActiva_BloqueoPorObjetos;

public class Jamon {

	private final int cantidadInicial = 500;
	private int cantidad;
	
	public void quitarJamon() {
		this.cantidad-=100;
	
	}
	public void reponerJamon() {
		this.cantidad=cantidadInicial;
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

}
