package bucles;

// Ejercicio 2 hecho con bucle for en vez de while.

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un carácter, por favor:");
		String caracter = entrada.nextLine();

		System.out.println("¿Cuántas veces quieres que se " + "muestre en la pantalla?");
		int repeticiones = entrada.nextInt();

		for (int i = 1; i <= repeticiones; i++) {

			System.out.println(i + " " + caracter);

		}

	}
}
