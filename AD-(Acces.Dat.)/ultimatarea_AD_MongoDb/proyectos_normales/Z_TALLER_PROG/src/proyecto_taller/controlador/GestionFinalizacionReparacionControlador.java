package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Gestion;
import proyecto_taller.vista.GestionFinalizacionReparacionVista;

public class GestionFinalizacionReparacionControlador implements ActionListener {
	private GestionFinalizacionReparacionVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	private Gestion gestionNew;
	
	public GestionFinalizacionReparacionControlador(GestionFinalizacionReparacionVista vistaControlador) {
		this.vistaControlador=vistaControlador;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
