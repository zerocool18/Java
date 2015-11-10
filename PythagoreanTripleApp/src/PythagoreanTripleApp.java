import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class PythagoreanTripleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constant
		final int TWO = 2;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the Values of m and n: ");
//		input
		double m = kb.nextDouble();
		double n = kb.nextDouble();
//		Condition No negatives number
		if (m < 0 || n < 0){
			System.err.println("Error " + "\nEl numero entrado debe ser positivo");
			System.exit(0);
		}
//		Condition m need to be higher number than n
		if (m < n) {
			System.err.println("Error" + "\nm no es mayor que n");
			System.exit(0);
		}
//		Process with each side and hypotenuse 
		double side1 = (Math.pow(m, TWO) - Math.pow(n, TWO));
		double side2 = (TWO *m *n);
		double hypotenuse = (double) Math.sqrt(Math.pow(side1,TWO) + Math.pow(side2, TWO));
		
//		Decimal format to 0.000
		DecimalFormat fmt = new DecimalFormat("0.###");
		
//		Output
		System.out.println("\nThe corresponding Pythagorean triple is (" + 
				fmt.format(side1)+ ", " 
				+ fmt.format(side2) + ", " 
				+ fmt.format(hypotenuse)+ ")");
	}

}
