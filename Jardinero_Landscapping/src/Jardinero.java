 import java.awt.Toolkit;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author zerocool
 *
 */
public class Jardinero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double RATE = 4;//4 pies cuadrados por segundo
		final double CONVERSION = 3600;//Segundos en una hora
		
		double largoTerreno = getnumber("Largo del Terreno");//Primer metodo
		double anchoTerreno = getnumber("Ancho del Terreno");
		
		double largocasa = getnumber("Largo de la casa");
		double anchocasa = getnumber("Ancho de la casa");
		
		double largopiscina = getnumber("Largo de la piscina");
		double anchopiscina = getnumber("Ancho de la Piscina");
		
		double diametroJacuzzi = getnumber("Diametro Whirlpool");
		
		double areacasa = getArea( largocasa, anchocasa);
		double areapiscina = getArea( largopiscina, anchopiscina);
		double areaterreno = getArea( largoTerreno, anchoTerreno);
		double areaJacuzzi = getArea( diametroJacuzzi);
				
		double areaverde = areaterreno - areapiscina - areacasa - areaJacuzzi;
		double timeSeconds = areaverde / RATE;
		double timeHours = timeSeconds / CONVERSION;
		
		double costoPorHora = getnumber("Costo por Hora: ");
		
		double costoTotal = costoPorHora * timeHours;
		System.out.println("El Jardinero landscaping"
				+ "\n===================================="
				+ "\nEl costo de su terreno por hora es: "
				+ costoTotal
				+ "\n\nEs un placer servirle!!!!");
		
		
				
	}//main
	
	public static double getnumber( String mensaje ){
		
		Scanner kb = new Scanner(System.in);
		double nnn;
		do {
			System.out.println(mensaje);//Ejemplo metodo
		nnn = kb.nextDouble();
		
		if (nnn < 0) {
			System.err.println("\nError\n");
			Toolkit.getDefaultToolkit().beep();
			}
		} while (nnn < 0);
		
		return nnn; //ultima linea del metodo
		
	}//get number
	public static double getArea(double n1, double n2 )	{
		double aaa = n1 * n2;
		return aaa;
	}//getArea
	public static double getArea(double n1)	{
		//double bbb = Math.PI * (n1 / 2) * (n1 / 2);
		double bbb = Math.PI * Math.pow((n1 / 2), 2);
		return bbb;
	}//getArea
	
}//class
