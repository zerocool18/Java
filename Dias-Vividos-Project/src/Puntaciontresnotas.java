/**
 * 
 */
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author zerocool
 *
 */
public class Puntaciontresnotas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		int n1, n2, n3, suma;
		double promedio; 
		
		System.out.println("Escriba nota 1:");
		n1 = kb.nextInt();
		
		if (n1 < 0 ) {
			Toolkit.getDefaultToolkit().beep();
			System.err.println("Error: numero negativo");
			System.exit(0);
			
		}
		
		System.out.println("Escriba nota 2:");
		n2 = kb.nextInt();
		
		if (n2 < 0 ) {
			System.out.println("Error: numero negativo");
			System.exit(0);
			
		}
		
		System.out.println("Escriba nota 3:");
		n3 = kb.nextInt();
		
		if (n3 < 0 ) {
			System.out.println("Error: numero negativo");
			System.exit(0);
			
		}
		
		suma = n1+n2+n3;
		
		promedio = (suma / 300.)* 100;
		
		DecimalFormat format = new DecimalFormat("0.0");
		
		System.out.println("El Promedio es "+ format.format(promedio)+ "%");
		
	}

}
