package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.CajaCrearControlador;
import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.ColeccionCrearControlador;

public class CajaCrearVista extends JPanel{

	private JButton btnNewButtonCrearFicha;
	private CajaCrearControlador controlador;
	
	private static final long serialVersionUID = 1L;
	public CajaCrearVista() {
		setLayout(null);
		
		btnNewButtonCrearFicha = new JButton("Crear");
		btnNewButtonCrearFicha.setBounds(172, 196, 105, 27);
		add(btnNewButtonCrearFicha);
		//conexion de boton con controlador
		btnNewButtonCrearFicha.addActionListener(controlador);

	}
	
	//Metodos que recogen datos relacionados con más clases que la vista

}
