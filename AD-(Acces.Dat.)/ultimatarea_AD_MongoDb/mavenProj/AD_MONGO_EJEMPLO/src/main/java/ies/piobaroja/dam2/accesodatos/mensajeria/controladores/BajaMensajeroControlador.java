package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Mensajero;

public class BajaMensajeroControlador {

	
	private DAOMensajeria dao=DAOMensajeria.getInstance();

	public boolean baja(int codigo) {
		
		Mensajero m;
		m=dao.consultaMensajero(codigo);
		if (m!=null) {
			dao.borrarMensajero(m);
			return true;
		}
		return false;
	}
	
}
