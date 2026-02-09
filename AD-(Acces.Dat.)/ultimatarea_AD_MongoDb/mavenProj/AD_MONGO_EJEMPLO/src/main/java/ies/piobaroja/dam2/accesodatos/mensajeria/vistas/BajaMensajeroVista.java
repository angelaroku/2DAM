package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import javax.swing.JPanel;

import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.AltaMensajeroControlador;
import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.BajaMensajeroControlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class BajaMensajeroVista extends JPanel{
	
	private BajaMensajeroControlador controlador;
	private JTextField codigoTextField;
	
	
	public BajaMensajeroVista() {
		setLayout(null);
		controlador=new BajaMensajeroControlador();
		
		JLabel tituloLabel = new JLabel("Baja Menajero");
		tituloLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		tituloLabel.setBounds(120, 23, 139, 17);
		add(tituloLabel);
		
		JButton bajaButton = new JButton("Baja");
		bajaButton.setBounds(113, 115, 105, 27);
		add(bajaButton);
		
		JLabel codigoLabel = new JLabel("Codigo:");
		codigoLabel.setBounds(57, 61, 60, 17);
		add(codigoLabel);
		
		codigoTextField = new JTextField();
		codigoTextField.setBounds(113, 59, 114, 21);
		add(codigoTextField);
		codigoTextField.setColumns(10);
		bajaButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int codigo=Integer.parseInt(codigoTextField.getText());
					if (controlador.baja(codigo) ) {
						codigoTextField.setText("");
						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(bajaButton),"Baja correcta");
					}
					else {
						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(bajaButton),"Codigo no encontrado");
					}
				} 
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(bajaButton),"El codigo debe ser numerico");
					
				}
			}
			
		});
		

	}
}
