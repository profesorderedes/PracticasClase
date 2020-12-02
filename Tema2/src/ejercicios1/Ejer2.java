package ejercicios1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String NOMBRE_REQUERIDO = "admin";
		final String PASSWORD_REQUERIDO = "admin";

		System.out.println("Introduce la el nombre de usuario: ");
		String nombre = entrada.nextLine();

		System.out.println("Introduce la contraseña: ");
		String clave = entrada.nextLine();

		if (clave.equals(PASSWORD_REQUERIDO) && nombre.equals(NOMBRE_REQUERIDO)) {

			System.out.println("Acceso concedido.");

		} else {

			System.out.println("Acceso denegado.");

		}

	}

}