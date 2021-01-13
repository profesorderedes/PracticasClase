package hoja2;

import java.util.Scanner;

public class Ejer22b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String notas[][] = new String[3][4];

		// Leemos el nombre y las notas de exámenes, trabajos y actitud de
		// cada alumno.
		for (int fila = 0; fila < notas.length; fila++) {

			System.out.print("Nombre: ");
			notas[fila][0] = entrada.nextLine();

			System.out.print("Nota de éxamenes: ");
			notas[fila][1] = entrada.nextLine();

			System.out.print("Nota de trabajos: ");
			notas[fila][2] = entrada.nextLine();

			System.out.print("Nota de actitud: ");
			notas[fila][3] = entrada.nextLine();

		}

		// Calculamos la media ponderada de las tres notas de cada alumno.
		float media;
		float examenes, trabajos, actitud;

		for (int fila = 0; fila < notas.length; fila++) {

			examenes = Float.parseFloat(notas[fila][1]);
			trabajos = Float.parseFloat(notas[fila][2]);
			actitud = Float.parseFloat(notas[fila][3]);
			media = (examenes * 50 + trabajos * 40 + actitud * 10) / 100;

		}

	}

}
