package proyecto_taller.vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;

import proyecto_taller.controlador.AltaVehiculosControlador;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class AltaVehiculoVista extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField textFieldMatriculaVehiculo;
	private JRadioButton rdbtnNewRadioButtonEstadoVEnReparacion;
	private JRadioButton rdbtnNewRadioButtonEstadoVEnEspera;
	private JRadioButton rdbtnNewRadioButtonEstadoVReparando;
	private JRadioButton rdbtnNewRadioButtonTipoVChoche;
	private JRadioButton rdbtnNewRadioButtonTipoVMoto;
	
	
	private AltaVehiculosControlador controlador;
	private JButton btnNewButtonAltaVehiculo;
	
	//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) 
	public  AltaVehiculoVista () {
		setLayout(null);
		controlador=new AltaVehiculosControlador(this);
		
		JLabel lblNewLabelTitleAltaVehiculo = new JLabel("Alta Vehiculos");
		lblNewLabelTitleAltaVehiculo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelTitleAltaVehiculo.setBounds(238, 47, 140, 14);
		add(lblNewLabelTitleAltaVehiculo);
		
		JLabel lblNewLabelMatriculaVehiculo = new JLabel("Matrícula: ");
		lblNewLabelMatriculaVehiculo.setBounds(97, 97, 74, 14);
		add(lblNewLabelMatriculaVehiculo);
		
		textFieldMatriculaVehiculo = new JTextField();
		textFieldMatriculaVehiculo.setBounds(174, 94, 180, 20);
		add(textFieldMatriculaVehiculo);
		textFieldMatriculaVehiculo.setColumns(10);
		
		JLabel lblNewLabelEstadoVehiculo = new JLabel("Estado: ");
		lblNewLabelEstadoVehiculo.setBounds(97, 149, 75, 14);
		add(lblNewLabelEstadoVehiculo);
		
		rdbtnNewRadioButtonEstadoVEnReparacion = new JRadioButton("En Reparacion");
		rdbtnNewRadioButtonEstadoVEnReparacion.setBounds(138, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVEnReparacion);
		
		rdbtnNewRadioButtonEstadoVEnEspera = new JRadioButton("En Espera");
		rdbtnNewRadioButtonEstadoVEnEspera.setBounds(269, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVEnEspera);
		
		rdbtnNewRadioButtonEstadoVReparando = new JRadioButton("Reparando");
		rdbtnNewRadioButtonEstadoVReparando.setBounds(382, 170, 109, 23);
		add(rdbtnNewRadioButtonEstadoVReparando);
		
		ButtonGroup grupoEstadoVehiculo = new ButtonGroup();
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonEstadoVEnReparacion);
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonEstadoVEnEspera);
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonEstadoVReparando);

		
		JLabel lblNewLabelTipoVehiculo = new JLabel("Tipo:");
		lblNewLabelTipoVehiculo.setBounds(97, 223, 52, 14);
		add(lblNewLabelTipoVehiculo);
		
		rdbtnNewRadioButtonTipoVChoche = new JRadioButton("Coche");
		rdbtnNewRadioButtonTipoVChoche.setBounds(138, 244, 109, 23);
		add(rdbtnNewRadioButtonTipoVChoche);
		
		rdbtnNewRadioButtonTipoVMoto = new JRadioButton("Moto");
		rdbtnNewRadioButtonTipoVMoto.setBounds(269, 244, 109, 23);
		add(rdbtnNewRadioButtonTipoVMoto);
		
		ButtonGroup grupoTipoVehiculo = new ButtonGroup();
		grupoTipoVehiculo.add(rdbtnNewRadioButtonTipoVChoche);
		grupoTipoVehiculo.add(rdbtnNewRadioButtonTipoVMoto);

		
		
		btnNewButtonAltaVehiculo = new JButton("Dar de alta");
		btnNewButtonAltaVehiculo.setBounds(225, 299, 153, 23);
		add(btnNewButtonAltaVehiculo);
		//conexion de boton con controlador
		btnNewButtonAltaVehiculo.addActionListener(controlador);
		
	}

//Metodos que recogen datos relacionados con más clases que la vista

	public String getMatriculaAltaVehiculoVista() {
		return textFieldMatriculaVehiculo.getText();
	}
	
	public EstadoVehiculo getEstadoAltaVehiculoVista() {
		if (rdbtnNewRadioButtonEstadoVEnReparacion.isSelected()==true) {
			return EstadoVehiculo.EN_REPARACION;
		}else if (rdbtnNewRadioButtonEstadoVEnEspera.isSelected()==true) {
			return EstadoVehiculo.EN_ESPERA;
		}else if(rdbtnNewRadioButtonEstadoVReparando.isSelected()==true) {
			return EstadoVehiculo.REPARADO;
		}else {
			return null;
		}
	}
	
	public TipoVehiculo getTipoVehiculoAltaVehiculoVista() {
		if (rdbtnNewRadioButtonTipoVChoche.isSelected()==true) {
			return TipoVehiculo.COCHE;
		}else if (rdbtnNewRadioButtonTipoVMoto.isSelected()==true) {
			return TipoVehiculo.MOTO;
		}else {
			return null;
		}
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldMatriculaVehiculo), "Alta realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldMatriculaVehiculo), mensaje);		
	}
	
}




