package ies.piobaroja.dam2.accesodatos.mensajeria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.AltaEnvioVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.AltaMensajeroVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.AsignarEnvioVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.BajaMensajeroVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.ConsultaEnviosPorTipoVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.ConsultaMensajeroVista;
import ies.piobaroja.dam2.accesodatos.mensajeria.vistas.ModificacionMensajeroVista;

public class Ventana extends JFrame implements ActionListener{
	
	private JMenuBar menuBar;
	// Mensajero
	private JMenu mensajeroMenu;
	private JMenuItem altaMensajeroJMenuItem;
	private JMenuItem bajaMensajeroJMenuItem;
	private JMenuItem consultaMensajeroJMenuItem;
	private JMenuItem modificacionMensajeroJMenuItem;
	

	
	// Envios
	private JMenu envioMenu;
	private JMenuItem altaEnvioMenuItem;
	private JMenuItem asignarEnvioMenuItem;
	private JMenuItem entregaEnvioMenuItem;
	
	//Consultas
	private JMenu consultasMenu;
	private JMenuItem consutasEnviosJMenuItem;
	
	
	//Vistas
	private AltaMensajeroVista altaMensajeroVista;
	private BajaMensajeroVista bajaMensajeroVista;
	private ConsultaMensajeroVista consultaMensajeroVista;
	private ModificacionMensajeroVista modificacionMensajeroVista;
	private AltaEnvioVista altaEnvioVista;
	private AsignarEnvioVista asignarEnvioVista;
	private ConsultaEnviosPorTipoVista consultaEnviosPorTipoVista;
	
	public Ventana() {
		menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		mensajeroMenu=new JMenu("Mensajero");
		menuBar.add(mensajeroMenu);
		altaMensajeroJMenuItem=new JMenuItem("Alta");
		mensajeroMenu.add(altaMensajeroJMenuItem);
		altaMensajeroJMenuItem.addActionListener(this);
		
		bajaMensajeroJMenuItem=new JMenuItem("Baja");
		mensajeroMenu.add(bajaMensajeroJMenuItem);
		bajaMensajeroJMenuItem.addActionListener(this);

		consultaMensajeroJMenuItem=new JMenuItem("Consulta");
		mensajeroMenu.add(consultaMensajeroJMenuItem);
		consultaMensajeroJMenuItem.addActionListener(this);

		modificacionMensajeroJMenuItem=new JMenuItem("Modificacion");
		mensajeroMenu.add(modificacionMensajeroJMenuItem);
		modificacionMensajeroJMenuItem.addActionListener(this);
		
		// Menu envios
		envioMenu=new JMenu("Envios");
		menuBar.add(envioMenu);
		
		altaEnvioMenuItem = new JMenuItem("Alta envio");
		envioMenu.add(altaEnvioMenuItem);
		altaEnvioMenuItem.addActionListener(this);
			
		asignarEnvioMenuItem = new JMenuItem("Asignar Envio");
		envioMenu.add(asignarEnvioMenuItem);
		asignarEnvioMenuItem.addActionListener(this);
		
		entregaEnvioMenuItem = new JMenuItem("Entrega Envio");
		envioMenu.add(entregaEnvioMenuItem);
		entregaEnvioMenuItem.addActionListener(this);

		altaMensajeroVista=new AltaMensajeroVista();
		bajaMensajeroVista=new BajaMensajeroVista();
		consultaMensajeroVista=new ConsultaMensajeroVista();
		modificacionMensajeroVista=new ModificacionMensajeroVista();
		altaEnvioVista=new AltaEnvioVista();
		asignarEnvioVista=new AsignarEnvioVista();
		consultaEnviosPorTipoVista=new ConsultaEnviosPorTipoVista();
		
		
		// Menu consultas
		consultasMenu=new JMenu("Consultas");
		menuBar.add(consultasMenu);
		consutasEnviosJMenuItem=new JMenuItem("Envios por tipo");
		consultasMenu.add(consutasEnviosJMenuItem);
		consutasEnviosJMenuItem.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getSource()==altaMensajeroJMenuItem) {
			System.out.println("Alta");
			setContentPane(altaMensajeroVista);
			setVisible(true);			
			
		}else if (e.getSource()==bajaMensajeroJMenuItem) {
			System.out.println("Baja");
			setContentPane(bajaMensajeroVista);
			setVisible(true);
			
		}else if (e.getSource()==consultaMensajeroJMenuItem) {
			System.out.println("Consulta");
			setContentPane(consultaMensajeroVista);
			setVisible(true);
			
		}else if (e.getSource()==modificacionMensajeroJMenuItem) {
			System.out.println("Modificacion");
			setContentPane(modificacionMensajeroVista);
			setVisible(true);
	
		}else if (e.getSource() == altaEnvioMenuItem) {
			System.out.println("Alta envio");
			setContentPane(altaEnvioVista);
			setVisible(true);
		}else if (e.getSource() == asignarEnvioMenuItem) {
			System.out.println("Asgnar Envio envio");
			setContentPane(asignarEnvioVista);
			setVisible(true);	
		}else if (e.getSource()==consutasEnviosJMenuItem) {
			System.out.println("Consultar envios");
			setContentPane(consultaEnviosPorTipoVista);
			setVisible(true);	
		} else {
			System.out.println("Evento no tratado");
		}
	}
}
