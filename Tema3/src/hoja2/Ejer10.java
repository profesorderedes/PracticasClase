package hoja2;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float temperaturas[] = new float[8];
		float aux;
		int posMin;

		// Recorremos el array hasta la penúltima posición.
		for (int i = 0; i < temperaturas.length - 1; i++) {

			// Fase de búsqueda: buscamos el valor más pequeño desde la
			// posición i hasta el final del array.
			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++) {

				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}

			}

			// Fase de intercambio.
			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;

		}

		System.out.println("\nTemperaturas ordenadas:");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(temperaturas[i] + "  ");
		}

	}

}
