import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * Este Programa se basa en calcular el tax en un articulo. Ademas da el total completo del mismo.
 */

/**
 * @author zerocool
 *09/02/2015
 */
public class taxesPR {

	
	//Variables
	static double total = 0.0;
	static double subtotal = 0.0;
	static double tax1 = 0.0;
	static double tax2 = 0.0;
	static double inputcash = 0.0;
	static double change = 0.0;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable of counter and array
		int x = 0;
		int y = 0;
		//array
		double[] numeros = new double[10];
		
		//Input
		System.out.println("Cuantos Articulos: ");
		Scanner ART = new Scanner(System.in);
		x  = ART.nextInt();

		//Counter
		while (x > 0) {
			System.out.println("Entre su valor del articulo: ");
			Scanner Sub = new Scanner(System.in);
			subtotal = Sub.nextDouble(); 
			x --;
			numeros[y++]=subtotal;
		}
		
		//Error Parameter
	if (subtotal <= 0) {
		JOptionPane.showMessageDialog(null,"Error No Amount");
	}
		//Sum Array
		double suma = 0;
			for (double num : numeros) {
				suma = suma + num;
				}
			//TO SEE ARRAY LIVE
//			for(int i=0; i<numeros.length; i++){
//				System.out.println(numeros[i]);
//		}

		//Tax and Total Process
	tax1 = suma * 0.01;
	tax2 = suma * 0.105;
	total = suma + tax1 + tax2;
	
	
	//Output
		System.out.println("Subtotal:" + suma);
		System.out.println("Tax1:" + tax1);
		System.out.println("Tax2:" + tax2);
		System.out.println("Total:" + total);
		
		//Input Change
	System.out.println("Cantidad Pagada: ");
	Scanner cash = new Scanner(System.in);
	inputcash = cash.nextDouble();
	
		//Change Process
	change = inputcash - total;
	
		//Output Change
	System.out.println("Cambio: " + change);
	
		//Error Parameter
		if (change < 0) {
			JOptionPane.showMessageDialog(null,"short of money");
		}
		else{
			JOptionPane.showMessageDialog(null,"Change: " + change);
		}
		
	}

	
}
