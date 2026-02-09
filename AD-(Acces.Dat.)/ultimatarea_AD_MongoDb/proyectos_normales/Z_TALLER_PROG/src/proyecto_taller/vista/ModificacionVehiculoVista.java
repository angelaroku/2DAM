package proyecto_taller.vista;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import proyecto_taller.controlador.ModificacionVehiculosControlador;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;

import javax.swing.JRadioButton;

public class ModificacionVehiculoVista extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextField textFieldModificarVehiculos;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoEnReparacion;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoEnEspera;
	private JRadioButton rdbtnNewRadioButtonModificarEstadoReparado;
	private JRadioButton rdbtnNewRadioButtonModificarTipoCoche;
	private JRadioButton rdbtnNewRadioButtonModificarTipoMoto;
	
	private JButton btnNewButtonModificarVehiculos;
	private ModificacionVehiculosControlador controlador;
 
	//Vehiculo(String matricula, EstadoVehiculo estadoVehiculo, TipoVehiculo tipoVehiculo) 
	public ModificacionVehiculoVista() {
		setLayout(null);
		controlador=new ModificacionVehiculosControlador(this);
		
		JLabel lblModificarVehiculos = new JLabel("Modificar Vehiculos");
		lblModificarVehiculos.setBounds(228, 41, 142, 17);
		add(lblModificarVehiculos);
		
		JLabel lblNewLabelMatriculaModificarVehiculos = new JLabel("Matricula del vehiculo: ");
		lblNewLabelMatriculaModificarVehiculos.setBounds(90, 96, 209, 17);
		add(lblNewLabelMatriculaModificarVehiculos);
		
		textFieldModificarVehiculos = new JTextField();
		textFieldModificarVehiculos.setBounds(228, 94, 248, 21);
		add(textFieldModificarVehiculos);
		textFieldModificarVehiculos.setColumns(10);
		
		
		
		JLabel lblEstado = new JLabel("Estado: ");
		lblEstado.setBounds(90, 125, 60, 17);
		add(lblEstado);
		
		rdbtnNewRadioButtonModificarEstadoEnReparacion = new JRadioButton("En reparación");
		rdbtnNewRadioButtonModificarEstadoEnReparacion.setBounds(117, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoEnReparacion);
		
		rdbtnNewRadioButtonModificarEstadoEnEspera = new JRadioButton("En espera");
		rdbtnNewRadioButtonModificarEstadoEnEspera.setBounds(262, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoEnEspera);
		
		rdbtnNewRadioButtonModificarEstadoReparado = new JRadioButton("Reparado");
		rdbtnNewRadioButtonModificarEstadoReparado.setBounds(396, 150, 130, 25);
		add(rdbtnNewRadioButtonModificarEstadoReparado);
		

		ButtonGroup grupoEstadoVehiculo = new ButtonGroup();
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonModificarEstadoEnReparacion);
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonModificarEstadoEnEspera);
		grupoEstadoVehiculo.add(rdbtnNewRadioButtonModificarEstadoReparado);

		
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setBounds(90, 183, 60, 17);
		add(lblTipo);
		
		rdbtnNewRadioButtonModificarTipoCoche = new JRadioButton("Coche");
		rdbtnNewRadioButtonModificarTipoCoche.setBounds(204, 208, 130, 25);
		add(rdbtnNewRadioButtonModificarTipoCoche);
		
		rdbtnNewRadioButtonModificarTipoMoto = new JRadioButton("Moto");
		rdbtnNewRadioButtonModificarTipoMoto.setBounds(353, 208, 130, 25);
		add(rdbtnNewRadioButtonModificarTipoMoto);
		
		ButtonGroup grupoTipoVehiculo = new ButtonGroup();
		grupoTipoVehiculo.add(rdbtnNewRadioButtonModificarTipoCoche);
		grupoTipoVehiculo.add(rdbtnNewRadioButtonModificarTipoMoto);

		
		btnNewButtonModificarVehiculos = new JButton("Modificar datos");
		btnNewButtonModificarVehiculos.setBounds(209, 280, 192, 27);
		add(btnNewButtonModificarVehiculos);
		//conexion de boton con controlador
		btnNewButtonModificarVehiculos.addActionListener(controlador);

	}
	
	//Metodos que recogen datos relacionados con más clases que la vista

	public String getMatriculaModificacionVehiculoVista() {
		return textFieldModificarVehiculos.getText();
	}
	public EstadoVehiculo getEstadoModificacionVehiculoVista() {
		if (rdbtnNewRadioButtonModificarEstadoEnReparacion.isSelected()==true) {
			return EstadoVehiculo.EN_REPARACION;
		}else if (rdbtnNewRadioButtonModificarEstadoEnEspera.isSelected()==true) {
			return EstadoVehiculo.EN_ESPERA;
		}else if(rdbtnNewRadioButtonModificarEstadoReparado.isSelected()==true) {
			return EstadoVehiculo.REPARADO;
		}else {
			return null;
		}
	}
	
	public TipoVehiculo getTipoVehiculoModificacionVehiculoVista() {
		if (rdbtnNewRadioButtonModificarTipoCoche.isSelected()==true) {
			return TipoVehiculo.COCHE;
		}else if (rdbtnNewRadioButtonModificarTipoMoto.isSelected()==true) {
			return TipoVehiculo.MOTO;
		}else {
			return null;
		}
	}
	
	//metodos de error y acierto
	public void OK() {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldModificarVehiculos), "Modificación realizada con éxito");		

	}
	
	public void error(String mensaje) {
		JOptionPane.showMessageDialog(
				JOptionPane.getFrameForComponent(textFieldModificarVehiculos), mensaje);		
	}

}
