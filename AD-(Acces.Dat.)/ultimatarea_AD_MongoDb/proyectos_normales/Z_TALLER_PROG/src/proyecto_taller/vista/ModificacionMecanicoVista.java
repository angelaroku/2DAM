package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.ModificacionMecanicoControlador;

public class ModificacionMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonModificacionMecanicos;
	private ModificacionMecanicoControlador controlador;
	
	public ModificacionMecanicoVista() {
		setLayout(null);
		controlador=new ModificacionMecanicoControlador(this);

		btnNewButtonModificacionMecanicos = new JButton("Modificar mecánico");
		btnNewButtonModificacionMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonModificacionMecanicos);
		//conexion de boton con controlador
		btnNewButtonModificacionMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
