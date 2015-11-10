import java.util.Scanner;

public class EmailAddressGenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		//input
		System.out.print("Enter your full name: ");
		String firstname = kb.next();
		String middlename = kb.next();
		String lastname = kb.next();
		System.out.print("Enter your Birthyear: ");
		int year = kb.nextInt();
			
			//Condition of the instructions
			if (year > 2015 || year < 1950) {
				System.err.println("ERROR" + "\nEl año de nacimiento no está entre 1950 y 2015");
				System.exit(0);
			}	
			String yearString = Integer.toString(year);
			
		//Selection of Char	
		char firstletter = firstname.charAt(0);
		char secondletter = middlename.charAt(0);
		char year_first = yearString.charAt(2);
		char year_Second = yearString.charAt(3);
		
		//Char to String
		String fLetter = Character.toString(firstletter);
		String sLetter = Character.toString(secondletter);
		String yFirst = Character.toString(year_first);
		String ySecond = Character.toString(year_Second);
		
		//String with the characters 
		String result = fLetter + sLetter + lastname + yFirst + ySecond;
		
		//Display
		System.out.println("\nYour email address will be: " + result.toLowerCase()
				+"@coti.uprb.edu");
				
		
	}

}
