/**
 * 
 */
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * @author zerocool
 *
 */
public class DiasVividos {

	/**
	 * @param args
	 * Estilo de programacion = arte
	 */
	public static void main(String[] args) {
		
		final int DAYS = 365;//Constant are Uppercase
		
		// TODO Auto-generated method stub
		//Scanner es una class quee ya esta en java
		//Teclado es un identifier creado por el programa 
		//System.in es el teclado fisico
		
		Scanner keyboard = new Scanner (System.in);
		
		int year; //Variable Entera
		
		System.out.println("Cuantos anos tienes?");
		
		year = keyboard.nextInt()
				;
//		int days;
//			
//		days = DAYS * year + year/4;
		
		int days;
		
		days = DAYS * year + year/4;
		// + = concatenar, pegar letras y Strings
		System.out.println("Dias vividos son " + days);
		
	}//main

}//class
