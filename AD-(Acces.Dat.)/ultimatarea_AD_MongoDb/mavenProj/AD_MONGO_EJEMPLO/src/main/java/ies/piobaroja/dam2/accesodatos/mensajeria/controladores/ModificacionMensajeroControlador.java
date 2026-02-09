package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Mensajero;

public class ModificacionMensajeroControlador {
	
	
	private DAOMensajeria dao=DAOMensajeria.getInstance();
	
	public String[] consulta(int codigo) {
		String[] resultado=new String[2];
		Mensajero mensajero=dao.consultaMensajero(codigo);
		if (mensajero!=null) {
			resultado[0]=mensajero.getNombre();
			resultado[1]=String.valueOf(mensajero.getSueldo());
		}
		
		return resultado;

	}
	
	public void modificar(int codigo, String nombre, double sueldo) {
		Mensajero mensajero=new Mensajero(codigo,nombre,sueldo);
		dao.modificarMensajero(mensajero);
	}

}
