package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Caja;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.CajaModificarVista;

public class CajaModificarControlador implements ActionListener{
	private CajaModificarVista vistaModificarCaja;
	private DAO_StudyApp dao;
	private Caja cajaNew;
	
	public CajaModificarControlador( CajaModificarVista vistaModificarCaja) {
		this.vistaModificarCaja = vistaModificarCaja;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
