package proyecto_taller.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import proyecto_taller.controlador.AltaMecanicoControlador;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class AltaMecanicoVista  extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldNombreMecanico;
	private JTextField textFieldCodigoMecanico;
	private JRadioButton rdbtnEspecialistaEnCoches;
	private JRadioButton rdbtnEspecialistaEnMotos;
	
	private JButton btnNewButtonAltaMecanicos;
	private AltaMecanicoControlador controlador;
	
	public AltaMecanicoVista() {
		setLayout(null);
		controlador=new AltaMecanicoControlador(this);

		
		JLabel lblAltaMecanicos = new JLabel("Alta Mecanicos");
		lblAltaMecanicos.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAltaMecanicos.setBounds(282, 62, 140, 14);
		add(lblAltaMecanicos);

		JLabel lblNewLabel = new JLabel("Introduzca los datos del nuevo mecánico: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(102, 102, 289, 14);
		add(lblNewLabel);
	
		JLabel lblNombreMecanico = new JLabel("Nombre: ");
		lblNombreMecanico.setBounds(142, 139, 92, 14);
		add(lblNombreMecanico);
		
		textFieldNombreMecanico = new JTextField();
		textFieldNombreMecanico.setBounds(209, 136, 189, 20);
		add(textFieldNombreMecanico);
		textFieldNombreMecanico.setColumns(10);
		
		JLabel lblNewLabelEspecialidadMecanico = new JLabel("Especialidad: ");
		lblNewLabelEspecialidadMecanico.setBounds(142, 226, 92, 14);
		add(lblNewLabelEspecialidadMecanico);
		
		JLabel lblNewLabelCodigoMecanico = new JLabel("Codigo: ");
		lblNewLabelCodigoMecanico.setBounds(142, 178, 46, 14);
		add(lblNewLabelCodigoMecanico);
		
		textFieldCodigoMecanico = new JTextField();
		textFieldCodigoMecanico.setBounds(209, 176, 189, 20);
		add(textFieldCodigoMecanico);
		textFieldCodigoMecanico.setColumns(10);
		
		
		rdbtnEspecialistaEnCoches = new JRadioButton("Especialista en coches");
		rdbtnEspecialistaEnCoches.setBounds(142, 247, 149, 23);
		add(rdbtnEspecialistaEnCoches);

		rdbtnEspecialistaEnMotos = new JRadioButton("Especialista en motos");
		rdbtnEspecialistaEnMotos.setBounds(309, 247, 149, 23);
		add(rdbtnEspecialistaEnMotos);
		

		ButtonGroup grupoEspecialidadMecanico = new ButtonGroup();
		grupoEspecialidadMecanico.add(rdbtnEspecialistaEnCoches);
		grupoEspecialidadMecanico.add(rdbtnEspecialistaEnMotos);

		
		btnNewButtonAltaMecanicos = new JButton("Dar de alta");
		btnNewButtonAltaMecanicos.setBounds(209, 310, 105, 27);
		add(btnNewButtonAltaMecanicos);
		//conexion de boton con controlador
		btnNewButtonAltaMecanicos.addActionListener(controlador);
	}

	//Metodos que recogen datos relacionados con más clases que la vista

}
