package bucles;

import java.util.Scanner;

/*
 Programa que pide al usuario un número secreto entre 1 y 5.
 Si el usuario escribe "3", se le dice que ha acertado.
 Si no, se le vuelve a preguntar.
*/

public class Ejemplo10 {

	public static void main(String[] args) {

		final int SECRETO = 3;
		Scanner entrada = new Scanner(System.in);

		int num;

		do {

			System.out.println("A ver si aciertas el número secreto " + "entre 1 y 5:");
			num = entrada.nextInt();

		} while (num != SECRETO);

		System.out.println("Enhorabuena.");

	}

}
