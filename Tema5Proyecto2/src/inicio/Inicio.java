package inicio;

import conversion.Conversor;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] agrs) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime los kilometros, te dire las millas: ");
		Conversor.millas(entrada.nextDouble());
		
		System.out.println("Dime los milibares, te dire las atmosferas: ");
		Conversor.atmosferas(entrada.nextDouble());
		
		System.out.println("Dime las calorias, te dire los julios: ");
		Conversor.julios(entrada.nextDouble());
		
	}

}
