package proyecto_taller.modelo;

public class Mecanico {
	private int codigoMecanico;
	private String nombreMecanico;
	private EspecialidadMecanico especialidadMecanico;
	private boolean estadoLibreMecanico=true; 
	
	public Mecanico(int codigoMecanico, String nombreMecanico, 
			EspecialidadMecanico especialidadMecanico, boolean estadoLibreMecanico) {
		this.codigoMecanico = codigoMecanico;
		this.nombreMecanico = nombreMecanico;
		this.especialidadMecanico = especialidadMecanico;
		this.estadoLibreMecanico = estadoLibreMecanico;
		
	}
	
	//Métodos:  asignarVehiculo(v:Vehiculo) + cambiarEstado()
			
	public boolean asignarVehiculo(Vehiculo vehiculoAsignado) {
		if (estadoLibreMecanico == true) {
			cambiarEstado();
			vehiculoAsignado.setEstadoVehiculo(EstadoVehiculo.EN_REPARACION);
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public void cambiarEstado() {
		 estadoLibreMecanico = !estadoLibreMecanico;
	}
	
	
	//GETTER Y SETTERS
	public int getCodigoMecanico() {
		return codigoMecanico;
	}

	public void setCodigoMecanico(int codigoMecanico) {
		this.codigoMecanico = codigoMecanico;
	}

	public String getNombreMecanico() {
		return nombreMecanico;
	}

	public void setNombreMecanico(String nombreMecanico) {
		this.nombreMecanico = nombreMecanico;
	}


	public EspecialidadMecanico getEspecialidadMecanico() {
		return especialidadMecanico;
	}


	public void setEspecialidadMecanico(EspecialidadMecanico especialidadMecanico) {
		this.especialidadMecanico = especialidadMecanico;
	}


	public boolean isEstadoLibreMecanico() {
		return estadoLibreMecanico;
	}


	public void setEstadoLibreMecanico(boolean estadoLibreMecanico) {
		this.estadoLibreMecanico = estadoLibreMecanico;
	}


	
	
}
