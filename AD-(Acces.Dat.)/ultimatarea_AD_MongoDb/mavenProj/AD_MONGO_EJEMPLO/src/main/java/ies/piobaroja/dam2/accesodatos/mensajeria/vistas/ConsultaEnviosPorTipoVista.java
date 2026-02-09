package ies.piobaroja.dam2.accesodatos.mensajeria.vistas;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

import ies.piobaroja.dam2.accesodatos.mensajeria.controladores.ConsultaEnviosPorTipoControlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ConsultaEnviosPorTipoVista extends JPanel {
	
	String[][] paquetes=new String[0][0];
	String[][] cartas=new String[0][0];
	
	public ConsultaEnviosPorTipoVista() {
		setForeground(UIManager.getColor("Button.background"));
		setLayout(null);
		
		ConsultaEnviosPorTipoControlador controlador=new ConsultaEnviosPorTipoControlador();
	
		JLabel titulo = new JLabel("ENVIOS EN ESPERA");
		titulo.setBounds(118, 5, 260, 22);
		titulo.setFont(new Font("Dialog", Font.BOLD, 18));
		add(titulo);
		
		
		JRadioButton rdbtnEnEsperaq = new JRadioButton("EN_ESPERA");
		rdbtnEnEsperaq.setBounds(33, 35, 127, 25);
		add(rdbtnEnEsperaq);
		
		JRadioButton rdbtnAsignado = new JRadioButton("ASIGNADO");
		rdbtnAsignado.setBounds(184, 35, 113, 25);
		add(rdbtnAsignado);
		
		JRadioButton rdbtnTermiando = new JRadioButton("TERMINADO");
		rdbtnTermiando.setBounds(313, 35, 113, 25);
		add(rdbtnTermiando);
		
		ButtonGroup bgTipoEnvio=new ButtonGroup();
		bgTipoEnvio.add(rdbtnEnEsperaq);
		bgTipoEnvio.add(rdbtnAsignado);
		bgTipoEnvio.add(rdbtnTermiando);


		//Cartas
		JLabel cartasLabel = new JLabel("Cartas");
		cartasLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cartasLabel.setBounds(10, 96, 80, 14);
		add(cartasLabel);
		


		
		//Paquetes
		JLabel paquetesLabel = new JLabel("Paquetes");
		paquetesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		paquetesLabel.setBounds(10, 219, 80, 14);
		add(paquetesLabel);
		




		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(168, 68, 105, 27);
		add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				int tipo=rdbtnEnEsperaq.isSelected()?0:
					(rdbtnAsignado.isSelected()?1:2);	
				System.out.println("Tipo:"+tipo);
	
				
				final String[] cabeceraTabla= {"Codigo","Fecha","Origen", 
						"Destino","Precio"};
				cartas=controlador.consultarCartas(tipo);				
				JTable tablaCartas=new JTable(cartas,cabeceraTabla) {
					// Se hacen las celdas no editables.
					public boolean isCellEditable(int row, int column) {
				            return false;
				         }
				};
				tablaCartas.setGridColor(Color.BLACK);	
				JScrollPane scrollPane = new JScrollPane(tablaCartas);
				scrollPane.setBounds(10, 122, 388, 85);
				add(scrollPane);
				
				

				final String[] cabeceraPaqueteTabla= {"Codigo","Fecha","Origen", 
						"Destino","Peso","PrecioKilo"};
				paquetes=controlador.consultarPaquetes(tipo);
				JTable tablaPaquete=new JTable(paquetes,cabeceraPaqueteTabla) {
					// Se hacen las celdas no editables.
					public boolean isCellEditable(int row, int column) {
				            return false;
				         }
				};
				
				JScrollPane scrollPane_1 = new JScrollPane(tablaPaquete);
				scrollPane_1.setBounds(12, 245, 388, 85);
				add(scrollPane_1);
				
			}
			
		});
		
		
	

		

		






	}
}