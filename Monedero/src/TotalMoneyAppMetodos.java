import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class TotalMoneyAppMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int quarters = getnumber("Enter the numbers of quarters: ");
		int dimes = getnumber("Enter the numbers of dimes: ");
		int nickels = getnumber("Enter the numbers of nickels: ");
		int pennies = getnumber("Enter the numbers of pennies: ");
		
		int totalchavitos = calculo(quarters, dimes, nickels, pennies);
		int dolares = calculo(totalchavitos);
		int reciduo = modulo(totalchavitos);
		resultado(totalchavitos, dolares, reciduo);
			
			}

	public static int resultado(int totalchavitos, int dolares, int reciduo) {
		// TODO Auto-generated method stub
		String message = "You Have "
					+ dolares
					+ " dollar(s) and "
					+ reciduo
					+ " cent(s).";
		JOptionPane.showMessageDialog(null, message.toUpperCase());
		return 0;
	}

	public static int modulo(int totalchavitos) {
		// TODO Auto-generated method stub
		final int DOLLAR = 100;
		int nnn = totalchavitos%DOLLAR;
		return nnn;
	}

	public static int calculo(int totalchavitos) {
		// TODO Auto-generated method stub
		final int DOLLAR = 100;
		int nnn = totalchavitos/DOLLAR;
		return nnn;
	}

	public static int calculo(int quarters, int dimes, int nickels, int pennies) {
		// TODO Auto-generated method stub
		final int QUARTERS = 25;
		final int DIMES = 10;
		final int NICKELS = 5;
		
		int nnn = quarters * QUARTERS;
		nnn = nnn + dimes * DIMES;
		nnn = nnn + nickels * NICKELS;
		nnn += pennies;
		return nnn;
	}

	public static int getnumber(String string) {
		// TODO Auto-generated method stub
		int nnn;
		do{
		String answerString = JOptionPane.showInputDialog(string);
		if (answerString == null || answerString.isEmpty() ){
			System.exit(0);
		}
		nnn = Integer.parseInt(answerString);
		if(nnn < 0){
			JOptionPane.showMessageDialog(null, "ERROR");;
		}
		}while(nnn < 0);
		return nnn;
	}

}
