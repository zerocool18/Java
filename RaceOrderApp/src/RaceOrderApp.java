import javax.swing.JOptionPane;

public class RaceOrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring String names
		String racer1, racer2, racer3, time;
		
		//input of first racer
		racer1 = JOptionPane.showInputDialog("Nombre del primer Corredor: ");
		
		//Condition if is empty
		if (racer1.isEmpty()){
			JOptionPane.showMessageDialog(null, "No puso el nombre");
			System.exit(0);		}
		
		time = JOptionPane.showInputDialog("Entre el tiempo corridos en minutos");
		//Condition if is empty
		if (time.isEmpty()){
			JOptionPane.showMessageDialog(null, "Must enter a number");
			System.exit(0);
		}
		//Parsing String to int
		int time1 = Integer.parseInt(time);
		//Range Condition
		if(time1 < 15 || time1 > 100){
			JOptionPane.showMessageDialog(null, "Time 1 is out of range");
			System.exit(0);
		}
		
		racer2 = JOptionPane.showInputDialog("Nombre del Segundo Corredor: ");
		//Condition if is empty
		if (racer2.isEmpty()){
			JOptionPane.showMessageDialog(null, "Their is no name");
			System.exit(0);
		}
		
		time = JOptionPane.showInputDialog("Entre el tiempo corridos en minutos");
		//Condition if is empty
		if (time.isEmpty()){
			JOptionPane.showMessageDialog(null, "Must enter a number");
			System.exit(0);
		}
		//Parsing String to int
		int time2 = Integer.parseInt(time);		
		//Range Condition
		if(time2 < 15 || time2 > 100){
			JOptionPane.showMessageDialog(null, "Time 2 is out of range");
			System.exit(0);
		}
		
		racer3 = JOptionPane.showInputDialog("Nombre del Tercer Corredor: ");
		//Condition if is empty
		if (racer3.isEmpty()){
			JOptionPane.showMessageDialog(null, "Their is no name");
			System.exit(0);
		}
		
		time = JOptionPane.showInputDialog("Entre el tiempo corridos en minutos");
		//Condition if is empty
		if (time.isEmpty()){
			JOptionPane.showMessageDialog(null, "Must enter a number");
			System.exit(0);
		}
		//Parsing String to int
		int time3 = Integer.parseInt(time);	
		//Range Condition
		if(time3 < 15 || time3 > 100){
			JOptionPane.showMessageDialog(null, "Time 3 is out of range");
			System.exit(0);
		}
		//time1,time2,time3
		//racer1,racer2,race3
		
		String string = null;
		int temp = 0;
		//Comparing time one with time two if true the same actions taken with the time will be reproduce with the names 
		if (time1 > time2){
				temp = time1;
				time1 = time2;
				time2 = temp;
				
				string = racer1;
				racer1 = racer2;
				racer2 = string;
		}
		//Comparing time two with time three if true the same actions taken with the time will be reproduce with the names 
		if (time2 > time3){
				temp = time2;
				time2 = time3;
				time3 = temp;
			
				string = racer2;
				racer2 = racer3;
				racer3 = string;
				
		}
		//Comparing time one with time two again to view if the time 3 that now if time two was bigger than time one 
		//if true the same actions taken with the time will be reproduce with the names 
		if (time1 > time2){
				temp = time1;
				time1 = time2;
				time2 = temp;
				
				string = racer1;
				racer1 = racer2;
				racer2 = string;
		}
		//String created with names and times
		String resultado = "Positions: "
				+ "\nFirst Place " + racer1 + " in " + time1 + " minutes."
				+ "\nSecond Place " + racer2 + " in " + time2 + " minutes."
				+ "\nThird Place " + racer3 + " in " + time3 + " minutes.";
		//Output in JOptionPane
		JOptionPane.showMessageDialog(null, resultado);
	}

}
