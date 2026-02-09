package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Averia;
import proyecto_taller.modelo.EstadoVehiculo;
import proyecto_taller.modelo.TipoVehiculo;
import proyecto_taller.vista.AltaAveriaVista;

public class AltaAveriaControlador implements ActionListener{
	private AltaAveriaVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	public AltaAveriaControlador(AltaAveriaVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();

	}

	//Averia(int codigoAveria, String descripcionAveria, double costeAveria)

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador alta averia");

		//recogida de valores de la vista y salida por consola
		String  codigoAveriaVista = vistaControlador.getCodigoAltaAveriaVista();
		String descripcionAveria = vistaControlador.getDescricionAltaAveriaVista();
		String  costeAveriaVista = vistaControlador.getCosteAltaAveriaVista();
		
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
		
		
		
		//creacion del alta y salida de exito y error 
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
		
		
		try {
			daoControlador.altaAveria(codigoAveria, descripcionAveria, costeAveria);
			vistaControlador.OK();
			System.out.println("Avería creada correctamente");
			
		} catch (Exception e1) {
			e1.printStackTrace();
			vistaControlador.error("Error inesperado al crear la averia ");
		}
		
	}
	
}
 