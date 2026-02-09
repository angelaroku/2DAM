package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Fichero;
import proyecto_taller.vista.FicheroImportarVista;

public class FicheroImportarControlador implements ActionListener {
	private FicheroImportarVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Fichero ficheroNew;
	
	public FicheroImportarControlador(FicheroImportarVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
