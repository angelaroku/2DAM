package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Ficha;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.FichaModificarVista;

public class FichaModificarControlador implements ActionListener{

	private FichaModificarVista vistaModificarFicha;
	private DAO_StudyApp dao;
	private Ficha fichaNew;
	
	public FichaModificarControlador(FichaModificarVista vistaModificarFicha) {
		this.vistaModificarFicha = vistaModificarFicha;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
