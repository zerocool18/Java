import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class RegistrationFeeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        final double COST_PER_CREDIT = 75.00;
	        final double DISCOUNT_RATE = 0.60;

	        String studentName;
	        int numberOfCredits;
	        /////////////////////////////
	        char answer;           ////// Variable de letras
	        
	        /////////////////////////////
	        double registrationFee, discount;
	        Scanner keyboard = new Scanner(System.in);

	        System.out.print("Enter the name: ");
	        studentName = keyboard.nextLine();
	        System.out.print("Enter the number of credits: ");
	        numberOfCredits = keyboard.nextInt();
	        System.out.print("Are you an athlete or honor " +
	            "student? (Y/N): ");
	        answer = keyboard.next().charAt(0); // To read a char

	        registrationFee = numberOfCredits * COST_PER_CREDIT;

	        if (answer == 'Y' || answer == 'y') {
	            discount = DISCOUNT_RATE * registrationFee;
	            registrationFee -= discount;
	        }

	        System.out.print("For " + studentName + ", ");
	        System.out.println("the registration fee is $" +
	            registrationFee);
	}

}
