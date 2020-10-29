package condicionales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota? ");
		float nota = entrada.nextFloat();

		// Condiciones suponiendo que la nota está entre 0 y 10.
		if (nota >= 0 && nota < 5) {
			System.out.println("Suspendido.");
		} else if (nota < 6) {
			System.out.println("Suficiente.");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else if (nota <= 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error");
		}

	}

}
