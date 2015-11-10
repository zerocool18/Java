import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class PointDistanceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the x, y coordinates of the first point: ");
		double First_x1 = scanner.nextDouble( );
		double First_y1 = scanner.nextDouble( );
		System.out.print("Enter the x, y coordinates of the Second point: ");
		double Second_x2 = scanner.nextDouble( );
		double Second_y2 = scanner.nextDouble( );
		
		
		double Distance = Formula_D(First_x1, First_y1, Second_x2, Second_y2);
		DecimalFormat format = new DecimalFormat("0.000");
		
		System.out.println("The distance between the points is: " + format.format(Distance));
		
	}

		public static double Formula_D(double x1, double y1, double x2, double y2) {
			double DISTANCE = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
			DISTANCE = Math.sqrt(DISTANCE);
			return DISTANCE;
	}

	

}
