/**
 * 
 */


import java.util.Scanner;

import javax.swing.JOptionPane;

public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input, output = "";
		char letra = '0';
		input = JOptionPane.showInputDialog("Palindrone word:");
		input = input.replaceAll(" ", "");
		
		int i = input.length() - 1;
		
		for (int j = i; j >= 0; j--) {
			letra = input.charAt(j);
			output += letra;
		}
		if(output.equalsIgnoreCase(input))
			JOptionPane.showMessageDialog(null, "true");
		else
			JOptionPane.showMessageDialog(null, "false");				
	}

}
