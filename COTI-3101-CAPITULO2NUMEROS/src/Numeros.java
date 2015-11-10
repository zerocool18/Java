import java.util.Scanner;
import java.util.zip.InflaterInputStream;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class Numeros {

	/**
	 * @param args
	 */
	
		
		static double total = 0.0;
		static double subtotal = 0.0;
		static double tax1 = 0.00;
		static double tax2 = 0.00;
		static double inputcash = 0.00;
		static double change = 0.0;
		static double z;
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//counter of products
			
			int x = 0;
			int y = 0;
			
			double[] numeros =new double[20];
			
			System.out.println("Cuantos Articulos: ");
			Scanner ART = new Scanner(System.in);
			x = ART.nextInt();
			
			
			//Input
			while (x > 0) {
				System.out.println("Entre su valor del articulo: ");
				Scanner Sub = new Scanner(System.in);
				subtotal = Sub.nextDouble(); 
				x --;
				numeros[y++]=subtotal;
			}
			double sum = 0;
			for (double num : numeros) {
				sum = sum + num;
			
			}
			System.out.println(sum);
	}
}
