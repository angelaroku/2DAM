package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.AltaMensajeroControlador;

import javax.swing.JButton;

public class AltaMensajeroVista extends JPanel{
	private JTextField nombreTextField;
	private JTextField sueldoTextField;
	private AltaMensajeroControlador controlador;
	
	public AltaMensajeroVista() {
		setLayout(null);
		
		controlador=new AltaMensajeroControlador();
		JLabel tituloLabel = new JLabel("Alta Mensajero");
		tituloLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		tituloLabel.setBounds(120, 12, 128, 17);
		add(tituloLabel);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(40, 39, 60, 17);
		add(nombreLabel);
		
		nombreTextField = new JTextField();
		nombreTextField.setBounds(120, 37, 114, 21);
		add(nombreTextField);
		nombreTextField.setColumns(10);
		
		JLabel sueldoLabel = new JLabel("Sueldo:");
		sueldoLabel.setBounds(40, 68, 60, 17);
		add(sueldoLabel);
		
		sueldoTextField = new JTextField();
		sueldoTextField.setBounds(120, 70, 114, 21);
		add(sueldoTextField);
		sueldoTextField.setColumns(10);
		
		JButton altaButton = new JButton("Alta");
		altaButton.setBounds(113, 115, 105, 27);
		add(altaButton);
		altaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Pinchar boton alta");
				String nombre=nombreTextField.getText();
				try {
					double sueldo=Double.parseDouble(sueldoTextField.getText());
					controlador.altaMensajero(nombre, sueldo);
					clear();
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(altaButton),"Alta correcta");
				} catch (NumberFormatException nfe ) {
					System.out.println("Formato sueldo incorrecto");
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(altaButton),"Formato incorrecto");
				}
			}
			
		});
	}
	
	private void clear() {
		sueldoTextField.setText("");
		nombreTextField.setText("");
	}
}
