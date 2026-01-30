package $5_ejercicio_12_parkingcamiones;

import java.util.Random;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame();
		ventana.setSize(750, 900);
		ventana.setVisible(true);
		GarajeVista garajeVista=new GarajeVista();
		ventana.setContentPane(garajeVista);
		
		Garaje garaje=new Garaje(garajeVista);
		Random random=new Random();
		String matricula;
		while(true) {
			boolean cocheVsCamion=(random.nextInt(10)<7)?true:false;
		//	System.out.println(cocheVsCamion?"Creado hilo coche":"Creado hilo camion");
			if (cocheVsCamion==true) {
				matricula=
						"M-"+String.valueOf((new Random()).nextInt(1000));
				Thread coche=new Thread(new Coche(garaje,matricula));
				coche.start();
				
			}
			else {
				matricula=
						"C-"+String.valueOf((new Random()).nextInt(1000));
				Thread camion=new Thread(new Camion(garaje,matricula));
				camion.start();
				
			}
			try {
				Thread.sleep((new Random()).nextInt(5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
