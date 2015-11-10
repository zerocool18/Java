import javax.swing.JOptionPane;

public class MoneyDistributionDialogApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method created to get the input
		int cents = getnumber("Enter the number total of pennies");
		//Void Method
		docalculus(cents);
	}
	
	public static int getnumber(String mensaje) {
		String cents;
		//Input with loop
		do{
			cents = JOptionPane.showInputDialog(mensaje);
			if(cents == null){
				System.exit(0);
			}

		}while(cents.isEmpty());
		//String to Int
		int pennies = Integer.parseInt(cents);
		//The condition of the instructions
		if (pennies <= 1 || pennies >= 100){
			JOptionPane.showMessageDialog(null, "The entry number is not between 1 and 100");
			System.exit(0);
		}
		return pennies;
	}
	
	public static void docalculus(int cents) {
//Constant Variables 
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		//Process 
			int quarters = cents/QUARTER;
			int comp = cents% QUARTER;		
			int dime = comp/ DIME;
			comp = comp % DIME;
			int nickels = comp/ NICKEL;
			int pennie = comp % NICKEL;
			//String Design
			String resultado = 	"The distribution of coins is: \n";
			
//			Lo iba a utilizar pero como en clase no escuchado hablar sobre el simbolo
//			no tome  el riesgo de aplicarlo
			
//			if (quarters != 0)
//				if (quarters > 1)
//					resultado += quarters + " Quarters\n" ;
//				else
//					resultado += quarters +" Quarter\n" ;
			
			
				//Conditions for Quarters or Quarter
				if (quarters <= 0){
					resultado += "";
				} else if(quarters > 1){
					resultado += quarters + " Quarters\n" ;
					}
						else{
							resultado += quarters +" Quarter\n" ;
						}
			
				//Conditions for Dimes or Dime
				if (dime <= 0){
					resultado += "";
				}
				else if(dime > 1){
					resultado += dime + " Dimes\n" ;
					}
						else{
							resultado += dime + " Dime\n";
						}

				//Conditions for Nickels or Nickel
				if (nickels <= 0){
					resultado += "";
				}
				else if(nickels > 1){
					resultado += nickels + " Nickels\n"  ;
					}
						else{
							resultado += nickels + " Nickel\n" ;
						}
				
				//Conditions for Pennies or Penny
				if (pennie <= 0){
					resultado += "";
				}
				else if(pennie > 1){
					resultado += pennie + " Pennies\n" ;
					}
						else{
							resultado += pennie + " Penny\n" ;
						}
			//Display the result of the String
			JOptionPane.showMessageDialog(null, resultado);
		}

}
