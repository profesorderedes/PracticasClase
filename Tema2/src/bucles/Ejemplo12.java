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

		int contador = 1;
		while (contador <= repeticiones) {

			System.out.println(contador + " " + caracter);
			contador++;

		}
	}
}
