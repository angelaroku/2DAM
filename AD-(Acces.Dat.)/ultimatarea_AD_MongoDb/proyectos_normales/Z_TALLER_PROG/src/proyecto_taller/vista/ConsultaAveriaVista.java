package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.ConsultaAveriaControlador;
import javax.swing.JTextPane;

public class ConsultaAveriaVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldCodigoAveriaContenido; 
	private JTextPane txtpnSalidaConsulta;

	
	private JButton btnNewButtonConsultaAveria;
	private ConsultaAveriaControlador controlador;

	//Averia(int codigoAveria, String descripcionAveria, double costeAveria)
	public ConsultaAveriaVista() {
		setLayout(null);
		controlador=new ConsultaAveriaControlador(this);
		

		JLabel lblConsultaAveria = new JLabel("Consulta Averia");
		lblConsultaAveria.setBounds(208, 39, 142, 17);
		add(lblConsultaAveria);
		
		JLabel lblNewLabelCodigoAveria = new JLabel("Código avería: ");
		lblNewLabelCodigoAveria.setBounds(90, 96, 136, 17);
		add(lblNewLabelCodigoAveria);
		
		textFieldCodigoAveriaContenido = new JTextField();
		textFieldCodigoAveriaContenido.setBounds(195, 94, 198, 21);
		add(textFieldCodigoAveriaContenido);
		textFieldCodigoAveriaContenido.setColumns(10);
		

		
		btnNewButtonConsultaAveria = new JButton("Consultar avería");
		btnNewButtonConsultaAveria.setBounds(173, 124, 168, 27);
		add(btnNewButtonConsultaAveria);
		
		txtpnSalidaConsulta = new JTextPane();
		txtpnSalidaConsulta.setToolTipText("");
		txtpnSalidaConsulta.setBounds(90, 162, 248, 190);
		add(txtpnSalidaConsulta);
		//conexion de boton con controlador
		btnNewButtonConsultaAveria.addActionListener(controlador);
		
	}

	//Metodos que recogen datos relacionados con más clases que la vista
	
	public String getCodigoConsultaAveriaVista() {			
		return textFieldCodigoAveriaContenido.getText();
	}

	public void setSalidaConsultaAveriaVista(String salidaConsulta) {
		txtpnSalidaConsulta.setText(salidaConsulta); 
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), "Consulta realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldCodigoAveriaContenido), mensaje);		
	}


}
