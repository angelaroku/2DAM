package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.BajaAveriaControlador;

public class BajaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldCodigoAveriaContenido; 

	
	private JButton btnNewButtonBajaAveria;
	private BajaAveriaControlador controlador;

	//Averia(int codigoAveria, String descripcionAveria, double costeAveria)
	public BajaAveriaVista() {
		setLayout(null);
		controlador=new BajaAveriaControlador(this);

		JLabel lblBajaAveria = new JLabel("Baja Averia");
		lblBajaAveria.setBounds(228, 41, 142, 17);
		add(lblBajaAveria);
		
		JLabel lblNewLabelCodigoAveria = new JLabel("Código avería: ");
		lblNewLabelCodigoAveria.setBounds(90, 96, 136, 17);
		add(lblNewLabelCodigoAveria);
		
		textFieldCodigoAveriaContenido = new JTextField();
		textFieldCodigoAveriaContenido.setBounds(208, 94, 220, 21);
		add(textFieldCodigoAveriaContenido);
		textFieldCodigoAveriaContenido.setColumns(10);
		
		btnNewButtonBajaAveria = new JButton("Dar de baja");
		btnNewButtonBajaAveria.setBounds(172, 196, 105, 27);
		add(btnNewButtonBajaAveria);
		//conexion de boton con controlador
		btnNewButtonBajaAveria.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

	public String getCodigoBajaAveriaVista() {			
		return textFieldCodigoAveriaContenido.getText();
	}
	

	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), "Baja realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), mensaje);		
	}


}
