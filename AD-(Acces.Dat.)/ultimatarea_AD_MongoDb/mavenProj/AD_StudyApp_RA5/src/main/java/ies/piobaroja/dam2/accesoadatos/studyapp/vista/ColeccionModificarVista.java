package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.ColeccionEliminarControlador;
import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.ColeccionModificarControlador;

public class ColeccionModificarVista extends JPanel{

	private JButton btnNewButtonModificarFicha;
	private ColeccionModificarControlador controlador;

	private static final long serialVersionUID = 1L;
	public ColeccionModificarVista() {
		setLayout(null);
		
		btnNewButtonModificarFicha = new JButton("Modificar");
		btnNewButtonModificarFicha.setBounds(172, 196, 105, 27);
		add(btnNewButtonModificarFicha);
		//conexion de boton con controlador
		btnNewButtonModificarFicha.addActionListener(controlador);
	}
	
	//Metodos que recogen datos relacionados con más clases que la vista

}

