package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;

		System.out.println("¿Cómo se escribe 30 en hexadecimal?\n");
		System.out.println("1) 1E");
		System.out.println("2) 2F");
		System.out.println("3) 33");
		System.out.println("4) Ninguno de los anteriores.");
		num = entrada.nextInt();

		while (num < 1 || num > 4) {

			System.out.println("Vuelve a intentarlo, pero esta vez que sea del 1 al 4, gracias");
			num = entrada.nextInt();
		}

		if (num == 1) {
			System.out.println("Enhorabuena, has acertado");
		} else {
			System.out.println("Has fallado. La respuesta correcta es la 1.");
		}

	}

}