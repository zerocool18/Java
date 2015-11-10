import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class Batting_Ave {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hits = 0;
		double atbat = 0;
		double battingaverage = 0;
		Scanner hit = new Scanner (System.in);
		Scanner bat = new Scanner (System.in);
		System.out.println("Enter the player's number of hits: ");
		hits = hit.nextInt();
		System.out.println("Enter the player's number of times at bat: ");
		atbat = bat.nextInt();
		battingaverage = hits/atbat;
		System.out.println("The player's batting average is " + battingaverage);
		
		
	}

}
