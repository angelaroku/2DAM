package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Mecanico;
import proyecto_taller.vista.AltaMecanicoVista;

public class AltaMecanicoControlador implements ActionListener{
	private AltaMecanicoVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	
	public AltaMecanicoControlador(AltaMecanicoVista vistaControlador) {
		this.vistaControlador = vistaControlador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//recogida de valores de la vista y salida por consola

		//validaciones

		//creacion del alta y salida de exito y error 
	}
	
	
	
	

}
