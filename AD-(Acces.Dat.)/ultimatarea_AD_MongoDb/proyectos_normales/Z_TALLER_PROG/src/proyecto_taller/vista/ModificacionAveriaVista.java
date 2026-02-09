package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.ModificacionAveriaControlador;

public class ModificacionAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldCodigoAveriaContenido; 
	private JTextField textFieldDescripcionAveriaContenido;
	private JTextField textFieldCosteAveriaContenido;

	
	private JButton btnNewButtonModificacionAveria;
	private ModificacionAveriaControlador controlador;

	
	//Averia(int codigoAveria, String descripcionAveria, double costeAveria)
	public ModificacionAveriaVista() {
		setLayout(null);
		controlador=new ModificacionAveriaControlador(this);
		

		JLabel lblModificacionAveria = new JLabel("Modificación Averia");
		lblModificacionAveria.setBounds(202, 50, 142, 17);
		add(lblModificacionAveria);
		
		JLabel lblNewLabelCodigoAveria = new JLabel("Código avería: ");
		lblNewLabelCodigoAveria.setBounds(90, 96, 136, 17);
		add(lblNewLabelCodigoAveria);
		
		textFieldCodigoAveriaContenido = new JTextField();
		textFieldCodigoAveriaContenido.setBounds(187, 94, 220, 21);
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
		
		
		
		btnNewButtonModificacionAveria = new JButton("Modificar avería");
		btnNewButtonModificacionAveria.setBounds(172, 239, 157, 27);
		add(btnNewButtonModificacionAveria);
		//conexion de boton con controlador
		btnNewButtonModificacionAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


	public String getCodigoModificacionAveriaVista() {			
		return textFieldCodigoAveriaContenido.getText();
	}


	public String getDescricionModificacionAveriaVista() {
		return textFieldDescripcionAveriaContenido.getText();
	}


	public String getCosteModificacionAveriaVista() {
		return textFieldCosteAveriaContenido.getText();
	}
	
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), "Modificación realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), mensaje);		
	}

}
