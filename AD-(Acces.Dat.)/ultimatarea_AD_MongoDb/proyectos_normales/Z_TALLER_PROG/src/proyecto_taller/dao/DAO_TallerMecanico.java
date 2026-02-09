package proyecto_taller.dao;

import java.util.ArrayList;

import proyecto_taller.modelo.Averia;
import proyecto_taller.modelo.EspecialidadMecanico;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.Mecanico;
import proyecto_taller.modelo.TallerMecanico;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.modelo.Vehiculo;

public class DAO_TallerMecanico {
	
	private static DAO_TallerMecanico instancia=null;
	private TallerMecanico tallerMecanico; 
	
	private DAO_TallerMecanico() {
		tallerMecanico=new TallerMecanico() ;
	}

	public static DAO_TallerMecanico getInstancia() {
		if (instancia == null) {
			instancia = new DAO_TallerMecanico();
		}
		return instancia;
	}
	//METODOS CRUD enlazados con modelo "MenuTallerMecanico"
	
	public void altaVehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo){
		Vehiculo vehiculoNuevo = new Vehiculo(matricula, estadoVehiculo , tipoVehiculo);
		tallerMecanico.altaVehiculos(vehiculoNuevo);
	}
	
	public void altaMecanico(int codigoMecanico, String nombreMecanico, 
			EspecialidadMecanico especialidadMecanico, boolean estadoLibreMecanico){
		Mecanico mecanicoNuevo = new Mecanico(codigoMecanico, nombreMecanico, 
				especialidadMecanico, estadoLibreMecanico);
		tallerMecanico.altaMecanicos(mecanicoNuevo);
	}
	
	public void altaAveria(int codigoAveria, String descripcionAveria, double costeAveria){
		Averia averiaNueva = new Averia(codigoAveria, descripcionAveria, costeAveria);
		tallerMecanico.altaAverias(averiaNueva);
	}
	
	public boolean bajaVehiculos(String matricula) {
		return tallerMecanico.bajaVehiculos(matricula);
	}
	
	public boolean bajaMecanicos(int codigoMecanico) {
		return  tallerMecanico.bajaMecanicos(codigoMecanico);
	}
	
	public boolean bajaAverias(int codigoAveria) {
		return tallerMecanico.bajaAverias(codigoAveria);
	}
	
	public Vehiculo consultaVehiculo(String matricula) {
		return tallerMecanico.consultaVehiculos(matricula);
	}
	
	public Mecanico consultaMecanico(int codigoMecanico) {
		return tallerMecanico.consultaMecanicos(codigoMecanico);
	}
	
	public Averia consultaAveria(int codigoAverias) {
		return tallerMecanico.consultaAverias(codigoAverias);
	}
	
	public boolean modificarVehiculo(Vehiculo vehiculo) {
		return tallerMecanico.modificarVehiculo(vehiculo);
	}
	
	public boolean modificarMecanico(Mecanico mecanico) {
		return tallerMecanico.modificarMecanico(mecanico);
	}
	
	public boolean modificarAveria(Averia averia) {
		return tallerMecanico.modificarAveria(averia);
	}

	//metodos llamando a CLASE Taller:
	//IMPORTAR , EXPORTAR



//METODOS llamando a CLASE Taller: 
	//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()


}
