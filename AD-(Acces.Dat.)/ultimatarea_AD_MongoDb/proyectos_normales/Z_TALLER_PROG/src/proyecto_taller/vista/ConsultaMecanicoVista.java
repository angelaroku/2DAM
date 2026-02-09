package proyecto_taller.vista;

import javax.swing.JButton;
import javax.swing.JPanel;

import proyecto_taller.controlador.ConsultaMecanicoControlador;

public class ConsultaMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;

	private JButton btnNewButtonConsultaMecanicos;
	private ConsultaMecanicoControlador controlador;

	public ConsultaMecanicoVista() {
		setLayout(null);
		controlador=new ConsultaMecanicoControlador(this);

		btnNewButtonConsultaMecanicos = new JButton("Consutar mecánico");
		btnNewButtonConsultaMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonConsultaMecanicos);
		//conexion de boton con controlador
		btnNewButtonConsultaMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista


}
