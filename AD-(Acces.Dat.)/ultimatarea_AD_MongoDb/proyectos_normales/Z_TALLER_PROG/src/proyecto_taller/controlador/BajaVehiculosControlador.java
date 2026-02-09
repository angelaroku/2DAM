package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.BajaVehiculoVista;

public class BajaVehiculosControlador implements ActionListener{
	private BajaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;

	public BajaVehiculosControlador( BajaVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador baja vehiculo");

		//recogida de valores de la vista y salida por consola
		String matricula = vistaControlador.getMatriculaBajaVehiculoVista();
		System.out.println("Matricula: " + matricula);

		//validaciones
		if (matricula == null || matricula.isBlank()) {
			vistaControlador.error("La matrícula es obligatoria");
			return;
		}
		
		try {
			//creacion de la  baja y salida de exito y error 

			boolean bajaVehiculos = daoControlador.bajaVehiculos(matricula);
			
			if (bajaVehiculos == true ) {
				vistaControlador.OK();
			}else {
				vistaControlador.error("La matrícula no existe, pruebe de nuevo");
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
			vistaControlador.error("Error al dar de baja el vehículo");

		}
		
	}

}
