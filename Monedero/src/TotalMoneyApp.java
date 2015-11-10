import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class TotalMoneyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int QUARTERS = 25;
		final int DIMES = 10;
		final int NICKELS = 5;
		final int DOLLAR = 100;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the numbers of quarters: ");
		int quarters = scanner.nextInt();
		System.out.print("Enter the numbers of dimes: ");
		int dimes = scanner.nextInt();
		System.out.print("Enter the numbers of nickels: ");
		int nickels = scanner.nextInt();
		System.out.print("Enter the numbers of pennies: ");
		int pennies = scanner.nextInt();
		
		//Accumulator
		int totalchavitos = quarters * QUARTERS;
		totalchavitos = totalchavitos + dimes * DIMES;
		totalchavitos = totalchavitos + nickels * NICKELS;
		//Acumulador +=
		totalchavitos += pennies;
		
		int dolares = totalchavitos/DOLLAR;
		
		//MOD modulus Residuo
		totalchavitos = totalchavitos % DOLLAR;
		
			String message = "You Have "
					+ dolares
					+ " dollar(s) and "
					+ totalchavitos
					+ " cent(s).";
			System.out.print(message.toLowerCase());
			}

}
