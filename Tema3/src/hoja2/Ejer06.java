package hoja2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int votos[] = new int[6];
		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < votos.length; i++) {

			System.out.println("Votos de partido " + i + " :");
			votos[i] = entrada.nextInt();

		}

		for (int i = 1; i < votos.length; i++) {

			if (votos[i] < votos[posMin]) {

				posMin = i;

				// System.out.println("posMin: " + i);

			}

			if (votos[i] > votos[posMax]) {

				posMax = i;

				// System.out.println("posMax: " + i);

			}

		}

		System.out.println(
				"\nMostraremos el partido con menos votos, " + votos[posMin] + ", está en la posición: " + posMin);

		System.out.println(
				"\nMostraremos el partido con más votos, " + votos[posMax] + ", está en la posición: " + posMax);
		
	}

}
