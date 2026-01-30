package $3_ejercicio_11_parking;

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
		while(true) {
			String matricula=
					String.valueOf((new Random()).nextInt(1000));
			Thread coche=new Thread(new Coche(garaje,matricula));
			coche.start();
			try {
				Thread.sleep((new Random()).nextInt(5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
