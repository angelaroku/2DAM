package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Envio;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Mensajero;

public class AsignarEnvioControlador{

	private DAOMensajeria dao=DAOMensajeria.getInstance();
	

	public void asignarEnvio(int codigoE, int codigoM) {
		// TODO Auto-generated method stub
		
		Mensajero m=dao.consultaMensajero(codigoM);
		Envio e=dao.consultarEnvio(codigoE);
		dao.asignarEnvio(m, e);
	}

}