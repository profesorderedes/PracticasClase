package condicionales;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Adivina el número entero entre 0 y 10");

		if (entrada.hasNextInt()) {

			int num = entrada.nextInt();
			if (num == 3) {

				System.out.println("¡¡Has acertado el número secreto!!");

			} else {

				System.out.println("No has acertado el número secreto.");

			}

		} else {
			System.out.println("Te he dicho que escribieras un número " + "entre 0 y 10.");
		}

	}

}
