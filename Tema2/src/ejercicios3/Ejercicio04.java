package ejercicios3;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1, num2, suma;
		char respuesta = 's';

		while (respuesta == 's') {

			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);

			System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");

			System.out.print("Introduce el resultado: ");
			suma = entrada.nextInt();

			if (suma == (num1 + num2)) {

				System.out.println("Correcto.\n");

			} else {

				System.out.println("Has fallado, el resultado era " + (num1 + num2) + ".\n");

			}

			entrada.nextLine();

			System.out.println("¿Quieres continuar?");
			respuesta = entrada.nextLine().charAt(0);

		}

	}

}