
package ies.piobaroja.dam2.accesoadatos.studyapp.modelo;

import java.util.ArrayList;

public class Coleccion {
	private int id_coleccion;
	private String tema;
	private ArrayList<Ficha> fichas;
	
	//constructor vacio para usar en DAO
	public Coleccion() {
		
	}
	public Coleccion(int id_coleccion, String tema, ArrayList<Ficha> fichas) {
		this.id_coleccion = id_coleccion;
		this.tema = tema;
		this.fichas = fichas;
	}

	public int getId_coleccion() {
		return id_coleccion;
	}

	public void setId_coleccion(int id_coleccion) {
		this.id_coleccion = id_coleccion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public ArrayList<Ficha> getFichas() {
		return fichas;
	}

	public void setFichas(ArrayList<Ficha> fichas) {
		this.fichas = fichas;
	}

}
