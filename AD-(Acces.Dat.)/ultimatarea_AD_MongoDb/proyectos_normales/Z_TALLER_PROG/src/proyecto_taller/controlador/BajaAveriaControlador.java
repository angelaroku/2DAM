package proyecto_taller.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import proyecto_taller.dao.DAO_TallerMecanico;
import proyecto_taller.modelo.Averia;
import proyecto_taller.vista.BajaAveriaVista;

public class BajaAveriaControlador implements ActionListener{
	private BajaAveriaVista vistaControlador;
	private DAO_TallerMecanico daoControlador;
	
	public BajaAveriaControlador(BajaAveriaVista vistaControlador) {
		this.vistaControlador=vistaControlador;
		this.daoControlador = DAO_TallerMecanico.getInstancia();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador baja averia");

		//recogida de valores de la vista y salida por consola
		String  codigoAveriaVista = vistaControlador.getCodigoBajaAveriaVista();
		int codigoAveria;

		System.out.println("Código: " + codigoAveriaVista);


		//validaciones
		if(codigoAveriaVista == null || codigoAveriaVista.isBlank()){
			vistaControlador.error("El código de la avería es obligatorio");
			return;
		}
		
		try {
			codigoAveria = Integer.parseInt(codigoAveriaVista);
		}catch (NumberFormatException ex) {
			vistaControlador.error("El codigo debe ser un número entero");
			return;
		}

		if (codigoAveria <= 0 ) {
			vistaControlador.error("Código negativo no válido");
			return;
		}
		
		//creacion de la baja  y salida de exito y error 
		try {
			boolean bajaAveria = daoControlador.bajaAverias(codigoAveria);
			
			if  (bajaAveria == true ) {
				vistaControlador.OK();
			}else {
				vistaControlador.error("La avería no existe, pruebe de nuevo");
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			vistaControlador.error("Error inesperado al dar de baja la averia ");
		}
		
	}

}
