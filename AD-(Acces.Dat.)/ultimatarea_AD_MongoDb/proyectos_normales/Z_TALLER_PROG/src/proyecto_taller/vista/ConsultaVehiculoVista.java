package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.ConsultaVehiculosControlador;
import javax.swing.JTextPane;

public class ConsultaVehiculoVista extends JPanel{
	private static final long serialVersionUID = 1L;

	private JTextField textFieldMatriculaConsultarVehiculos;
	private JTextPane txtpnSalidaConsulta ;
	
	private JButton btnNewButtonConsultarVehiculos;
	private ConsultaVehiculosControlador controlador;
	
	//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) 
	public ConsultaVehiculoVista() {
		setLayout(null);
		controlador=new ConsultaVehiculosControlador(this);

		
		JLabel lblConsultarVehiculos = new JLabel("Consultar Vehiculos");
		lblConsultarVehiculos.setBounds(228, 41, 142, 17);
		add(lblConsultarVehiculos);
		
		JLabel lblNewLabelMatriculaConsultarVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaConsultarVehiculos.setBounds(90, 96, 209, 17);
		add(lblNewLabelMatriculaConsultarVehiculos);
		
		textFieldMatriculaConsultarVehiculos = new JTextField();
		textFieldMatriculaConsultarVehiculos.setBounds(228, 94, 248, 21);
		add(textFieldMatriculaConsultarVehiculos);
		textFieldMatriculaConsultarVehiculos.setColumns(10);
		
		btnNewButtonConsultarVehiculos = new JButton("Consultar datos");
		btnNewButtonConsultarVehiculos.setBounds(205, 154, 165, 27);
		add(btnNewButtonConsultarVehiculos);
		
		txtpnSalidaConsulta = new JTextPane();
		txtpnSalidaConsulta.setToolTipText("");
		txtpnSalidaConsulta.setBounds(90, 208, 248, 190);
		add(txtpnSalidaConsulta);
		
		//conexion de boton con controlador
		btnNewButtonConsultarVehiculos.addActionListener(controlador);
	}
	
	//Metodos que recogen datos relacionados con más clases que la vista
	
		public String getMatriculaConsultaVehiculoVista() {
			return textFieldMatriculaConsultarVehiculos.getText();
		}
		
		public void setSalidaConsultaVehiculoVista(String salidaConsulta) {
			txtpnSalidaConsulta.setText(salidaConsulta); 
		}
		
		//metodos de error y acierto
		public void OK() {
			JOptionPane.showMessageDialog(
					JOptionPane.getFrameForComponent(textFieldMatriculaConsultarVehiculos), "Consulta realizada con éxito");		

		}
		
		public void error(String mensaje) {
			JOptionPane.showMessageDialog(
					JOptionPane.getFrameForComponent(textFieldMatriculaConsultarVehiculos), mensaje);		
		}
	
}