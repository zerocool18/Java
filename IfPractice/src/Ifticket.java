import java.util.Scanner;

public class Ifticket {
public static void main(String[]args){
	
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Entre Cantidad: ");
	double quantity = kb.nextDouble();
	
	if (quantity <=0 ) {
		System.out.println("Wrong");
	}
	
	System.out.println("Entre precio: ");
	double precio = kb.nextDouble();
	
	if (precio<0){
		System.out.println("Wrong");
	}
	double subtotal = precio;
	double tax_estatal = subtotal * .01;
	double tax_federal = subtotal * .105;
	double total = subtotal + tax_estatal + tax_federal;
	
	String receipt = "Subtotal:" + subtotal + "\nTax Estatal: " 
			+ tax_estatal + "\nTax Federal:" + tax_federal 
			+ "\nTotal: " + total;
	
	System.out.print("Cantidad a Pagar: ");
	double money = kb.nextDouble();
	
	if (money<total){
		System.out.println("Wrong");
		
		if (money>total){
		double change = money - total;
			}
		}
	else {
		System.out.println(receipt);
	}
	}
}
