package hoja2;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String notas[][] = new String[3][4];

		// Leemos el nombre y las notas de exámenes, trabajos y actitud de
		// cada alumno.
		System.out.println("Introducción de notas");
		System.out.println("==============================");
		
		for (int fila = 0; fila < notas.length; fila++) {

			System.out.print("Nombre: ");
			notas[fila][0] = entrada.nextLine();

			System.out.print("Éxamenes: ");
			notas[fila][1] = entrada.nextLine();

			System.out.print("Trabajos: ");
			notas[fila][2] = entrada.nextLine();

			System.out.print("Actitud: ");
			notas[fila][3] = entrada.nextLine();

		}

		// Calculamos la media ponderada de las tres notas de cada alumno.
		System.out.println("\nNota de evaluación");
		System.out.println("==============================");
		
		float media;
		for (int fila = 0; fila < notas.length; fila++) {

			media = (Float.parseFloat(notas[fila][1]) * 50 + Float.parseFloat(notas[fila][2]) * 40
					+ Float.parseFloat(notas[fila][3]) * 10) / 100;
			
			System.out.println(notas[fila][0] + ": " + media);

		}

	}

}
