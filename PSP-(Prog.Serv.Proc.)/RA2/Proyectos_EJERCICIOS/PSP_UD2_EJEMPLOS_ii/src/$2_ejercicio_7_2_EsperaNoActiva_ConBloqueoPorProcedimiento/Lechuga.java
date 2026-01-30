package $2_ejercicio_7_2_EsperaNoActiva_ConBloqueoPorProcedimiento;

public class Lechuga {

	private final int cantidadInicial = 6;
	private int cantidad=cantidadInicial;
	
	public synchronized void quitarLechuga() {
		while (this.cantidad<2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.cantidad-=2;
	
	}
	public synchronized void reponerLechuga() {
		this.cantidad=cantidadInicial;
		notifyAll();
	}
	
	
	public synchronized int getCantidad() {
		return cantidad;
	}
	public synchronized void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public synchronized boolean noHayLechuga() {
		return cantidad==0;
	}
	
	
}
