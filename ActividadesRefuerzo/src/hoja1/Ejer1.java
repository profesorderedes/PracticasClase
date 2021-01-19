package hoja1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float notas[] = new float[10];
		float media = 0;

		for (int i = 0; i < notas.length; i++) {

			System.out.print("Nota del alumno " + (i + 1) + ": ");
			notas[i] = entrada.nextFloat();

			// Vamos calculando la media.
			media = media + notas[i];

		}

		media = media / notas.length;

		System.out.println("\nLa nota media del grupo ha sido " + media);

		// Revisamos el array para ver qué notas son superiores a la media.
		System.out.println("\nNotas superiores a la media: ");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.print(notas[i] + " ");
			}
		}

	}

}