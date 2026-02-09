package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.FicheroImportarControlador;

public class FicheroImportarVista extends JPanel{
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonImportarFicheros;
	private FicheroImportarControlador controlador;
	
	public FicheroImportarVista() {
		setLayout(null);
		controlador=new FicheroImportarControlador(this);

		
		btnNewButtonImportarFicheros = new JButton("Importar");
		btnNewButtonImportarFicheros.setBounds(172, 196, 105, 27);
		add(btnNewButtonImportarFicheros);
		//conexion de boton con controlador
		btnNewButtonImportarFicheros.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


	
}
