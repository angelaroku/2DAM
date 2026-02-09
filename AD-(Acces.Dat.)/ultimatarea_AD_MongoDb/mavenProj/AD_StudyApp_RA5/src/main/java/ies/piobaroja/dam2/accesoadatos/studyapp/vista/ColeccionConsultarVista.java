package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.ColeccionConsultarControlador;

public class ColeccionConsultarVista extends JPanel{
	private JButton btnNewButtonConsultarFicha;
	private ColeccionConsultarControlador controlador;
	
	private static final long serialVersionUID = 1L;
	public ColeccionConsultarVista() {
		setLayout(null);
		
		btnNewButtonConsultarFicha = new JButton("Consultar");
		btnNewButtonConsultarFicha.setBounds(172, 196, 105, 27);
		add(btnNewButtonConsultarFicha);
		//conexion de boton con controlador
		btnNewButtonConsultarFicha.addActionListener(controlador);
	}
	
	//Metodos que recogen datos relacionados con más clases que la vista

}


	
