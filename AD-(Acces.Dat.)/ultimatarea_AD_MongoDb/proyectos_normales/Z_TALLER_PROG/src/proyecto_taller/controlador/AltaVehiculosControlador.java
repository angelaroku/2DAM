package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.AltaVehiculoVista;

public class AltaVehiculosControlador implements ActionListener{
	private AltaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	public AltaVehiculosControlador(AltaVehiculoVista vistaControlador) {
		this.vistaControlador = vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();
	}

	//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) 

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Controlador alta vehiculo");
		
		//recogida de valores de la vista y salida por consola
		String matricula = vistaControlador.getMatriculaAltaVehiculoVista();
		EstadoVehiculo estadoVehiculo = vistaControlador.getEstadoAltaVehiculoVista();
		TipoVehiculo tipoVehiculo = vistaControlador.getTipoVehiculoAltaVehiculoVista();
		System.out.println("Matricula: " + matricula);
		System.out.println("Estado: " + estadoVehiculo);
		System.out.println("Tipo vehículo: " + tipoVehiculo);
		
		//validaciones
		if (matricula == null || matricula.isBlank()) {
			vistaControlador.error("La matrícula es obligatoria");
			return;
		}
		if (estadoVehiculo == null) {
			vistaControlador.error("Seleccione un estado del vehículo");
			return;
		}
		if (tipoVehiculo == null) {
			vistaControlador.error("Seleccione un tipo de vehículo");
			return;
		}
		
		//creacion del alta y salida de exito y error 
		try {

			daoControlador.altaVehiculo(matricula, estadoVehiculo, tipoVehiculo);
			vistaControlador.OK();	
			System.out.println("El vehículo se ha creado correctamente");
			
		} catch (Exception e1) {
			e1.printStackTrace();
			vistaControlador.error("Error al crear el vehículo");
		}
		
	}	
}
