package ejercicios1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String CLAVE_REQUERIDA = "java8";

		System.out.println("Introduce la clave de acceso: ");
		String clave = entrada.nextLine();

		if (clave.equals(CLAVE_REQUERIDA)) {

			System.out.println("Acceso concedido.");

		} else {

			System.out.println("Acceso denegado.");

		}

	}

}
