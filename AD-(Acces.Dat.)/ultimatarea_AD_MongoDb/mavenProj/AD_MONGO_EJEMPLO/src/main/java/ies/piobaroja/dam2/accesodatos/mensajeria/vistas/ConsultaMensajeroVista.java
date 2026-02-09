package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.ConsultaMensajeroControlador;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultaMensajeroVista  extends JPanel{
	private JTextField codigoTextField;
	private ConsultaMensajeroControlador controlador;

	public ConsultaMensajeroVista() {
		super();
		controlador=new ConsultaMensajeroControlador();
		
		setLayout(null);
		JLabel tituloLabel = new JLabel("Consulta Menajero");
		tituloLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		tituloLabel.setBounds(86, 12, 201, 17);
		add(tituloLabel);
		
		JLabel codigoLabel = new JLabel("Codigo:");
		codigoLabel.setBounds(38, 41, 60, 17);
		add(codigoLabel);
		
		codigoTextField = new JTextField();
		codigoTextField.setBounds(96, 39, 114, 21);
		add(codigoTextField);
		codigoTextField.setColumns(10);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(106, 83, 105, 27);
		add(btnConsulta);
		
		JLabel nombreLabel = new JLabel("Nombre a mostrar");
		nombreLabel.setBounds(38, 135, 154, 18);
		add(nombreLabel);
		
		JLabel sueldoLabel = new JLabel("Sueldo a mostrar ...");
		sueldoLabel.setBounds(38, 173, 137, 17);
		add(sueldoLabel);
		
		btnConsulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String[] resultado=controlador.consulta(
						Integer.parseInt(codigoTextField.getText()));
				if (resultado[0]!=null) {
					nombreLabel.setText("Nombre: "+resultado[0]);
					sueldoLabel.setText("Sueldo: "+resultado[1]);
					
				}
				else {
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(btnConsulta),"Mensajero no encontrado");
				}
			}
			
		});
		
	}
	

}
