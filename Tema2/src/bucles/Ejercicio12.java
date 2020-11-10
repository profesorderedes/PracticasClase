package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {

			System.out.println("¿Quién es el autor de la novela Ready player one?");
			System.out.println("1. Dougles Capland");
			System.out.println("2. Isaac Asimov");
			System.out.println("3. Ernest Cline");
			System.out.println("4. Ray Brandburry");

			num = entrada.nextInt();

		} while (num < 1 || num > 4);

		System.out.println("Has acertado");

	}

}