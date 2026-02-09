package ies.piobaroja.dam2.accesodatos.mensajeria.modelo;

public class Paquete extends Envio {
	
	private double peso;
	private double precioKilo;
	
	public Paquete() {
		
	}

	public Paquete( String fecha, String direccionOrigen, String direccionDestino,
			TipoEstado tipoEstadoEnvio,
			double peso, double precioKilo) {
		super( fecha, direccionOrigen, direccionDestino, tipoEstadoEnvio);
		// TODO Auto-generated constructor stub
		this.peso=peso;
		this.precioKilo=precioKilo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(int precioKilo) {
		this.precioKilo = precioKilo;
	}

	@Override
	public String toString() {
		return super.toString()+"Paquete [peso=" + peso + ", precioKilo=" + precioKilo + "]";
	}
	
	

}
