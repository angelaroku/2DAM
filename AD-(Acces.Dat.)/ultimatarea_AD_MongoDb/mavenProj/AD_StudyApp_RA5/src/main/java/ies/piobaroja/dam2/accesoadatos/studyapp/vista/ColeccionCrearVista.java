package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.ColeccionCrearControlador;
import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.FichaCrearControlador;

public class ColeccionCrearVista extends JPanel{

	private JButton btnNewButtonCrearFicha;
	private ColeccionCrearControlador controlador;
	
	private static final long serialVersionUID = 1L;
	public ColeccionCrearVista() {
		setLayout(null);
		
		btnNewButtonCrearFicha = new JButton("Crear");
		btnNewButtonCrearFicha.setBounds(172, 196, 105, 27);
		add(btnNewButtonCrearFicha);
		//conexion de boton con controlador
		btnNewButtonCrearFicha.addActionListener(controlador);

	}
	
	//Metodos que recogen datos relacionados con más clases que la vista

}
