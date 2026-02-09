package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Averia;
import proyecto_taller.vista.ModificacionAveriaVista;

public class ModificacionAveriaControlador implements ActionListener{
	private ModificacionAveriaVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	public ModificacionAveriaControlador(ModificacionAveriaVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador modificación averia");

		//recogida de valores de la vista y salida por consola
		String  codigoAveriaVista = vistaControlador.getCodigoModificacionAveriaVista();
		String descripcionAveria = vistaControlador.getDescricionModificacionAveriaVista();
		String  costeAveriaVista = vistaControlador.getCosteModificacionAveriaVista();
		
		System.out.println("Código: " + codigoAveriaVista);
		System.out.println("Descripción: " + descripcionAveria);
		System.out.println("Coste: " + costeAveriaVista);
		
		//validaciones
		if(codigoAveriaVista == null || codigoAveriaVista.isBlank()){
			vistaControlador.error("El código de la avería es obligatorio");
			return;
		}
		if (descripcionAveria == null || descripcionAveria.isBlank()) {
			vistaControlador.error("Escriba una descripción para su avería");
			return;
		}
		if (costeAveriaVista == null || costeAveriaVista.isBlank()) {
			vistaControlador.error("Escriba una coste para su avería");
			return;
		}
		
		
		int codigoAveria =0;
		double costeAveria =0;
		try {
			codigoAveria = Integer.parseInt(codigoAveriaVista);
		}catch (NumberFormatException ex) {
			vistaControlador.error("El codigo debe ser un número entero");
			return;
		}
		
		try {
			costeAveria= Double.parseDouble(costeAveriaVista);
		}catch (NumberFormatException ex) {
			vistaControlador.error("El coste debe ser un número entero o decima con puntol");
			return;
		}
		
		if (codigoAveria <= 0 ) {
			vistaControlador.error("Código negativo no válido");
			return;
		}
		if (costeAveria < 0) {
			vistaControlador.error("Coste negativo no válido");
			return;
		}
		
		//creacion del alta y salida de exito y error 
		try {
			Averia averiaModificada = new Averia(codigoAveria, descripcionAveria, costeAveria);
			boolean modificacionAveria = daoControlador.modificarAveria(averiaModificada);
			if (modificacionAveria==true) {
				vistaControlador.OK();
			} else {
				vistaControlador.error("No existen averías con ese código");
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			vistaControlador.error("Error inesperado al modificar la averia ");
		}
		

	}
}
