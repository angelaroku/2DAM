package $2_interbloqueo;

public class Ordenador {
	private static DiscoDuro discoDuro=new DiscoDuro();
	private static RAM ram=new RAM();
	
	public static void main(String[] args) {
		Thread proceso1=new Thread(new Proceso1(discoDuro,ram));
		Thread proceso2=new Thread(new Proceso2(ram,discoDuro));
		
		proceso1.start();
		proceso2.start();
		try {
			proceso1.join();
			proceso2.join();
			System.out.println("Proceso principal termiando");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
