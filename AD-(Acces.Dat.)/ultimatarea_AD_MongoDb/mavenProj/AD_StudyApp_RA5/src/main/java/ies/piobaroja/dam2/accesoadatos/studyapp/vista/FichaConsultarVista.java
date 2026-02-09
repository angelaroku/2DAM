package ies.piobaroja.dam2.accesoadatos.studyapp.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ies.piobaroja.dam2.accesoadatos.studyapp.controlador.FichaConsultarControlador;
import javax.swing.JTextPane;

public class FichaConsultarVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldPreguntaContenidoFicha;
	private JTextPane txtpnSalidaConsulta;

	private JButton btnNewButtonConsultarFicha;	
	private FichaConsultarControlador controlador;
	
	public FichaConsultarVista() {
		setLayout(null);


		JLabel lblNewLabelTitleAltaVehiculo = new JLabel("Consultar Ficha");
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
		
		txtpnSalidaConsulta = new JTextPane();
		txtpnSalidaConsulta.setToolTipText("");
		txtpnSalidaConsulta.setBounds(96, 202, 248, 190);
		add(txtpnSalidaConsulta);
		
		btnNewButtonConsultarFicha = new JButton("Consultar");
		btnNewButtonConsultarFicha.setBounds(248, 163, 105, 27);
		add(btnNewButtonConsultarFicha);
		//conexion de boton con controlador
		btnNewButtonConsultarFicha.addActionListener(controlador);

		
	}
	
	//Metodos que recogen datos relacionados con más clases que la vista
		public String getPreguntaFichaVista() {
			return textFieldPreguntaContenidoFicha.getText();
		}
		public void setSalidaConsultaFichaVista(String salidaConsulta) {
			txtpnSalidaConsulta.setText(salidaConsulta); 
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
