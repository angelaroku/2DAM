package $6_ejercicioLibro1_colecta;

public class Colecta {
	private int cantidad;
	
	public synchronized boolean addCantidad(int cantidad) {
		if (this.cantidad<=2000) {
			this.cantidad+=cantidad;
			return false;
		}
		return true;
	}
	
	public synchronized int getCantidad() {
		return cantidad;
	}

}
