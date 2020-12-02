package bucles;

import java.util.Scanner;

// Ejercicio 2 de la práctica 1 de la 
// primera evaluación.
public class Ejemplo17B {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String palabra;

		// Repetimos indefinidamente.
		while (true) {

			System.out.print("Escribe una palabra: ");
			palabra = entrada.nextLine();

			if (palabra.equals("STOP")) {
				break;
			}

			for (int i = 1; i <= 5; i++) {
				System.out.println(palabra);
			}

			System.out.println();

		}

		System.out.println("Fin.");

	}

}
