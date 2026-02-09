package ies.piobaroja.dam2.accesoadatos.studyapp.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class StudyApp {
	//atributos array de cada elemento del menu principal 
	private ArrayList<Ficha> fichas;
	private ArrayList<Caja> cajas;
	private ArrayList<Coleccion> colecciones;
	
	//constructor de STUDY APP
	public StudyApp() {
		fichas = new ArrayList<>();
		cajas = new ArrayList<>();
		colecciones = new ArrayList<>();
		
	}
	
	//Metodos CRUD de cada array
	public void altaFicha(Ficha fichaNueva) {
		fichas.add(fichaNueva);
	}
	
	public void altaCaja(Caja cajaNueva) {
		cajas.add(cajaNueva);
	}
	
	public void altaColeccion(Coleccion coleccionNueva) {
		colecciones.add(coleccionNueva);
	}
	
	public boolean bajaFicha(String pregunta) {
		Iterator <Ficha> it = fichas.iterator();
		while(it.hasNext()){
			if(it.next().getPregunta()==pregunta) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean bajaCaja(int numCaja) {
		Iterator<Caja> it = cajas.iterator();
		while(it.hasNext()) {
			if(it.next().getNumCaja()==numCaja) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public boolean bajaColeccion(int id_coleccion) {
		Iterator<Coleccion> it = colecciones.iterator();
		while(it.next().getId_coleccion()==id_coleccion) {
			it.remove();
			return true;
		}
		return false;
	}
	
	public Ficha consultaFicha(String pregunta) {
		for (Ficha fichaConsultada: fichas) {
			if (fichaConsultada.getPregunta()==pregunta) {
				return fichaConsultada;
			}
		}
		return null;
	}
	
	public Caja consultaCaja(int numCaja) {
		for (Caja cajaConsultada: cajas) {
			if (cajaConsultada.getNumCaja()==numCaja) {
				return cajaConsultada;
			}
		}
		return null;
	}
	
	public Coleccion consultaColeccion(int id_coleccion) {
		for (Coleccion coleccionConsultada: colecciones) {
			if (coleccionConsultada.getId_coleccion()==id_coleccion) {
				return coleccionConsultada;
			}
		}
		return null;
	}
	
	public boolean modificarFicha (Ficha fichaOriginal) {
		for (Ficha fichaModificada : fichas) {
			if (fichaModificada.getPregunta()==fichaOriginal.getPregunta()) {
				fichaModificada.setRespuesta(fichaOriginal.getRespuesta());
				return true;
			}
		}
		return false;
	}
	
	public boolean modificarCaja(Caja cajaOriginal) {
		for (Caja cajaModificada : cajas) {
			if (cajaModificada.getNumCaja()==cajaOriginal.getNumCaja()) {
				cajaModificada.setFichas(cajaOriginal.getFichas());
				cajaModificada.setPeriocidad(cajaOriginal.getPeriocidad());
				return true;
			}
		}
		
		return false;
	}
	
	public boolean modificarColeccion(Coleccion coleccionOriginal) {
		for (Coleccion coleccionModificado : colecciones) {
			if (coleccionModificado.getId_coleccion()==coleccionOriginal.getId_coleccion()){
				coleccionModificado.setTema(coleccionOriginal.getTema());
				coleccionModificado.setFichas(coleccionOriginal.getFichas());
				return true;
			}
			
		}
		return false;
	}

	
	//GETTERS Y SETERS
	public ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(ArrayList<Ficha> fichas) {
		this.fichas = fichas;
	}

	public ArrayList<Caja> getCajas() {
		return cajas;
	}

	public void setCajas(ArrayList<Caja> cajas) {
		this.cajas = cajas;
	}

	public ArrayList<Coleccion> getColecciones() {
		return colecciones;
	}

	public void setColecciones(ArrayList<Coleccion> colecciones) {
		this.colecciones = colecciones;
	}
	
	
}
