package proyecto_taller.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero {
	public String nombreFichero;
	public TipoFichero tipoFichero;
	
	public Fichero(String nombreFichero, TipoFichero tipoFichero) {
		this.nombreFichero = nombreFichero;
		this.tipoFichero = tipoFichero;
	}

	//metodos IMPORTAR , EXPORTAR
	public void exportarCSV(ArrayList<String[]> datos) {
		try (FileWriter writer = new FileWriter(nombreFichero)){
			for (String[] fila : datos) {
				String linea = String.join(",", fila);
				writer.write(linea + "\n");
			}
			
			System.out.println("Exportación del fichero " + nombreFichero  + "realizada con éxito");
		} catch (IOException e) {
			System.out.println("Error al exportar fichero " + nombreFichero + e.getMessage());
		}
	}
	
	public ArrayList<String[]>  importarCSV() {
		ArrayList<String[]> datos = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))){
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] fila = linea.split(",");
				datos.add(fila);
			}
			
			System.out.println("Importación del fichero " + nombreFichero  + " realizada con éxito");
		} catch (IOException e) {
			System.out.println("Error al importar fichero " + nombreFichero + e.getMessage());
		}
		return datos;
		
	}
	
	

	//GETTER Y SETTER
	public String getNombreFichero() {
		return nombreFichero;
	}

	public void setNombreFichero(String nombreFichero) {
		this.nombreFichero = nombreFichero;
	}

	public TipoFichero getTipoFichero() {
		return tipoFichero;
	}

	public void setTipoFichero(TipoFichero tipoFichero) {
		this.tipoFichero = tipoFichero;
	}

}
