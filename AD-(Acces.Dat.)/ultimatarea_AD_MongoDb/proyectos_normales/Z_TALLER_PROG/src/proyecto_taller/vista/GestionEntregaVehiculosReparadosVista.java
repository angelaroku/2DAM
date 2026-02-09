package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.GestionEntregaVehiculosReparadosControlador;

public class GestionEntregaVehiculosReparadosVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonGestionEntregaVehiculos;
	private GestionEntregaVehiculosReparadosControlador controlador;
	
	public GestionEntregaVehiculosReparadosVista() {
		setLayout(null);
		controlador=new GestionEntregaVehiculosReparadosControlador(this);

		
		btnNewButtonGestionEntregaVehiculos = new JButton("Entregar vehículo");
		btnNewButtonGestionEntregaVehiculos.setBounds(172, 196, 105, 27);
		add(btnNewButtonGestionEntregaVehiculos);
		//conexion de boton con controlador
		//btnNewButtonGestionEntregaVehiculos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
