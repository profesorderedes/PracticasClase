package bucles;

import java.util.Scanner;

// Ejemplo sin usar break.

public class Ejemplo15b {

	public static void main(String[] args) {

		// Programa que vaya pidiendo números y sumándolos.
		// Parará cuando el usuario escriba un 0.
		// Y mostrará el total.

		Scanner entrada = new Scanner(System.in);

		float cantidad;
		float suma = 0;

		while (true) {

			System.out.print("Cantidad: ");
			cantidad = entrada.nextFloat();

			suma = suma + cantidad;

			if (cantidad == 0) {
				break;
			}

		}
		
		System.out.println("Cantidad total: " + suma);

	}

}








