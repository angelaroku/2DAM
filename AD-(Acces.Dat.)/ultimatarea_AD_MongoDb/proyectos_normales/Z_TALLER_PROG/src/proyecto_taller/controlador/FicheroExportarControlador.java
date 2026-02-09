package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Fichero;
import proyecto_taller.vista.FicheroExportarVista;

public class FicheroExportarControlador implements ActionListener {
	private FicheroExportarVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Fichero ficheroNew;
	
	public FicheroExportarControlador(FicheroExportarVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//recogida de valores de la vista y salida por consola

		//validaciones

				
				
		//creacion y salida de exito y error 
		
	}

}
