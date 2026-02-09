package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.AsignarEnvioControlador;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AsignarEnvioVista extends JPanel {
	private JTextField codigoEtextField;
	private JTextField codigoMtextField;
	private AsignarEnvioControlador controlador;
	/**
	 * Create the panel.
	 */
	public AsignarEnvioVista() {
		setLayout(null);
		
		controlador=new AsignarEnvioControlador();
		
		
		JLabel codigoELabel = new JLabel("Codigo Envio:");
		codigoELabel.setBounds(36, 48, 90, 20);
		add(codigoELabel);
		
		codigoEtextField = new JTextField();
		codigoEtextField.setBounds(152, 48, 100, 20);
		add(codigoEtextField);
		codigoEtextField.setColumns(10);
		
		JLabel codigoMLabel = new JLabel("Codigo Mensajero:");
		codigoMLabel.setBounds(36, 82, 100, 14);
		add(codigoMLabel);
		
		codigoMtextField = new JTextField();
		codigoMtextField.setBounds(152, 79, 100, 20);
		add(codigoMtextField);
		codigoMtextField.setColumns(10);
		
		JLabel tituloLabel = new JLabel("ASIGNAR ENVIO");
		tituloLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		tituloLabel.setBounds(106, 11, 185, 21);
		add(tituloLabel);
		
		JButton asignarButton = new JButton("Asignar");
		asignarButton.setBounds(147, 128, 89, 23);
		add(asignarButton);
		asignarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int codigoE=Integer.parseInt(codigoEtextField.getText());
					int codigoM=Integer.parseInt(codigoMtextField.getText());

//					if (!controlador.comprobarEnvioEnEntrega(codigoE)) {
//						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(asignarButton),"Envio asignado o no se encuentra");
//						}
//					else if (!controlador.comprobarMensajeroLibre(codigoM)) {
//						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(asignarButton),"El mensajero no esta libre");
//					}
//					else {
						controlador.asignarEnvio(codigoE, codigoM);
						JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(asignarButton),"Asignacion correcta");
//					}
				} catch (NumberFormatException ne) {
					System.out.println("Formato incorrecto");
					JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(asignarButton),"Formato incorrecto");
				} 
			}
		});

	}
}