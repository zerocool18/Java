import java.util.Scanner;

public class BaseballApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String home1, visitants1;
		
			System.out.print("Home name: ");
			home1 = scanner.nextLine();
			System.out.print("Visitants name: ");
			visitants1 = scanner.nextLine();
		int x = 1;
			for(;x >= 9;x++){
			Scanner kb = new Scanner(System.in);
			System.out.print( home1 + " runs in "  + x + " inning:" );
			kb.nextInt();
			System.out.print(visitants1 + " runs in "+ x + " inning:");
			kb.nextInt();
			
		}
			
			
		
	}

}
