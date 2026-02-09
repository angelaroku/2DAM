package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.modelo.Vehiculo;
import proyecto_taller.vista.ConsultaVehiculoVista;

public class ConsultaVehiculosControlador implements ActionListener{
	private ConsultaVehiculoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	public ConsultaVehiculosControlador( ConsultaVehiculoVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador= DAO_TallerMecanico.getInstancia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador consulta vehiculo");
		
		//recogida de valores de la vista y salida por consola
		String matricula = vistaControlador.getMatriculaConsultaVehiculoVista();
		System.out.println("Matricula: " + matricula);
		

		//validaciones
		if (matricula == null || matricula.isBlank()) {
			vistaControlador.error("La matrícula es obligatoria");
			return;
		}
				
		//creacion de la consulta  y salida de exito y error 
		try {
			Vehiculo vehiculoConsultado =  daoControlador.consultaVehiculo(matricula);
			if (vehiculoConsultado == null) {
				vistaControlador.error("No existe ningun vehículo con esa matrícula");
				vistaControlador.setSalidaConsultaVehiculoVista("0 resultados...");
				return;
			}
			String salidaConsulta = "Matricula:  "+ vehiculoConsultado.getMatricula() + "\n" +
														"Estado: " + vehiculoConsultado.getEstadoVehiculo() + "\n" +
														"Tipo: " +  vehiculoConsultado.getTipoVehiculo()  + "\n";
														
			vistaControlador.setSalidaConsultaVehiculoVista(salidaConsulta);
			vistaControlador.OK();	
			
		} catch (Exception ex){
			ex.printStackTrace();
			vistaControlador.error("Error inesperado al consultar el vehículo");

		}
	}

}
