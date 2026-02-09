package ies.piobaroja.dam2.accesodatos.mensajeria.modelo;

import java.util.ArrayList;
import java.util.List;


public class Mensajero {
	
	private int codigo;
	private String nombre;
	private double sueldo;
	private boolean libre;
	private int numMax;

	List<Envio> envios;
	
	public Mensajero() {
		envios=new ArrayList<Envio>();
	}

	public Mensajero(String nombre, double sueldo) {
		this();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.libre=true;
		this.numMax=5;
	
	}
	
	public Mensajero(int codigo,String nombre, double sueldo) {
		this();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.codigo=codigo;
		this.libre=true;
		this.numMax=5;
	}

	public void add(Envio e) {
		envios.add(e);
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int getCodigo() {
		return codigo;
	}
	
	

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public int getNumMax() {
		return numMax;
	}

	public void setNumMax(int numMax) {
		this.numMax = numMax;
	}

	@Override
	public String toString() {
		return "Mensajero [codigo=" + codigo + ", nombre=" + nombre + ", sueldo=" + sueldo + ", libre=" + libre
				+ ", numMax=" + numMax + "]";
	}


	
	
	

}
