package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.ModificacionVehiculoVista;

public class ModificacionVehiculosControlador implements ActionListener {
	private ModificacionVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;

	public ModificacionVehiculosControlador( ModificacionVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador modificación vehiculo");
		
		//recogida de valores de la vista y salida por consola
		String matricula = vistaControlador.getMatriculaModificacionVehiculoVista();
		EstadoVehiculo estadoVehiculo = vistaControlador.getEstadoModificacionVehiculoVista();
		TipoVehiculo tipoVehiculo = vistaControlador.getTipoVehiculoModificacionVehiculoVista();
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
		
				
		//creacion de la modificación + salida de exito y error 
		try {
			Vehiculo vehiculoModificado = new Vehiculo(matricula, estadoVehiculo, tipoVehiculo);
			boolean modificacionVehiculos =daoControlador.modificarVehiculo(vehiculoModificado);
			if (modificacionVehiculos==true) {
				vistaControlador.OK();
			} else {
				vistaControlador.error("No existe ningún vehículo con esa matrícula");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			vistaControlador.error("Error inesperado, pruebe de nuevo");

		}
		
	}

}
