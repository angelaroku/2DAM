package proyecto_taller.modelo;

import java.util.ArrayList;

public class Vehiculo {
	
	private String matricula;
	private EstadoVehiculo estadoVehiculo;
	private TipoVehiculo tipoVehiculo;
	private ArrayList<Averia> averiasVehiculo;
	
	
	public Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) {
		this.matricula = matricula;
		this.estadoVehiculo = estadoVehiculo;
		this.tipoVehiculo = tipoVehiculo;
	}

	//Método: coste reparación
	public double costeReparacion() {
		double total = 0;
		for (Averia averia : averiasVehiculo) {
			total += averia.getCosteAveria();
			
		}
		return total;
	}
	
	
	//GETTER Y SETTER
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public EstadoVehiculo getEstadoVehiculo() {
		return estadoVehiculo;
	}

	public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public ArrayList<Averia> getAveriasVehiculo() {
		return averiasVehiculo;
	}

	public void setAveriasVehiculo(ArrayList<Averia> averiasVehiculo) {
		this.averiasVehiculo = averiasVehiculo;
	}
}
