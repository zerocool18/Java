import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class VolumenRubicscube {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Volumen del cuadro en x, y, z: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		System.out.println("Volumen del rubiscube en x, y, z: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int z1 = scanner.nextInt();
		
		int volumen = x * y * z;
		int volumen_grande = x1 * y1 * z1;
		int resultado = volumen * volumen_grande;
		
		System.out.println("Volumen Total del Rubiscube: " + resultado);
		
		
		
	}

}
