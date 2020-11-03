package condicionales;

import java.util.*;

/*
	Versión del ejercicio 4 usando un String para la contraseña.
 */
public class Ejercicio4b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca contraseña: ");
		int contrasenya = entrada.nextInt();

		if (contrasenya == 1234) {
			System.out.println("Acceso concedido");
		} else {
			System.out.println("Acceso denegado");
		}

	}

}
