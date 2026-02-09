package ies.piobaroja.dam2.accesoadatos.studyapp.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ies.piobaroja.dam2.accesoadatos.studyapp.dao.DAO_StudyApp;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Caja;
import ies.piobaroja.dam2.accesoadatos.studyapp.vista.CajaEliminarVista;

public class CajaEliminarControlador implements ActionListener{
	private CajaEliminarVista vistaEliminarCaja;
	private DAO_StudyApp dao;
	private Caja cajaNew;
	
	public CajaEliminarControlador(CajaEliminarVista vistaEliminarCaja) {
		this.vistaEliminarCaja = vistaEliminarCaja;
		
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
