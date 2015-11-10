import javax.swing.JOptionPane;

public class Bodymassindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Escriba su peso en libras");
		Double weight = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("Escriba su altura en pulgadas");
		double height = Double.parseDouble(input);
		
		if (weight <= 50 || weight >= 350){
			JOptionPane.showMessageDialog(null, "Valor entrado en peso debe ser entre 50 a 350");
			System.exit(0);
		}
		if (height <= 36 || height >= 90){
			JOptionPane.showMessageDialog(null, "Valor entrado en altura debe ser entre 36 a 90");
			System.exit(0);
		}
		
		double bmi = (weight*703)/Math.pow(height, 2);
		
		String output = "Your Bmi is: " + bmi;
		
		if (bmi <= 25){
			output += "\nYou are not overweight";
		}
		else{
			output += "\nYou are overweight";
		}
		JOptionPane.showMessageDialog(null, output);
	}

}
