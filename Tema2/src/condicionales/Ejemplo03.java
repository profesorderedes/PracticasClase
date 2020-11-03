package condicionales;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota? ");
		int nota = entrada.nextInt();

		// Condiciones suponiendo que la nota está entre 0 y 10.
		if (nota < 5) {
			System.out.println("Suspendido.");
		} else if (nota == 5) {
			System.out.println("Suficiente.");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
