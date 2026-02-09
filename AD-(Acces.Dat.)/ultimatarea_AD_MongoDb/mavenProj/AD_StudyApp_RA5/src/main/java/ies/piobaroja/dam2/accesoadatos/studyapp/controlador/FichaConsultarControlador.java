package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Ficha;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.FichaConsultarVista;

public class FichaConsultarControlador implements ActionListener{
	
	private FichaConsultarVista vistaConsultarFicha;
	private DAO_StudyApp dao;
	private Ficha fichaNew;
	
	public FichaConsultarControlador(FichaConsultarVista vistaConsultarFicha) {
		this.vistaConsultarFicha = vistaConsultarFicha;
		
	}
	  

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
