package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Coleccion;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.ColeccionEliminarVista;

public class ColeccionEliminarControlador implements ActionListener{
	private ColeccionEliminarVista vistaEliminarFicha;
	private DAO_StudyApp dao;
	private Coleccion coleccionNew;
	
	public ColeccionEliminarControlador(ColeccionEliminarVista vistaEliminarFicha) {
		this.vistaEliminarFicha = vistaEliminarFicha;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
