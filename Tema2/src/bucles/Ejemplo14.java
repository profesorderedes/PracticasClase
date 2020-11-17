package bucles;

import java.util.Scanner;

// Ejemplo de break.

public class Ejemplo14 {

	public static void main(String[] args) {

		// Programa que va pidiendo nombres hasta que el usuario
		// escribe "parar".

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();

		while (true) {

			if (nombre.equals("parar")) {
				break;
			}

			System.out.println("Nombre: ");
			nombre = entrada.nextLine();

		}

		System.out.println("Por fin has escrito parar.");

	}

}
