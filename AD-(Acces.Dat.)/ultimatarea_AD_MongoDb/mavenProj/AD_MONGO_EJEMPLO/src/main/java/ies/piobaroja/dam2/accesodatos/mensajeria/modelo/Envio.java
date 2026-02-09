package ies.piobaroja.dam2.accesodatos.mensajeria.modelo;



public class Envio {

	private int codigo;
	private String fecha;
	private String direccionOrigen;
	private String direccionDestino;
	private TipoEstado TipoEstadoEnvio;
	private Mensajero mensajero;

	public Envio() {
		mensajero=null;
		
	}
	public Envio(String fecha, String direccionOrigen, String direccionDestino,
			TipoEstado tipoEstadoEnvio) {
		this();
		this.fecha = fecha;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		TipoEstadoEnvio = tipoEstadoEnvio;
		mensajero=null;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccionOrigen() {
		return direccionOrigen;
	}
	public void setDireccionOrigen(String direccionOrigen) {
		this.direccionOrigen = direccionOrigen;
	}
	public String getDireccionDestino() {
		return direccionDestino;
	}
	public void setDireccionDestino(String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}
	public TipoEstado getTipoEstadoEnvio() {
		return TipoEstadoEnvio;
	}
	public void setTipoEstadoEnvio(TipoEstado tipoEstadoEnvio) {
		TipoEstadoEnvio = tipoEstadoEnvio;
	}
	
	
	
	public Mensajero getMensajero() {
		return mensajero;
	}
	public void setMensajero(Mensajero mensajero) {
		this.mensajero = mensajero;
	}
	@Override
	public String toString() {
		return "Envio [codigo=" + codigo + ", fecha=" + fecha + ", direccionOrigen=" + direccionOrigen
				+ ", direccionDestino=" + direccionDestino + ", TipoEstadoEnvio=" + TipoEstadoEnvio + "]";
	}
	
	
	
}
