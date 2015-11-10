import java.awt.Toolkit;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Back Track
 *
 */
public class EmailAddressGenApp1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String firstname, middlename, lastname, year , year_number1, year_number2, email_info; 
		int birthyear;
		char first_letter, second_letter, third_letter, first_yearnumber, second_yearnumber ;
		
		System.out.print("Enter your full name: ");
		firstname = kb.next();
		middlename = kb.next();
		lastname = kb.next();
		
		System.out.print("Enter your birthyear: ");
		birthyear = kb.nextInt();
		
		if (birthyear < 1950 || birthyear > 2015 ) {
			Toolkit.getDefaultToolkit().beep();
			System.err.println("Error! Your birthyear is not between 1950 and 2015." + "\n The program will close.");
			System.exit(0);
		}
		year = Integer.toString(birthyear);
		
		first_letter = firstname.charAt(0);
		second_letter = middlename.charAt(0);
		third_letter = lastname.charAt(0);
		first_yearnumber = year.charAt(2);
		second_yearnumber = year.charAt(3);
		
		firstname = Character.toString(first_letter);
		middlename = Character.toString(second_letter);
		lastname = Character.toString(third_letter);
		year_number1 = Character.toString(first_yearnumber);
		year_number2 = Character.toString(second_yearnumber);
		
		email_info = firstname + middlename + lastname + year_number1 + year_number2;
		
		
				
	    year = Integer.toString(birthyear); 
	    
		System.out.println("Your email address will be: " + email_info.toLowerCase() + "@coti.uprb.edu");
		
		

	}

}