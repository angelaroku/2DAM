package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Caja;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.CajaCrearVista;

public class CajaCrearControlador implements ActionListener{
	private CajaCrearVista vistaCrearCaja;
	private DAO_StudyApp dao;
	private Caja cajaNew;
	
	public CajaCrearControlador(CajaCrearVista vistaCrearCaja) {
		this.vistaCrearCaja = vistaCrearCaja;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
