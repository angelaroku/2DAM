package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Carta;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Paquete;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.TipoEstado;

public class AltaEnvioControlador {

	private DAOMensajeria dao=DAOMensajeria.getInstance();
	

	public void altaCarta(String fecha, String origen, String destino, double precio) {
		// TODO Auto-generated method stub		
		Carta carta=new Carta(fecha,origen,destino,
				TipoEstado.EN_ESPERA,
				precio);
		dao.altaEnvio(carta);;
	}


	public void altaPaquete(String fecha, String origen, String destino, double peso, double precioKilo) {
		// TODO Auto-generated method stub
		Paquete paquete=new Paquete(fecha,origen,destino,
				TipoEstado.EN_ESPERA,
				peso,precioKilo);
		dao.altaEnvio(paquete);
	}
}
