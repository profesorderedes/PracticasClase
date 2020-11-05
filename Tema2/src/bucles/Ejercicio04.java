package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		final int SECRETO = 3;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número del 1 al 5.");
		int num = entrada.nextInt();

		while (num != SECRETO) {

			System.out.println("Prueba otra vez.");
			num = entrada.nextInt();
		}

		System.out.println("Enhorabuena.");

	}

}