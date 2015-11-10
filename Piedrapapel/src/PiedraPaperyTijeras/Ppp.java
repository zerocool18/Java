package PiedraPaperyTijeras;

import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane.showMessageDialog(null, "Welcome to your nightmare", 
//				"Piedra, Papel, Tijera", 
//				JOptionPane.PLAIN_MESSAGE,
//				new ImageIcon("image/master.png"));
//		
		String input = (String)JOptionPane.showInputDialog(null, "PIEDRA = 0 \nPAPEL = 1 \nTIJERA  = 2",
				"Piedra, Papel, Tijera",
				JOptionPane.PLAIN_MESSAGE,
				new  ImageIcon("image/master.png"),
				null, 
				null);
		if (input.isEmpty())
			System.exit(0);
		
		int Player = Integer.parseInt(input);
		
		Random random = new Random();
		int Computer = random.nextInt(3);
		
//		System.out.print(Computer + "" + Player);
		
		final int PIEDRA = 0, PAPEL = 1, TIJERA  = 2;
		//if super sofisticado manera mas elegante de hacer if else if else
		//El switch no brega con double, solo int y string
		
		String mensaje = null, dibujo = null, titulo = null;
		
		switch (Computer) {
		case PIEDRA:
			titulo = "Soy Piedra...";
			if (Player == PIEDRA){
				mensaje = "empate";
				dibujo = "image/piedrapiedra.png";}
				
			else 
				if(Player == PAPEL){
					mensaje = "Player wins!";
					dibujo = "image/piedrapapel.png";}
				else
					if(Player == TIJERA){
						mensaje = "You loser idiot";
						dibujo = "image/piedratijera.png";}
			break;
		case PAPEL:
			titulo = "Soy Papel...";
			if (Player == PIEDRA){
				mensaje = "You loser idiot";
				dibujo = "image/piedrapapel.png";}
			else 
				if(Player == PAPEL){
					mensaje = "empate";
					dibujo = "image/papelpapel.png";}
				else
					if(Player == TIJERA){
						mensaje = "Player wins";
						dibujo = "image/papeltijera.png";}
			break;
		case TIJERA:
			titulo = "Soy Tijera...";
			if (Player == PIEDRA){
				mensaje = "Player wins";
				dibujo = "image/piedratijera.png";}
			else 
				if(Player == PAPEL){
					mensaje = "You loser idiot";
					dibujo = "image/papeltijera.png";}
				else
					if(Player == TIJERA){
						mensaje = "empate";
						dibujo = "image/tijeratijera.png";}
				break;
		default:
			
			break;
		}
		JOptionPane.showMessageDialog(null, mensaje, 
				titulo,
				JOptionPane.YES_NO_OPTION,
				new ImageIcon(dibujo));
	}

}
