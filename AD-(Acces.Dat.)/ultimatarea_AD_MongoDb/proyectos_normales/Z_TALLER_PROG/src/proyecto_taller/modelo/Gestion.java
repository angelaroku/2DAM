package proyecto_taller.modelo;

public class Gestion {
	private TipoGestion tipoGestion;
	private TallerMecanico tallerModelo;

	public Gestion(TipoGestion tipoGestion, TallerMecanico tallerModelo) {
		this.tipoGestion = tipoGestion;
		this.tallerModelo = tallerModelo;
	}

	//Metodos
	//recepcionVehiculo(v:Vehiculo)| terminacionOperacion(codigoM:int) | entregaVehiculoReparado()
	public void recepcionVehiculo(Vehiculo vehiculoNuevo) {
		for (Mecanico mecanicoDisponible: tallerModelo.getMecanicosTaller()) {
			if (mecanicoDisponible.isEstadoLibreMecanico()==false) {
				System.out.println("El mecanico no está libre");
			} else {
				if (mecanicoDisponible.getEspecialidadMecanico()== EspecialidadMecanico.ESPECIALIDADMECANICO_COCHE &&
						vehiculoNuevo.getTipoVehiculo()==TipoVehiculo.COCHE) {
					
					mecanicoDisponible.asignarVehiculo(vehiculoNuevo);
					mecanicoDisponible.cambiarEstado();
					vehiculoNuevo.setEstadoVehiculo(EstadoVehiculo.EN_REPARACION);
					
				} else if (mecanicoDisponible.getEspecialidadMecanico()== EspecialidadMecanico.ESPECIALIDADMECANICO_MOTO &&
						vehiculoNuevo.getTipoVehiculo()==TipoVehiculo.MOTO){
					
					mecanicoDisponible.asignarVehiculo(vehiculoNuevo);
					mecanicoDisponible.cambiarEstado();
					vehiculoNuevo.setEstadoVehiculo(EstadoVehiculo.EN_REPARACION);
					
				} else {
					vehiculoNuevo.setEstadoVehiculo(EstadoVehiculo.EN_ESPERA);
				}
				
			}
		}
		
		/**
		 Se dará de alta un vehículo (indicando si es coche o moto), pidiendo
		sus datos por teclado. Se buscará un mecánico libre con la especialidad correspondiente
		(coche o moto). Si lo hay, se asignará dicho vehículo al mecánico y el estado del vehículo se
		pondrá “En reparación”; si no lo hay, se marcará su estado como “En espera”
		 */
	}
	public void terminacionOperacion(int codigoMecanicoAsignado, Vehiculo vehiculoEnReparacion) {
		
		double total_reparacion = vehiculoEnReparacion.costeReparacion();
		vehiculoEnReparacion.setEstadoVehiculo(EstadoVehiculo.REPARADO);
		
		for (Mecanico mecanicoAsignado : tallerModelo.getMecanicosTaller()) {
			if (mecanicoAsignado.getCodigoMecanico() == codigoMecanicoAsignado){
				
				for (Vehiculo nuevoVehiculoAsignado : tallerModelo.getVehiculosTaller()) {
					if (nuevoVehiculoAsignado.getTipoVehiculo()==TipoVehiculo.COCHE&&
							mecanicoAsignado.getEspecialidadMecanico() == EspecialidadMecanico.ESPECIALIDADMECANICO_COCHE && 
							nuevoVehiculoAsignado.getEstadoVehiculo()== EstadoVehiculo.EN_ESPERA) {
						mecanicoAsignado.asignarVehiculo(nuevoVehiculoAsignado);
					} else if (nuevoVehiculoAsignado.getTipoVehiculo()==TipoVehiculo.MOTO&&
							mecanicoAsignado.getEspecialidadMecanico() == EspecialidadMecanico.ESPECIALIDADMECANICO_MOTO && 
							nuevoVehiculoAsignado.getEstadoVehiculo()== EstadoVehiculo.EN_ESPERA) {
						mecanicoAsignado.asignarVehiculo(nuevoVehiculoAsignado);
						
					} else {
						//en caso contrario, el mecánico se marcará como libre 
						//y el vehículoReparación asignado se pondrá a nul
						mecanicoAsignado.cambiarEstado();
						nuevoVehiculoAsignado = null;
					}
				}
			}
		}
		
		
		/**
		  Se introducirá el código del mecánico y en el vehículo
		correspondiente se calculará el coste total de la reparación. El estado será ahora “Reparado”.
		Si hay vehículos en espera de la misma especialidad del mecánico, se asignará un nuevo
		vehículo al mecánico que acaba de terminar la reparación; en caso contrario, el mecánico se
		marcará como libre y el vehículoReparación asignado se pondrá a null.
		 * */
	}
	
	public void entregaVehiculoReparado() {
	/**
		 Se recorrerá toda la lista de vehículos imprimiendo y
		borrando los reparados
	 */
		for (Vehiculo vehiculoReparado : tallerModelo.getVehiculosTaller()) {
			System.out.println("El vehiculo con: " +
					"Matricula vehiculo: "+vehiculoReparado.getMatricula()+ "\n"+
					"Tipo vehiculo: "+ vehiculoReparado.getTipoVehiculo()+ "\n"+
					" está reparado y se ha eliminado.");
			tallerModelo.altaVehiculos(vehiculoReparado);	
		}
	}
	
	
	//GETTER Y SETTER
	public TipoGestion getTipoGestion() {
		return tipoGestion;
	}

	public void setTipoGestion(TipoGestion tipoGestion) {
		this.tipoGestion = tipoGestion;
	}

	public TallerMecanico getTallerModelo() {
		return tallerModelo;
	}
	
	public void setTallerModelo(TallerMecanico tallerModelo) {
		this.tallerModelo = tallerModelo;
	}

}
