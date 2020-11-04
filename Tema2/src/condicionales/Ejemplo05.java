package condicionales;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pedimos al usuario que escriba cuántos años tiene.
		// Si se equivoca al escribir el dato, le informamos con
		// un mensaje.
		System.out.println("¿Cuántos años tienes?");

		if (entrada.hasNextInt()) {

			// El usuario ha puesto un dato correcto.
			int edad = entrada.nextInt();
			System.out.println("Tienes " + edad + " años.");

		} else {

			System.out.println("La edad que has escrito no es correcta. " + "Debe ser un número entero.");

		}

	}

}
