package inicio;

import conversion.Conversor;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] agrs) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime los kilometros, te diré las millas: ");
		double km = entrada.nextDouble();
		System.out.println(Conversor.millas(km) + " millas.");
		
		System.out.println("Dime los milibares, te dire las atmosferas: ");
		double mb = entrada.nextDouble();
		System.out.println(Conversor.atmosferas(mb) + " atmósferas.");
		
		System.out.println("Dime las calorias, te dire los julios: ");
		double cal = entrada.nextDouble();
		System.out.println(Conversor.julios(cal) + " julios.");
		
	}

}
