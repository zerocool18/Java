import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class cambio_project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quarter = 25;
		final int dime = 10;
		final int nickel = 5;
		final int pennie = 1;
		
		String inputCent = JOptionPane.showInputDialog("Enter the number of cents");
		int cent = Integer.parseInt(inputCent);
		
		int restante1 = cent/quarter;
		int restante2 = dime/restante1;
		int restante3 = nickel/restante2;
		int restante4 = pennie/restante3;
		
		System.out.println("Quarter(s) "+ restante1);
		System.out.println("Dime(s) "+ restante2 );
		System.out.println("Nickels(s) "+ restante3);
		System.out.println("Pennie(s) "+ restante4);
		
		
		
		
		
		
	}

}
