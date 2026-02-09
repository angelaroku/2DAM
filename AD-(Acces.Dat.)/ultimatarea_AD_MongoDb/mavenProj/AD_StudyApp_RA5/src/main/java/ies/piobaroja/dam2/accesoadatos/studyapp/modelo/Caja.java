package ies.piobaroja.dam2.accesoadatos.studyapp.modelo;

import java.util.ArrayList;

public class Caja {
	private int numCaja;
	private int periocidad;
	private ArrayList<Ficha> fichas;
	
	//constructor vacio para usar en DAO
	public Caja() {
			
	}

	public Caja(int numCaja, int periocidad, ArrayList<Ficha> fichas) {
		this.numCaja = numCaja;
		this.periocidad = periocidad;
		this.fichas = fichas;
	}
	
	public int getNumCaja() {
		return numCaja;
	}

	public void setNumCaja(int numCaja) {
		this.numCaja = numCaja;
	}

	public int getPeriocidad() {
		return periocidad;
	}

	public void setPeriocidad(int periocidad) {
		this.periocidad = periocidad;
	}

	public ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(ArrayList<Ficha> fichas) {
		this.fichas = fichas;
	}	
	
}
