import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class KM_MI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km = 0;
		double ml = 0;
		
		String ans = JOptionPane.showInputDialog("Cuantos kilometros?");
		km = Double.parseDouble(ans);
		if (km < 0) {
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(null, "ERROR");
			System.exit(0);
		}
		
		ml = km * .62;
		
		DecimalFormat format = new DecimalFormat("0.0");
		JOptionPane.showMessageDialog(null, "Sus Millas son " + format.format(ml));
		
	}

}
