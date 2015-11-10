package myfirstprogram;

import java.util.Scanner;

import javax.swing.JOptionPane;
//identifier = titulo, nombrecito, el programador lo escoge
//reserved words = public class
public class Coti3101 {
	//main = method o metodo (*IMPORTANT* WITHOUT MAIN NOTHING RUNS)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////////////////////////////////////////////////////////////////////////////		
		//Se declaro la Variable
		String message = null;// Variable
		//se puede crear una variable sin valor inicial
		message = "UPR"; //<error de logica, sobrescrito
////////////////////////////////////////////////////////////////////////////		
		Scanner teclado = new Scanner(System.in);
		
		message = teclado.nextLine();
				
		//System.out.println(message);
		//System.out.println("Hello World"); //statement, enuciado
			
		}
}


