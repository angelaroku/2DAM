package $7_ejercicioLibro2_8_biblioteca;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class Biblioteca extends JPanel{
	
	private JLabel[] libros;
	
	public Biblioteca() {
		setForeground(UIManager.getColor("Button.light"));
		setLayout(null);
		libros=new JLabel[9];

		Color marron = new Color(139, 69, 19); // Marrón tipo "saddle brown"
		Color naranajaClaro=new Color(255, 204, 153);
		Color verde=new Color(144, 238, 144);
		Color lila=new Color(200, 162, 200);
		Color rosa= new Color(255, 182, 193);
		Color amarillo=new Color(255, 255, 153);
		Color gris= new Color(211, 211, 211);
		Color beige=new Color(245, 245, 220);
		Color blanco=new Color(255, 255, 255);
				
		
		JLabel lblLibro1 = new JLabel("1");
		libros[0]=lblLibro1;
		lblLibro1.setOpaque(true);
		lblLibro1.setBackground(UIManager.getColor("Button.select"));
		lblLibro1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro1.setBounds(65, 64, 42, 76);
        // Asignar un borde marrón de 3 píxeles
		lblLibro1.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro1);
		
		JLabel lblLibro2 = new JLabel("2");
		libros[1]=lblLibro2;
		lblLibro2.setOpaque(true);
		lblLibro2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro2.setBackground(naranajaClaro);
		lblLibro2.setBounds(119, 64, 42, 76);
		lblLibro2.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro2);
		
		JLabel lblLibro3 = new JLabel("3");
		libros[2]=lblLibro3;
		lblLibro3.setOpaque(true);
		lblLibro3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro3.setBackground(verde);
		lblLibro3.setBounds(173, 64, 42, 76);
		lblLibro3.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro3);
		
		JLabel lblLibro4 = new JLabel("4");
		libros[3]=lblLibro4;
		lblLibro4.setOpaque(true);
		lblLibro4.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro4.setBackground(lila);
		lblLibro4.setBounds(227, 64, 42, 76);
		lblLibro4.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro4);
		
		JLabel lblLibro5 = new JLabel("5");
		libros[4]=lblLibro5;
		lblLibro5.setOpaque(true);
		lblLibro5.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro5.setBackground(rosa);
		lblLibro5.setBounds(281, 64, 42, 76);
		lblLibro5.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro5);
		
		JLabel lblLibro6 = new JLabel("6");
		libros[5]=lblLibro6;
		lblLibro6.setOpaque(true);
		lblLibro6.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro6.setBackground(amarillo);
		lblLibro6.setBounds(335, 64, 42, 76);
		lblLibro6.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro6);
		
		JLabel lblLibro7 = new JLabel("7");
		libros[6]=lblLibro7;
		lblLibro7.setOpaque(true);
		lblLibro7.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro7.setBackground(gris);
		lblLibro7.setBounds(389, 64, 42, 76);
		lblLibro7.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro7);
		
		JLabel lblLibro8 = new JLabel("8");
		libros[7]=lblLibro8;
		lblLibro8.setOpaque(true);
		lblLibro8.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro8.setBackground(beige);
		lblLibro8.setBounds(443, 64, 42, 76);
		lblLibro8.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro8);
		
		JLabel lblLibro9 = new JLabel("9");
		libros[8]=lblLibro9;
		lblLibro9.setOpaque(true);
		lblLibro9.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibro9.setBackground(blanco);
		lblLibro9.setBounds(497, 64, 42, 76);
		lblLibro9.setBorder(BorderFactory.createLineBorder(marron, 3));
		add(lblLibro9);
		
		JLabel lblLibros = new JLabel("Libros");
		lblLibros.setFont(new Font("Dialog", Font.BOLD, 20));
		lblLibros.setBounds(239, 24, 169, 28);
		add(lblLibros);
		
		JLabel lblEstudiante1 = new JLabel("Estudiante 1");
		lblEstudiante1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEstudiante1.setBounds(206, lblLibro1.getY()+lblLibro1.getHeight()+20, 140, 17);
		add(lblEstudiante1);
		
		JLabel lblEstudiante2 = new JLabel("Estudiante 2");
		lblEstudiante2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEstudiante2.setBounds(206, lblLibro1.getY()+2*(lblLibro1.getHeight()+20), 140, 17);
		add(lblEstudiante2);
		
		JLabel lblEstudiante3 = new JLabel("Estudiante 3");
		lblEstudiante3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEstudiante3.setBounds(206, lblLibro1.getY()+3*(lblLibro1.getHeight()+20), 140, 17);
		add(lblEstudiante3);
		
		JLabel lblEstudiante4 = new JLabel("Estudiante 4");
		lblEstudiante4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEstudiante4.setBounds(206, lblLibro1.getY()+4*(lblLibro1.getHeight()+20), 140, 17);
		add(lblEstudiante4);
	}
	
	public synchronized void getLibros(int estudiante, int index1, int index2) {
		libros[index1].setLocation(libros[index1].getX(),
				libros[index1].getY()+
				(libros[index1].getHeight()+20)*estudiante+20);
		libros[index2].setLocation(libros[index2].getX(),
				libros[index2].getY()+
				(libros[index2].getHeight()+20)*estudiante+20);
		repaint();
	}
	
	public synchronized void devolverLibros(int estudiante, int index1, int index2) {
		libros[index1].setLocation(libros[index1].getX(),
				libros[index1].getY()-
				(libros[index1].getHeight()+20)*estudiante-20);
		libros[index2].setLocation(libros[index2].getX(),
				libros[index2].getY()-
				(libros[index2].getHeight()+20)*estudiante-20);
		repaint();
	}
}
