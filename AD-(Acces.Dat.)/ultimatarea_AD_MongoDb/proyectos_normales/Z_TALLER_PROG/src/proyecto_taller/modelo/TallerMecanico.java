package proyecto_taller.modelo;

import java.util.ArrayList;
import java.util.Iterator;


public class TallerMecanico {

	//atributos array de cada elemento del menu principal 
	private ArrayList<Vehiculo> vehiculosTaller;
	private ArrayList<Mecanico> mecanicosTaller;
	private ArrayList<Averia> averiasTaller;
	private  ArrayList<Fichero> ficherosTaller;
	private ArrayList<Gestion> gestionesTaller;
	
	
	//constructor de TALLER
	public TallerMecanico() {
		vehiculosTaller = new ArrayList<>();
		mecanicosTaller = new ArrayList<>();
		averiasTaller = new ArrayList<>();
		ficherosTaller = new ArrayList<>();
		gestionesTaller = new ArrayList<>();
	}
	
	
	// metodos CRUD para: VEHICULOS, MECANICOS , AVERIAS (ALTA/BAJA/CONSULT/MOD)
	public void altaVehiculos(Vehiculo vehiculo) {
		vehiculosTaller.add(vehiculo);
	}
	
	public void altaMecanicos(Mecanico mecanico) {
		mecanicosTaller.add(mecanico);
	}
	
	public void altaAverias(Averia averia) {
		averiasTaller.add(averia);
	}
	
	public boolean bajaVehiculos(String matricula) {
		Iterator <Vehiculo> it = vehiculosTaller.iterator();
		while(it.hasNext()) {
			if (it.next().getMatricula().equals(matricula)){
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean bajaMecanicos(int codigoMecanico) {
		Iterator <Mecanico> it = mecanicosTaller.iterator();
		while(it.hasNext()) {
			if (it.next().getCodigoMecanico()==codigoMecanico) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean bajaAverias(int codigoAveria) {
		Iterator <Averia> it = averiasTaller.iterator();
		while(it.hasNext()) {
			if (it.next().getCodigoAveria()==codigoAveria) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public Vehiculo consultaVehiculos(String matricula) {
		for (Vehiculo vehiculoEncontrado:vehiculosTaller) {
			if(vehiculoEncontrado.getMatricula().equals(matricula)) {
				return vehiculoEncontrado;
			}
		}
		return null;
	}
	
	public Mecanico consultaMecanicos(int codigoMecanico) {
		for (Mecanico mecanicoEncontrado:mecanicosTaller) {
			if (mecanicoEncontrado.getCodigoMecanico()==codigoMecanico) {
				return mecanicoEncontrado;
			}
		}
		return null;
	}
	
	public Averia consultaAverias(int codigoAverias) {
		for (Averia averiaEncontrada:averiasTaller) {
			if(averiaEncontrada.getCodigoAveria()==codigoAverias) {
				return averiaEncontrada;
			}
		}
		return null;
	}
	
	public boolean modificarVehiculo(Vehiculo vehiculo) {
		for (Vehiculo vehiculoModif: vehiculosTaller) {
			if(vehiculoModif.getMatricula().equals(vehiculo.getMatricula())) {
				vehiculoModif.setAveriasVehiculo(vehiculo.getAveriasVehiculo());
				vehiculoModif.setEstadoVehiculo(vehiculo.getEstadoVehiculo());
				vehiculoModif.setTipoVehiculo(vehiculo.getTipoVehiculo());
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarMecanico(Mecanico mecanico) {
		for (Mecanico mecanicoModif: mecanicosTaller) {
			if (mecanicoModif.getCodigoMecanico()==mecanico.getCodigoMecanico()) {
				mecanicoModif.setEspecialidadMecanico(mecanico.getEspecialidadMecanico());
				mecanicoModif.setEstadoLibreMecanico(mecanico.isEstadoLibreMecanico());
				mecanicoModif.setNombreMecanico(mecanico.getNombreMecanico());
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarAveria(Averia averia) {
		for (Averia averiaModif: averiasTaller) {
			if (averiaModif.getCodigoAveria()==averia.getCodigoAveria()) {
				averiaModif.setCosteAveria(averia.getCosteAveria());
				averiaModif.setDescripcionAveria(averia.getDescripcionAveria());
				return true;
			}
		}
		return false;
	}
	
	//metodos llamando a CLASE fichero:
		//IMPORTAR , EXPORTAR
	
	
	
	//METODOS llamando a CLASE Gestion: 
		//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()


	
	
	//GETTER Y SETTERS

	public ArrayList<Vehiculo> getVehiculosTaller() {
		return vehiculosTaller;
	}

	public void setVehiculosTaller(ArrayList<Vehiculo> vehiculosTaller) {
		this.vehiculosTaller = vehiculosTaller;
	}

	public ArrayList<Mecanico> getMecanicosTaller() {
		return mecanicosTaller;
	}

	public void setMecanicosTaller(ArrayList<Mecanico> mecanicosTaller) {
		this.mecanicosTaller = mecanicosTaller;
	}

	public ArrayList<Averia> getAveriasTaller() {
		return averiasTaller;
	}

	public void setAveriasTaller(ArrayList<Averia> averiasTaller) {
		this.averiasTaller = averiasTaller;
	}

	public ArrayList<Fichero> getFicherosTaller() {
		return ficherosTaller;
	}

	public void setFicherosTaller(ArrayList<Fichero> ficherosTaller) {
		this.ficherosTaller = ficherosTaller;
	}

	public ArrayList<Gestion> getGestionesTaller() {
		return gestionesTaller;
	}

	public void setGestionesTaller(ArrayList<Gestion> gestionesTaller) {
		this.gestionesTaller = gestionesTaller;
	}
}
