import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class MoneyDistributionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		
		/////////// INPUT WITH METHOD ////////////
		int cents = getcents("Enter the number of cents: ");
		
		/////////////// PROCESS //////////////////
		int quarter = cents/QUARTER;
		int dime = ((cents % QUARTER) / DIME);
		int nickel = (((cents % QUARTER) % DIME) / NICKEL);
		int pennie = (((cents % QUARTER) % DIME) % NICKEL);
		
		String message = "The distribution of coins is: \n" + quarter + " Quarter(s)\n"  
					+ dime + " Dime(s)\n" +  nickel + " Nickel(s)\n" +  pennie + " Pennie(s)" ;
		
		////////////// OUTPUT ////////////////////
		
		System.out.println(message);

		
		
	}

	public static int getcents(String mensaje) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(mensaje);
		int CENTS = scanner.nextInt();
		return CENTS;
	}

}
