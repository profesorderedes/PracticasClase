package bucles;

import java.util.Scanner;

// Ejercicio 2 de la práctica 1 de la 
// primera evaluación.
public class Ejemplo17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String palabra;

		System.out.print("Escribe una palabra: ");
		palabra = entrada.nextLine();

		// Repetimos indefinidamente.
		while (!palabra.equals("STOP")) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(palabra);
			}

			System.out.println();
			System.out.print("Escribe una palabra: ");
			palabra = entrada.nextLine();

		}

		System.out.println("Fin.");

	}

}
