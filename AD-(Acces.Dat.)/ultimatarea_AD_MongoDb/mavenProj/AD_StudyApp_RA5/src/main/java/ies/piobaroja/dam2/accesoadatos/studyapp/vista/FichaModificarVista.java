package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.FichaModificarControlador;

public class FichaModificarVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldPreguntaContenidoFicha;
	private JTextField textFieldRespuestaContenidoFicha;
	
	private JButton btnNewButtonModificarFicha;
	private FichaModificarControlador controlador;
	
	public FichaModificarVista() {
		setLayout(null);

		JLabel lblNewLabelTitleAltaVehiculo = new JLabel("Modificación Ficha");
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
		
		
		JLabel lblNewLabelRespuestaFicha = new JLabel("Respuesta: ");
		lblNewLabelRespuestaFicha.setBounds(96, 179, 88, 17);
		add(lblNewLabelRespuestaFicha);
		
		textFieldRespuestaContenidoFicha = new JTextField();
		textFieldRespuestaContenidoFicha.setColumns(10);
		textFieldRespuestaContenidoFicha.setBounds(174, 177, 264, 49);
		add(textFieldRespuestaContenidoFicha);
		
		
		

		btnNewButtonModificarFicha = new JButton("Modificar");
		btnNewButtonModificarFicha.setBounds(249, 259, 105, 27);
		add(btnNewButtonModificarFicha);
		//conexion de boton con controlador
		btnNewButtonModificarFicha.addActionListener(controlador);
	}
	

	//Metodos que recogen datos relacionados con más clases que la vista
	public String getPreguntaFichaVista() {
		return textFieldPreguntaContenidoFicha.getText();
	}
	public String getRespuestaFichaVista() {
		return textFieldRespuestaContenidoFicha.getText();
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldPreguntaContenidoFicha), "Modificación realizada con éxito");		

	}
		
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldPreguntaContenidoFicha), mensaje);		
	}
}
