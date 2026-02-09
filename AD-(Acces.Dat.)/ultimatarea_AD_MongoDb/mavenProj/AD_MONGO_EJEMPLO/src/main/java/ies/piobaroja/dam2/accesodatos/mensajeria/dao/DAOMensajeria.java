package ies.piobaroja.dam2.accesodatos.mensajeria.dao;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Carta;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Envio;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Mensajero;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.Paquete;
import ies.piobaroja.dam2.accesodatos.mensajeria.modelo.TipoEstado;

public class DAOMensajeria {
	
	private static DAOMensajeria instancia=new DAOMensajeria();
	//private String uri = "mongodb://localhost:27017";
	private String uri = "mongodb+srv://darroyo3_db_user:fRXXRNY8cZKrXhDj@cluster0.2pl0jg4.mongodb.net/?appName=Cluster0";
	private String dbBase="mensajeria2";
	private MongoClient mongoClient;
	private MongoDatabase database ;
	
	public static DAOMensajeria getInstance() {
		return instancia;
	}
		
	private DAOMensajeria() {
		MongoClient mongoClient=mongoClient = MongoClients.create(uri);
		database = mongoClient.getDatabase(dbBase);
	}
	
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
	
	public void altaEnvio(Envio envio) {
		MongoCollection<Document> collection = database.getCollection(envio.getClass().getSimpleName());
		Gson gson = new Gson();
		int codigo=(int)contarEnvios()+1;
		envio.setCodigo(codigo);
	    String json = gson.toJson(envio);
	    Document documento = Document.parse(json);
	    collection.insertOne(documento);
	}
	
	private long contarEnvios() {
		MongoCollection<Document> collectionCarta = database.getCollection(
				Carta.class.getSimpleName());
		MongoCollection<Document> collectionPaquete = database.getCollection(
				Paquete.class.getSimpleName());
		return collectionCarta.estimatedDocumentCount()+collectionPaquete.estimatedDocumentCount();
	}
	
	public void asignarEnvio(Mensajero m, Envio e) {
		MongoCollection<Document> colMensajero = database.getCollection(Mensajero.class.getSimpleName());
		Document filtroMensajero=new Document("codigo",m.getCodigo());
		Document docMensajero=colMensajero.find(filtroMensajero).first();

		
		MongoCollection<Document> colEnvios = database.getCollection(Carta.class.getSimpleName());
		Document filtroEnvio=new Document("codigo",e.getCodigo());
		Document docEnvios=colEnvios.find(filtroEnvio).first();
		if (docEnvios==null) {
			colEnvios = database.getCollection(Paquete.class.getSimpleName());
			filtroEnvio=new Document("codigo",e.getCodigo());
			docEnvios=colEnvios.find(filtroEnvio).first();
			
		}
		
		colEnvios.updateOne(filtroEnvio, new Document("$set",new Document("TipoEstadoEnvio", TipoEstado.ASIGNADO)));
	//	docMensajero.remove("envios");
		colEnvios.updateOne(filtroEnvio, new Document("$set",new Document("mensajero", docMensajero)));
		docEnvios.put("TipoEstadoEnvio", TipoEstado.ASIGNADO);
		colMensajero.updateOne(docMensajero,  new Document("$push", new Document("envios", docEnvios)));
		

	}
	
	public Envio consultarEnvio(int codigo) {
		
		Gson gson = new Gson();
		MongoCollection<Document> colEnvios = database.getCollection(Carta.class.getSimpleName());
		Document filtroEnvio=new Document("codigo",codigo);
		Document docEnvios=colEnvios.find(filtroEnvio).first();
		if (docEnvios==null) {
			colEnvios = database.getCollection(Paquete.class.getSimpleName());
			filtroEnvio=new Document("codigo",codigo);
			docEnvios=colEnvios.find(filtroEnvio).first();
			return gson.fromJson(docEnvios.toJson(), Paquete.class);
			
		}
		return gson.fromJson(docEnvios.toJson(), Carta.class);
	}
	
	public List<Carta> consultaCartas(TipoEstado tipo) {

		MongoCollection<Document> colEnvios = database.getCollection(Carta.class.getSimpleName());
		Document filtroEnvio=new Document("TipoEstadoEnvio",tipo);
		List<Carta> cartas=new ArrayList<>();
		Gson gson = new Gson();
		for (Document doc : colEnvios.find(filtroEnvio)) {			
			Carta c = gson.fromJson(doc.toJson(), Carta.class);
			cartas.add(c);
        }
		return cartas;
	}
	
	public List<Paquete> consultaPaquetes(TipoEstado tipo) {
		MongoCollection<Document> colEnvios = database.getCollection(Paquete.class.getSimpleName());
		Document filtroEnvio=new Document("TipoEstadoEnvio",tipo);
		List<Paquete> paquetes=new ArrayList<>();
		Gson gson = new Gson();
		for (Document doc : colEnvios.find(filtroEnvio)) {			
			Paquete p = gson.fromJson(doc.toJson(), Paquete.class);
			paquetes.add(p);
        }
		return paquetes;
		

	}
		
}
