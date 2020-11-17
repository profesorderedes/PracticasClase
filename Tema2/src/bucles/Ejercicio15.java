package bucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precio, suma = 0;

		for (int i = 1; i <= 4; i++) {

			System.out.print("Precio: ");
			precio = entrada.nextFloat();

			suma = suma + precio;

		}

		System.out.println("Precio total: " + suma + " €.");

	}

}
