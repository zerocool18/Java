// Source File: SalespersonPaymentDialogApp.java
// Author: Antonio F. Huertas
// Date: October 15, 2015
// Purpose: Determines the gross pay for a salesman based on the number
//          of hours worked and the total sales.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SalespersonPaymentDialogAppPrint{
	public static void main(String[] args) throws FileNotFoundException {
		// Symbolic constants
		final double REGULAR_HOURS = 40.0;
		final double SALARY_PER_HOUR = 7.25;
		final double OVERTIME_RATE = 1.5;
		final double OVERSALE_COMISSI0N = 0.04;
		final double REGULAR_COMISSION = 0.02;
		final double BONUS = 100.0;
		final double SALES_COMISSION = 5000.0;
		final double BONUS_COMISSION = 8000.0;
		final double SOC_SEC = 0.062;
		final double MEDIC = 0.0145;
		final double HACIENDA = 0.15;
		
		// Variables
		String employeeName;
		double hrsWorked, totalSales, 
			overtime = 0.0, salary, commission, bonus = 0.0, 
			grossPay;

		// Create a DecimalFormat object.
//		DecimalFormat fmt = new DecimalFormat("$#,##0.00");

		// Ask for the employee name.
		employeeName = JOptionPane.showInputDialog(null, 
				"Enter name of salesman: ");

//		// Ask for the employee how many hours did he work this week.
//		input = JOptionPane.showInputDialog(null,
//				"How many hours did you work this week?(0-100): ");
////		hrsWorked = Double.parseDouble(input);
		
		hrsWorked = getDouble("How many hours did you work this week?(0-100): ");
		
		if (hrsWorked < 0 || hrsWorked > 100) {
			JOptionPane.showMessageDialog(null,
					"Invalid number of hours.\n" +
					"Program terminated.",
					"Error in Hours!",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);  // exit application with error code
		}

		// Ask for the total amount of sales.
//		input = JOptionPane.showInputDialog(null,
//				"Enter the total amount of sales: $");
//		totalSales = Double.parseDouble(input);
		
		totalSales = getDouble("Enter the total amount of sales: $");
		
		if (totalSales < 0.0) {
			JOptionPane.showMessageDialog(null, 
					"Negative sales amount.\n" +
					"Program terminated.",
					"Error in Sales Amount!",
					JOptionPane.ERROR_MESSAGE);
			System.exit(1);  // exit application with error code
		}

		// Compute gross pay.
		if (hrsWorked > REGULAR_HOURS){
			overtime = hrsWorked - REGULAR_HOURS;
			salary =  SALARY_PER_HOUR * REGULAR_HOURS +
					SALARY_PER_HOUR * overtime * OVERTIME_RATE;	
		}
		else
			salary =  SALARY_PER_HOUR * hrsWorked;

		if (totalSales > SALES_COMISSION)
			commission = totalSales * OVERSALE_COMISSI0N;
		else
			commission =  totalSales * REGULAR_COMISSION;

		if (overtime > 10.0 && totalSales > BONUS_COMISSION)
			bonus = BONUS;
		
		grossPay = salary + commission + bonus;
		
		double ss = grossPay * SOC_SEC;
		double nn = grossPay * MEDIC;
		double hacienda = grossPay * HACIENDA;
		double netPay = grossPay - hacienda - ss - nn;
		

		// Display results.
//		output = "These are the results for " + employeeName + "\n" +
//				"Salary: " + fmt.format(salary) + "\n" +
//				"commission: " + fmt.format(commission) + "\n";
//		
//		if (bonus > 0.0)
//			output += "Bonus: " + fmt.format(bonus) + "\n";
//		
//		output += "Gross Pay: " + fmt.format(grossPay) +  
//				"\nSeguro Social: " + fmt.format(ss) + 
//				"\nMedicare: " + fmt.format(nn) + 
//				"\nHacienda: "+ fmt.format(hacienda) +
//				"\nSalario Neto: " + fmt.format(netPay);
//		
		
//		Las Variables es este metodo se llaman Parametros
		showResult(employeeName, salary,commission,commission,
				bonus,grossPay,ss,nn,
				hacienda,netPay);
		printResult(employeeName, salary,commission,commission,
				bonus,grossPay,ss,nn,
				hacienda,netPay);
		
		System.exit(0);  // exit with success code
	}
	public static double getDouble(String mensaje){
		String ii;
		do{ 
		ii = JOptionPane.showInputDialog(null,
				mensaje);
		 if (ii == null)
			 System.exit(0);
		}while(ii.isEmpty());
		 double hrsWorked = Double.parseDouble(ii);
		 return hrsWorked;
	}
	
	public static void showResult(String employeeName, 
//				Argumentos del metodo showResult
				double salary, 
				double commission, 
				double commission2, 
				double bonus, 
				double grossPay, 
				double ss, 
				double nn, 
				double hacienda, 
				double netPay) {
	
		DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		
		String output = "These are the results for " + employeeName + "\n" +
				"Salary: " + fmt.format(salary) + "\n" +
				"commission: " + fmt.format(commission) + "\n";
		
		if (bonus > 0.0)
			output += "Bonus: " + fmt.format(bonus) + "\n";
		
		output += "Gross Pay: " + fmt.format(grossPay) +  
				"\nSeguro Social: " + fmt.format(ss) + 
				"\nMedicare: " + fmt.format(nn) + 
				"\nHacienda: "+ fmt.format(hacienda) +
				"\nSalario Neto: " + fmt.format(netPay);
		JOptionPane.showMessageDialog(null, output);
		
	}
	public static void printResult(String employeeName, 
//			Argumentos del metodo showResult
			double salary, 
			double commission, 
			double commission2, 
			double bonus, 
			double grossPay, 
			double ss, 
			double nn, 
			double hacienda, 
			double netPay) throws FileNotFoundException {
		String String = "/home/zerocool/Desktop/talonario.txt";
		File aFile = new File( String );
		PrintWriter aWriter = new PrintWriter( aFile );
	DecimalFormat fmt = new DecimalFormat("$#,##0.00");
	
	String output = "These are the results for " + employeeName + "\n" +
			"Salary: " + fmt.format(salary) + "\n" +
			"commission: " + fmt.format(commission) + "\n";
	
	if (bonus > 0.0)
		output += "Bonus: " + fmt.format(bonus) + "\n";
	
	output += "Gross Pay: " + fmt.format(grossPay) +  
			"\nSeguro Social: " + fmt.format(ss) + 
			"\nMedicare: " + fmt.format(nn) + 
			"\nHacienda: "+ fmt.format(hacienda) +
			"\nSalario Neto: " + fmt.format(netPay);
	aWriter.println("---------------------------------");
	aWriter.println("Talonario");
	aWriter.println(output);
	aWriter.println("---------------------------------");
	aWriter.close();
	
}
	
}