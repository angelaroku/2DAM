package ies.piobaroja.dam2.accesodatos.mensajeria.modelo;



public class Carta extends Envio{
	
	private double precio;
	
	public Carta() {
		
	}
	
	public Carta( String fecha, String direccionOrigen, String direccionDestino,
			TipoEstado tipoEstadoEnvio, double precio) {
		super( fecha, direccionOrigen, direccionDestino, tipoEstadoEnvio);
		// TODO Auto-generated constructor stub
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return super.toString()+"Carta [precio=" + precio + "]";
	}
	


	
	
}
