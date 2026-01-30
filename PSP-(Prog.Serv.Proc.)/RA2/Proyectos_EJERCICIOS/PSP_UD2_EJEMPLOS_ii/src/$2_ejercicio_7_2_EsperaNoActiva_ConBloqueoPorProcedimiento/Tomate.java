package $2_ejercicio_7_2_EsperaNoActiva_ConBloqueoPorProcedimiento;

public class Tomate {
	
	private final int cantidadInicial = 3;
	private int cantidad=cantidadInicial;
	
	public synchronized void quitarTomates() {
		while(cantidad < 1 ) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.cantidad-=1;
	
	}
	public  synchronized void reponerTomates() {
		this.cantidad=cantidadInicial;
		notifyAll();
	}
	
	
	public synchronized int getCantidad() {
		return cantidad;
	}
	public synchronized void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	public boolean noHayTomate() {
		return cantidad==0;
	}
}
