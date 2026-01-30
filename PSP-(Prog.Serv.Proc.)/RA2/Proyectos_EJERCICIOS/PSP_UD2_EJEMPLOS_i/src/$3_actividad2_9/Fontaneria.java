package $3_actividad2_9;

public class Fontaneria {
	
	private static Destornillador destornillador=new Destornillador();
	private static Alicate alicate=new Alicate();
	private static Taladro taladro=new Taladro();

	public static void main(String[] args) {
		Thread agente1=new Thread(new Actividad1(destornillador,taladro,"Agente1"));
		agente1.setName("Agente1");
		Thread agente2=new Thread(new Actividad1(destornillador,taladro,"Agente2"));
		agente2.setName("Agente2");
		Thread agente3=new Thread(new Actividad2(destornillador,alicate,"Agente3"));
		agente3.setName("Agente3");
		Thread agente4=new Thread(new Actividad3(destornillador,alicate,taladro,"Agente4"));
		agente4.setName("Agente4");
		//Incicio hilos
		agente1.start();
		agente2.start();
		agente3.start();
		agente4.start();
		
		
	}
}
