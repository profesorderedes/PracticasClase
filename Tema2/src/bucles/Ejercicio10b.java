package bucles;

import java.util.Scanner;

/*
 * Ejercicio 10 usando una variable semáforo.
 */
public class Ejercicio10b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;

		// Variable semáforo. Si vale true, el bucle no se ejecutará,
		// y si vale false, sí.
		boolean acertado = false;

		while (acertado == false) {

			System.out.println("¿Cómo se escribe 30 en hexadecimal?\n");
			System.out.println("1) 1E");
			System.out.println("2) 2F");
			System.out.println("3) 33");
			System.out.println("4) Ninguno de los anteriores.");
			num = entrada.nextInt();

			if (num >= 1 && num <= 4) {
				acertado = true;
			}

		}

		if (num == 1) {
			System.out.println("Enhorabuena, has acertado");
		} else {
			System.out.println("Has fallado. La respuesta correcta es la 1.");
		}

	}

}