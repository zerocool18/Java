import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SoundTravelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constants
		final int AIRE_FPS = 1100;
		final int AGUA_FPS = 4900;
		final int ACERO_FPS = 16400;
		//Scanner and DecimalFormat
		Scanner kb = new Scanner (System.in);
		DecimalFormat format = new DecimalFormat("0.0##");
		
		//Input of letter, to upper case and extracting a chart
		System.out.print("Enter the medium (A=air, W=water, or S=steel): ");
		String input = kb.next().toUpperCase();
		char answer = input.charAt(0);
		
		//input of feet
		System.out.print("Enter the distance traveled in feet (>= 0): ");
		double feet = kb.nextDouble();
		//Condition of Feet
		if (feet < 0 ){
			System.err.println("The distance traveled in feet must be positive");
			System.exit(0);
		}
			
		
		double velocidad_aire,velocidad_agua,velocidad_acero;
		//Switch for Chars and their calculations 
		switch (answer) {
		case 'A':
			velocidad_aire = feet/ AIRE_FPS;
			System.out.println("\nIt takes sound " + format.format(velocidad_aire) +" seconds to travel that distance in steel.");
			break;
		case 'W':
			velocidad_agua = feet/ AGUA_FPS;
			System.out.println("\nIt takes sound " + format.format(velocidad_agua) +" seconds to travel that distance in steel.");
			break;
		case 'S':
			velocidad_acero = feet/ ACERO_FPS;
			System.out.println("\nIt takes sound " + format.format(velocidad_acero) +" seconds to travel that distance in steel.");
			break;
			//Condition if another char is entered
		default:
			System.err.println("\nNot a Valid Characther");
			System.exit(0);
			break;
		}
		
	}

}
