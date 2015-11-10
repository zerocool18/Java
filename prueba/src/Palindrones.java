import javax.swing.JOptionPane;


public class Palindrones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input, output = "";
		char letra;
		input = JOptionPane.showInputDialog("Palindrone word:");
		
		int i = input.length();
		
		for (int j = i; j > 0; j--) {
			letra = input.charAt(j-1);
			output += letra;
		}
		if(output.equalsIgnoreCase(input))
			JOptionPane.showMessageDialog(null, "true");
		else
			JOptionPane.showMessageDialog(null, "false");
			
	}
}
