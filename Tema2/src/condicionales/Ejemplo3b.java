package condicionales;

import java.util.Scanner;

public class Ejemplo3b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota? ");
		int nota = entrada.nextInt();

		// Condiciones suponiendo que no estamos seguros de que el
		// número que escriba el usuario sea correcto.
		if (nota >= 0 && nota < 5) {
			System.out.println("Suspendido.");
		} else if (nota == 5) {
			System.out.println("Suficiente.");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Error. La nota debe estar entre 0 y 10.");
		}

	}

}
