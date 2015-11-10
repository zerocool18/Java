import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class Pay_Rate_work {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hours = 0;
		double payrate = 0;
		double grosspay = 0;
		Scanner Ho = new Scanner (System.in);
		Scanner Pay = new Scanner (System.in);
		System.out.println("Enter the number of hours the employee worked:");
		hours = Ho.nextDouble();
		System.out.println("Enter the hourly pay rate: ");
		payrate = Pay.nextDouble();
		grosspay = hours * payrate;
		System.out.println("The Employee's Grosspay is $ " + grosspay);
				
	}

}
