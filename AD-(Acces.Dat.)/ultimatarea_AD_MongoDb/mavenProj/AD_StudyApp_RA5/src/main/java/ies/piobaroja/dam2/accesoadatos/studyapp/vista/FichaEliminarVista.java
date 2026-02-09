package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.FichaEliminarControlador;


public class FichaEliminarVista extends JPanel{
	private static final long serialVersionUID = 1L;
	

	private JTextField textFieldPreguntaContenidoFicha;
	
	private JButton btnNewButtonEliminarFicha ;
	private FichaEliminarControlador controlador;
	
	public FichaEliminarVista() {
		setLayout(null);


		JLabel lblNewLabelTitleAltaVehiculo = new JLabel("Eliminar Ficha");
		lblNewLabelTitleAltaVehiculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelTitleAltaVehiculo.setBounds(238, 47, 140, 14);
		add(lblNewLabelTitleAltaVehiculo);
		
		JLabel lblNewLabelPreguntaFicha = new JLabel("Pregunta: ");
		lblNewLabelPreguntaFicha.setBounds(96, 94, 88, 17);
		add(lblNewLabelPreguntaFicha);
		
		textFieldPreguntaContenidoFicha = new JTextField();
		textFieldPreguntaContenidoFicha.setBounds(174, 94, 264, 49);
		add(textFieldPreguntaContenidoFicha);
		textFieldPreguntaContenidoFicha.setColumns(10);
		
		
		
		
		btnNewButtonEliminarFicha = new JButton("Eliminar");
		btnNewButtonEliminarFicha.setBounds(238, 161, 105, 27);
		add(btnNewButtonEliminarFicha);
		//conexion de boton con controlador
		btnNewButtonEliminarFicha.addActionListener(controlador);

		
	}

	//Metodos que recogen datos relacionados con más clases que la vista
	public String getPreguntaFichaVista() {
		return textFieldPreguntaContenidoFicha.getText();
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldPreguntaContenidoFicha), "Baja realizada con éxito");		

	}
		
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldPreguntaContenidoFicha), mensaje);		
	}
}
