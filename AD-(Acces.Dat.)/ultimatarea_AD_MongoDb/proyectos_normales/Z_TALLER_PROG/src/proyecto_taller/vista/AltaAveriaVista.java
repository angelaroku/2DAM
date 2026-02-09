package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.AltaAveriaControlador;

public class AltaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldCodigoAveriaContenido; 
	private JTextField textFieldDescripcionAveriaContenido;
	private JTextField textFieldCosteAveriaContenido;

	private JButton btnNewButtonAltaAveria;
	private AltaAveriaControlador controlador;
	

	public AltaAveriaVista() {
		setLayout(null);
		controlador=new AltaAveriaControlador(this);
		
		
		JLabel lblAltaAveria = new JLabel("Alta Averia");
		lblAltaAveria.setBounds(228, 41, 142, 17);
		add(lblAltaAveria);
		
		JLabel lblNewLabelCodigoAveria = new JLabel("Código avería: ");
		lblNewLabelCodigoAveria.setBounds(90, 96, 136, 17);
		add(lblNewLabelCodigoAveria);
		
		textFieldCodigoAveriaContenido = new JTextField();
		textFieldCodigoAveriaContenido.setBounds(208, 94, 220, 21);
		add(textFieldCodigoAveriaContenido);
		textFieldCodigoAveriaContenido.setColumns(10);
		
		JLabel lblNewLabelDescripcionAveria = new JLabel("Descripción avería: ");
		lblNewLabelDescripcionAveria.setBounds(90, 124, 136, 17);
		add(lblNewLabelDescripcionAveria);
		
		textFieldDescripcionAveriaContenido = new JTextField();
		textFieldDescripcionAveriaContenido.setColumns(10);
		textFieldDescripcionAveriaContenido.setBounds(208, 124, 220, 51);
		add(textFieldDescripcionAveriaContenido);

		JLabel lblNewLabelCosteAveria = new JLabel("Coste avería: ");
		lblNewLabelCosteAveria.setBounds(90, 188, 121, 17);
		add(lblNewLabelCosteAveria);
		
		textFieldCosteAveriaContenido = new JTextField();
		textFieldCosteAveriaContenido.setColumns(10);
		textFieldCosteAveriaContenido.setBounds(208, 186, 136, 21);
		add(textFieldCosteAveriaContenido);
		

		
		btnNewButtonAltaAveria = new JButton("Dar de alta");
		btnNewButtonAltaAveria.setBounds(207, 232, 105, 27);
		add(btnNewButtonAltaAveria);
		//conexion de boton con controlador
		btnNewButtonAltaAveria.addActionListener(controlador);
	}
	//Metodos que recogen datos relacionados con más clases que la vista

		public String getCodigoAltaAveriaVista() {			
			return textFieldCodigoAveriaContenido.getText();
		}
	

		public String getDescricionAltaAveriaVista() {
			return textFieldDescripcionAveriaContenido.getText();
		}
	

		public String getCosteAltaAveriaVista() {
			return textFieldCosteAveriaContenido.getText();
		}
	
		//metodos de error y acierto
		public void OK() {
			JOptionPane.showMessageDialog(
					JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), "Alta realizada con éxito");		

		}
		
		public void error(String mensaje) {
			JOptionPane.showMessageDialog(
					JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), mensaje);		
		}

}
