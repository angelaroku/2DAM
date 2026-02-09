package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Coleccion;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.ColeccionConsultarVista;

public class ColeccionConsultarControlador implements ActionListener{
	private ColeccionConsultarVista vistaConsultarFicha;
	private DAO_StudyApp dao;
	private Coleccion coleccionNew;
	
	public ColeccionConsultarControlador(ColeccionConsultarVista vistaConsultarFicha) {
		this.vistaConsultarFicha = vistaConsultarFicha;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
