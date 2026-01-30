package $2_ejercicio_7_2_EsperaNoActiva_ConBloqueoPorProcedimiento;

public class Jamon {

	private final int cantidadInicial = 500;
	private int cantidad=cantidadInicial;
	
	public synchronized void quitarJamon() {
		while (this.cantidad<100) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.cantidad-=100;
	
	}
	public synchronized void reponerJamon() {
		this.cantidad=cantidadInicial;
		notifyAll();
	}
	
	
	public synchronized int getCantidad() {
		return cantidad;
	}
	public synchronized void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public synchronized boolean noHayJamon() {
		return cantidad==0;
	}

}
