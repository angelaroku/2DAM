package $6_ejercicioLibro1_colecta;

public class Principal {

	public static void main(String[] args) {
		Colecta colecta=new Colecta();
		Recaudador recaudador1=new Recaudador(colecta,"R-1");
		Recaudador recaudador2=new Recaudador(colecta,"R-2");
		Recaudador recaudador3=new Recaudador(colecta, "R-3");
		Recaudador recaudador4=new Recaudador(colecta,"R-4");
		
		Thread h1=new Thread(recaudador1);
		Thread h2=new Thread(recaudador2);
		Thread h3=new Thread(recaudador3);
		Thread h4=new Thread(recaudador4);
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		
	}
}
