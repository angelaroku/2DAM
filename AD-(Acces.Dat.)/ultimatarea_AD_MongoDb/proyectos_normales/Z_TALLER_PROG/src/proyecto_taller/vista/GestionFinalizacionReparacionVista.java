package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.GestionFinalizacionReparacionControlador;

public class GestionFinalizacionReparacionVista extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonGestionFinalizacionReparacion;
	private GestionFinalizacionReparacionControlador controlador;

	public GestionFinalizacionReparacionVista() {
		setLayout(null);
		controlador=new GestionFinalizacionReparacionControlador(this);

		btnNewButtonGestionFinalizacionReparacion = new JButton("Finalizar reparación");
		btnNewButtonGestionFinalizacionReparacion.setBounds(172, 196, 105, 27);
		add(btnNewButtonGestionFinalizacionReparacion);
		//conexion de boton con controlador
		//btnNewButtonGestionFinalizacionReparacion.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
