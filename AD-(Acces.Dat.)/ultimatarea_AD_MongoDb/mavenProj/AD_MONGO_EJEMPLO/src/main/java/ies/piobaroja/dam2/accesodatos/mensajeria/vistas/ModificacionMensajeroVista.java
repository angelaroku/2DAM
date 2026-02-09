package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.ModificacionMensajeroControlador;

public class ModificacionMensajeroVista extends JPanel {
	
	private JTextField nombreTextField;
	private JTextField sueldoTextField;
	private ModificacionMensajeroControlador controlador;
	private JTextField codigoTextField;

	public ModificacionMensajeroVista() {
		super();
		controlador=new ModificacionMensajeroControlador();
		
		setLayout(null);
		JLabel tituloLabel = new JLabel("Modificacion Menajero");
		tituloLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		tituloLabel.setBounds(132, 12, 164, 17);
		add(tituloLabel);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(57, 60, 60, 17);
		add(lblCodigo);
		
		codigoTextField = new JTextField();
		codigoTextField.setBounds(120, 56, 114, 21);
		add(codigoTextField);
		codigoTextField.setColumns(10);
	
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(57, 89, 60, 17);
		add(nombreLabel);
		
		nombreTextField = new JTextField();
		nombreTextField.setBounds(120, 87, 114, 21);
		add(nombreTextField);
		nombreTextField.setColumns(10);
		
		JLabel sueldoLabel = new JLabel("Sueldo:");
		sueldoLabel.setBounds(57, 122, 60, 17);
		add(sueldoLabel);
		
		sueldoTextField = new JTextField();
		sueldoTextField.setBounds(120, 120, 114, 21);
		add(sueldoTextField);
		sueldoTextField.setColumns(10);
		
		codigoTextField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Buscando mensajero para modificar");
					try {
					String[] resultado=controlador.consulta(
							Integer.parseInt(codigoTextField.getText()));
					if (resultado[0]!=null) {
						nombreTextField.setText(resultado[0]);
						sueldoTextField.setText(resultado[1]);
						
					}
					else {
						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(codigoTextField),"Mensajero no encontrado");
						nombreTextField.setText("");
						sueldoTextField.setText("");
	
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(codigoTextField),"El codigo es entero");
					codigoTextField.setText("");
				}
			}
			
		});

		
		
		
		JButton modifButton = new JButton("Modificar");
		modifButton.setBounds(120, 153, 105, 27);
		add(modifButton);
		

		modifButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Pinchar boton alta");
				String nombre=nombreTextField.getText();
				try {
					int codigo=Integer.parseInt(codigoTextField.getText());
					double sueldo=Double.parseDouble(sueldoTextField.getText());
					controlador.modificar(codigo,nombreTextField.getText(), sueldo);
					clear();
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(modifButton),"Modificacion correcta");
				} catch (NumberFormatException nfe ) {
					System.out.println("Formato sueldo incorrecto");
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(modifButton),"Formato incorrecto");
				}
			}
			
		});
	}
	
	private void clear() {
		codigoTextField.setText("");
		sueldoTextField.setText("");
		nombreTextField.setText("");
	}
}
