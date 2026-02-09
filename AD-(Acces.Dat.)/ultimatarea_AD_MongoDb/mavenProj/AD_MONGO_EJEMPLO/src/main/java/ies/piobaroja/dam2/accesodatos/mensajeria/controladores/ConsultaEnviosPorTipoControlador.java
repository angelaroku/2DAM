package ies.piobaroja.dam2.accesodatos.mensajeria.controladores;

import java.util.List;

import ies.piobaroja.dam2.accesodatos.mensajeria.dao.DAOMensajeria;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Carta;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Paquete;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.TipoEstado;

public class ConsultaEnviosPorTipoControlador {

	private DAOMensajeria dao=DAOMensajeria.getInstance();
	
	public String[][] consultarCartas(int tipo) {
		String[][] cartas=null;
		TipoEstado tipEstado=tipo==0?TipoEstado.EN_ESPERA:(tipo==1?TipoEstado.ASIGNADO:TipoEstado.ENTREGADO);
		List<Carta> cartasList=dao.consultaCartas(tipEstado);
		cartas=new String[cartasList.size()][5];
		for (int i=0; i<cartasList.size(); i++) {
			cartas[i][0]=String.valueOf(cartasList.get(i).getCodigo());
			cartas[i][1]=cartasList.get(i).getFecha();
			cartas[i][2]=cartasList.get(i).getDireccionOrigen();
			cartas[i][3]=cartasList.get(i).getDireccionDestino();
			cartas[i][4]=String.valueOf( cartasList.get(i).getPrecio());
		}		
		return cartas;
	}
	
	public String[][] consultarPaquetes(int tipo) {
		
		String[][] paquetes=null;
		TipoEstado tipEstado=tipo==0?TipoEstado.EN_ESPERA:(tipo==1?TipoEstado.ASIGNADO:TipoEstado.ENTREGADO);
		List<Paquete> paquetesList=dao.consultaPaquetes(tipEstado);
		paquetes=new String[paquetesList.size()][6];
		for (int i=0; i<paquetesList.size(); i++) {
			paquetes[i][0]=String.valueOf(paquetesList.get(i).getCodigo());
			paquetes[i][1]=paquetesList.get(i).getFecha();
			paquetes[i][2]=paquetesList.get(i).getDireccionOrigen();
			paquetes[i][3]=paquetesList.get(i).getDireccionDestino();
			paquetes[i][4]=String.valueOf( paquetesList.get(i).getPeso());
			paquetes[i][5]=String.valueOf( paquetesList.get(i).getPrecioKilo());
		}		
		return paquetes;
			
	}

}
