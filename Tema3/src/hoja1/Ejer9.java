package hoja1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String test[] = new String[5];

		System.out.println("Indica la pregunta del test:");
		test[0] = entrada.nextLine();

		for (int i = 1; i < test.length; i++) {

			System.out.println("Respuesta " + (i));
			test[i] = entrada.nextLine();

		}

		System.out.println(test[0]);

		for (int i = 1; i < test.length; i++) {

			System.out.println("\t" + test[i]);

		}

	}

}