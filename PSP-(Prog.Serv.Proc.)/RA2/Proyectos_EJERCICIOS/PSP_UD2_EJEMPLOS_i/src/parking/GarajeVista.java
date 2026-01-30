package parking;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

public class GarajeVista extends JPanel{
	
	private JLabel[] plazas=new JLabel[6];
	
	public GarajeVista() {
		setLayout(null);
		
		Color amarillo=new Color(255, 255, 153);
		Color marron = new Color(139, 69, 19);
		
		JLabel lblGaraje = new JLabel("Garaje");
		lblGaraje.setFont(new Font("Liberation Serif", Font.BOLD, 25));
		lblGaraje.setBounds(213, 12, 132, 32);
		add(lblGaraje);
		
		JLabel lblPlaza1 = new JLabel("Plaza 1");
		lblPlaza1.setBounds(90, 73, 97, 43);
		lblPlaza1.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[0]=lblPlaza1;
		add(lblPlaza1);
		
		JLabel lblPlaza2 = new JLabel("Plaza 2");
		lblPlaza2.setBounds(90, 133, 97, 43);
		lblPlaza2.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[1]=lblPlaza2;
		add(lblPlaza2);
		
		JLabel lblPlaza3 = new JLabel("Plaza 3");
		lblPlaza3.setBounds(90, 199, 97, 43);
		lblPlaza3.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[2]=lblPlaza3;
		add(lblPlaza3);
		
		JLabel lblPlaza4 = new JLabel("Plaza 4");
		lblPlaza4.setBounds(264, 73, 97, 43);
		lblPlaza4.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[3]=lblPlaza4;
		add(lblPlaza4);
		
		JLabel lblPlaza5 = new JLabel("Plaza 5");
		lblPlaza5.setBounds(264, 133, 97, 43);
		lblPlaza5.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[4]=lblPlaza5;
		add(lblPlaza5);
		
		JLabel lblPlaza6 = new JLabel("Plaza 6");
		lblPlaza6.setBounds(264, 199, 97, 43);
		lblPlaza6.setBorder(BorderFactory.createLineBorder(marron, 3));
		plazas[5]=lblPlaza6;
		add(lblPlaza6);
				
	}
	
	public void aparcar(String matricula, int plaza) {
		plazas[plaza].setText(matricula);
		repaint();
	}
	
	public void salir( int plaza) {
		plazas[plaza].setText("LIBRE");
		repaint();
	}

}
