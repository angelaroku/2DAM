package proyecto_taller.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import proyecto_taller.controlador.BajaVehiculosControlador;

import javax.swing.JButton;

public class BajaVehiculoVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldMatriculaBajaVehiculos;
	
	private JButton btnNewButtonBajaVehiculo;
	private BajaVehiculosControlador controlador;
	
	//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) 
	public BajaVehiculoVista() {
		setLayout(null);
		controlador=new BajaVehiculosControlador(this);
		
		JLabel lblBajaVehiculos = new JLabel("Baja Vehiculos");
		lblBajaVehiculos.setBounds(228, 41, 142, 17);
		add(lblBajaVehiculos);
		
		JLabel lblNewLabelMatriculaBajaVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaBajaVehiculos.setBounds(90, 96, 189, 17);
		add(lblNewLabelMatriculaBajaVehiculos);
		
		textFieldMatriculaBajaVehiculos = new JTextField();
		textFieldMatriculaBajaVehiculos.setBounds(228, 94, 248, 21);
		add(textFieldMatriculaBajaVehiculos);
		textFieldMatriculaBajaVehiculos.setColumns(10);
		
		btnNewButtonBajaVehiculo = new JButton("Dar de baja");
		btnNewButtonBajaVehiculo.setBounds(228, 190, 105, 27);
		add(btnNewButtonBajaVehiculo);
		//conexion de boton con controlador
		btnNewButtonBajaVehiculo.addActionListener(controlador);
	}
	//Metodos que recogen datos relacionados con más clases que la vista
	
	public String getMatriculaBajaVehiculoVista() {
		return textFieldMatriculaBajaVehiculos.getText();
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldMatriculaBajaVehiculos), "Baja realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldMatriculaBajaVehiculos), mensaje);		
	}
	
}