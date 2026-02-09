package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Caja;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.CajaConsultarVista;

public class CajaConsultarControlador implements ActionListener{
	private CajaConsultarVista vistaConsultarCaja;
	private DAO_StudyApp dao;
	private Caja cajaNew;
	
	public CajaConsultarControlador(CajaConsultarVista vistaConsultarCaja) {
		this.vistaConsultarCaja = vistaConsultarCaja;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
