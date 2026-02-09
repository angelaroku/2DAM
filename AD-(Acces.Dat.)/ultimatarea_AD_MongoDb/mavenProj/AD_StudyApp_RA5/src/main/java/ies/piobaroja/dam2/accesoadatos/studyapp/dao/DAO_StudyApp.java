package ies.piobaroja.dam2.accesoadatos.studyapp.dao;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.Ficha;
import ies.piobaroja.dam2.accesoadatos.studyapp.modelo.StudyApp;

public class DAO_StudyApp {
	
	private static DAO_StudyApp instancia=new DAO_StudyApp() ;
	private String uri = "mongodb+srv://darroyo3_db_user:fRXXRNY8cZKrXhDj@cluster0.2pl0jg4.mongodb.net/?appName=Cluster0";
	private String dbBase="studyapp_mongodbs";
	private MongoClient mongoClient;
	private MongoDatabase database ;
	
	
	private DAO_StudyApp() {
		MongoClient mongoClient=mongoClient = MongoClients.create(uri);
		database = mongoClient.getDatabase(dbBase);
	}


	public static DAO_StudyApp getInstance() {
		return instancia;
	}
	
	//METODOS CRUD 
	public long contarFichas() {
		MongoCollection<Document> collection = database.getCollection(Ficha.class.getSimpleName());
		return collection.estimatedDocumentCount();
	}
	
	public void crearFicha(Ficha ficha) {
		MongoCollection<Document> collection = database.getCollection(ficha.getClass().getSimpleName());
		Gson gson = new Gson();
		//String pregunta = (String)contarFichas()+1;
		//ficha.setCodigo(pregunta);
	    String json = gson.toJson(ficha);
	    Document documento = Document.parse(json);
	    collection.insertOne(documento);
		
	}
	
	/*
	 
	public void altaMensajero(Mensajero m) {
		MongoCollection<Document> collection = database.getCollection(m.getClass().getSimpleName());
		Gson gson = new Gson();
		int codigo=(int)contarMensajeros()+1;
		m.setCodigo(codigo);
	    String json = gson.toJson(m);
	    Document documento = Document.parse(json);
	    collection.insertOne(documento);
	}
	
	private long contarMensajeros() {
		MongoCollection<Document> collection = database.getCollection(Mensajero.class.getSimpleName());
		return collection.estimatedDocumentCount();
	}
	
	public Mensajero consultaMensajero(int codigo) {
		
		MongoCollection<Document> collection = database.getCollection(Mensajero.class.getSimpleName());
		Document doc=new Document("codigo",codigo);
		Document resultado=collection.find(doc).first();
		Gson gson = new Gson();
		Mensajero n = gson.fromJson(resultado.toJson(), Mensajero.class);
		return n;
	}
	
	public void modificarMensajero(Mensajero m) {
		 // Obtener la colección
		MongoCollection<Document> collection = database.getCollection(Mensajero.class.getSimpleName());
		 // Filtro para encontrar el documento por el campo "codigo"
		Document filtro=new Document("codigo",m.getCodigo());
		  // Usar Gson para convertir el objeto a JSON
		Gson gson = new Gson();
		String json = gson.toJson(m);
		// Convertir el JSON a un Document
		Document documentToUpdate = Document.parse(json);
		 // Crear una actualización utilizando el operador $set para actualizar campos específicos
		collection.updateOne(filtro,  new Document("$set", documentToUpdate));
	}
	
	public void borrarMensajero(Mensajero m ) {
		 // Obtener la colección
		MongoCollection<Document> collection = database.getCollection(Mensajero.class.getSimpleName());
		 // Filtro para encontrar el documento por el campo "codigo"
		Document filtro=new Document("codigo",m.getCodigo());
		collection.deleteOne(filtro);
		
	}
	
	 * */
	
	
	
	 
}
