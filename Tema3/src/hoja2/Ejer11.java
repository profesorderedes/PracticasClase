package hoja2;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int edades[] = new int[10];

		int edad;
		int posMin;
		int aux;

		for (int x = 0; x < edades.length; x++) {

			System.out.println("Edad " + (x + 1) + ": ");
			edad = entrada.nextInt();

			edades[x] = edad;
		}

		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}

			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}

		System.out.println("Edades ordenadas:");
		for (int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + " ");
		}

	}
}