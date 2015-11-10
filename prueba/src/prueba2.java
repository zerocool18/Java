import java.text.DecimalFormat;
import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//medio velocidad
				final double AIR_FPS = 1100; 
				final double WIND_FPS = 4900; 
				final double STEEL_FPS = 16400;
				
				Scanner scanner = new Scanner(System.in);
				DecimalFormat format = new DecimalFormat("0.0##");
				
				System.out.println("Enter the medium in which sound will travel (a=air, w=water, or s=steel): ");
				String input = scanner.next().toUpperCase();
				char answer = input.charAt(0);
				
				System.out.println("Enter the distance traveled in feet: ");
				double feets = scanner.nextDouble();
					if (feets <= 0){
						System.err.println("feets must be greater or equal than 0");
						System.exit(0);
					}
				switch ( answer ) {
				case 'A' :
						double soundSeconds = feets / AIR_FPS; 
						System.out.println("It takes sound " + format.format(soundSeconds) + " seconds to travel that distance in air." );
					break;
				
				case 'W' :
						double soundSeconds1 = feets / WIND_FPS;
						System.out.println("It takes sound " + format.format(soundSeconds1) + " seconds to travel that distance in wind." );
					break;
				
				case 'S' :
						double soundSeconds2 = feets / STEEL_FPS;
						System.out.println("It takes sound " + format.format(soundSeconds2) + " seconds to travel that distance in steel." );
					break;

				default:
					System.err.println( "Invalid Character!" );
					break;
					
				}//Switch


	} 	
}