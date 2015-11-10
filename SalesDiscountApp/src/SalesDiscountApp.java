import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesDiscountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constant
		final int PRECIO_FIJO = 99;
		final double porciento1 = .20;
		final double porciento2 = .30;
		final double porciento3 = .40;
		final double porciento4 = .50;
		//Scanner and Decimal Format
		DecimalFormat format = new DecimalFormat("$#,##0.00");
		Scanner kb = new Scanner (System.in);
		
		//input of quantities
		System.out.print("Enter the number of products purchased: ");
		int cantidad = kb.nextInt();
		//Condition higher than 0
		if (cantidad <= 0 ){
			System.err.println("The number must be higher than 0");
			System.exit(0);
		}
		
		//Conditions to determinate what percentage is applicable
		double porciento = 0, resultado, descuento;
		if (cantidad >= 10 && cantidad <= 19)
			porciento = porciento1;
		else if (cantidad >= 20 && cantidad <= 49)
			porciento = porciento2;
		else if (cantidad >= 50 && cantidad <= 99)
			porciento = porciento3;
		else 
			porciento = porciento4;
		
		//Calculation of discount and final result to pay
		descuento = (cantidad * porciento )* PRECIO_FIJO;
		resultado = (cantidad * PRECIO_FIJO) - descuento;
		
		//output with the discount and result to pay in format
		System.out.println("\nYou have a " + format.format(descuento) + " discount."
				+ "\nYou must pay " + format.format(resultado));
		
	}

}
