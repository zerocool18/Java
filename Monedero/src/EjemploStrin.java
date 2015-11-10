import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class EjemploStrin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Escriba el Nombre");
		
		String nnn = scanner.next();
		System.out.println("Escriba el Apellido");
		
		String aaa = scanner.next();
		
		String Format1 = nnn + " " + aaa;
		String Format2 = aaa +
						", " +
						nnn;
		String Format3 = aaa +
						", " +
						nnn;
		
		
		
		String Format4 = aaa +
				", " +
				 nnn + 
				".";
		
		 System.out.println(Format1.toUpperCase());
		 System.out.println(Format2.toUpperCase());
		 System.out.println(Format3.toLowerCase());
		 System.out.println(Format4);
		
	}

}
