package bucles;

import java.util.Scanner;

// Programa que pregunta 5 números al usuario y, al acabar, le indica
// cuántos han sido positivos.

public class Ejemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		int positivos = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Número " + i + ": ");
			num = entrada.nextInt();

			if (num > 0) {
				positivos++;
			}

		}

		System.out.println("Has escrito " + positivos + " números positivos.");

	}

}
