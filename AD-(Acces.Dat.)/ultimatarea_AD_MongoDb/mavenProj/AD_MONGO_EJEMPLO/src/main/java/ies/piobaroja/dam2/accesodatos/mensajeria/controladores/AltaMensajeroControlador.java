package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Mensajero;


public class AltaMensajeroControlador {
	
	private DAOMensajeria dao=DAOMensajeria.getInstance();

	public void altaMensajero(String nombre, double sueldo) {
		System.out.println("altaMensajero");
		Mensajero mensajero=new Mensajero(nombre,sueldo);
		dao.altaMensajero(mensajero);
	}
}
