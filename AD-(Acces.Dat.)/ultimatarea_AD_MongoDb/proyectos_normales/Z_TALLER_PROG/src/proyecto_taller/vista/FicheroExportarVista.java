package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.FicheroExportarControlador;

public class FicheroExportarVista extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private JButton btnNewButtonExportarFicheros;
	private FicheroExportarControlador controlador;
	
	public FicheroExportarVista() {
		setLayout(null);
		controlador=new FicheroExportarControlador(this);

		
		btnNewButtonExportarFicheros = new JButton("Exportar");
		btnNewButtonExportarFicheros.setBounds(172, 196, 105, 27);
		add(btnNewButtonExportarFicheros);
		//conexion de boton con controlador
		btnNewButtonExportarFicheros.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
