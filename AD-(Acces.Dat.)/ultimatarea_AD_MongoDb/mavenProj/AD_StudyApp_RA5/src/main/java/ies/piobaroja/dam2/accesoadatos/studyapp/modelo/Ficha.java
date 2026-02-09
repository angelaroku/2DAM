package ies.piobaroja.dam2.accesoadatos.studyapp.modelo;

public class Ficha {

	private String pregunta;
	private String respuesta;
	
	//constructor vacio para usar en DAO
	public Ficha() {
		
	}
	public Ficha(String pregunta, String respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
}
