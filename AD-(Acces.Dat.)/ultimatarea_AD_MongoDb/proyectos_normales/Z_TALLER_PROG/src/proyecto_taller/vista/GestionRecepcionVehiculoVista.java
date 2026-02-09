package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.GestionRecepcionVehiculoControlador;

public class GestionRecepcionVehiculoVista extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonGestionRecepcionVehiculo;
	private GestionRecepcionVehiculoControlador controlador;

	public GestionRecepcionVehiculoVista() {
		setLayout(null);
		controlador=new GestionRecepcionVehiculoControlador(this);

		
		btnNewButtonGestionRecepcionVehiculo = new JButton("Recibir vehículo");
		btnNewButtonGestionRecepcionVehiculo.setBounds(172, 196, 105, 27);
		add(btnNewButtonGestionRecepcionVehiculo);
		//conexion de boton con controlador
		//btnNewButtonGestionRecepcionVehiculo.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
