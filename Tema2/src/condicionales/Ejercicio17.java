package condicionales;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Pon un número: ");
		int num1 = entrada.nextInt();

		System.out.println("Pon otro número: ");
		int num2 = entrada.nextInt();

		System.out.println(
				"Que operación quiere hacer: \n" + "\n 1) Suma \n 2) Resta \n 3) Multiplicación " + "\n 4) División\n");

		int seleccionOperacion = entrada.nextInt();

		float operacion = 0;

		switch (seleccionOperacion) {

		case 1:

			operacion = num1 + num2;
			System.out.println("Resultado: " + operacion);
			break;

		case 2:

			operacion = num1 - num2;
			System.out.println("Resultado: " + operacion);
			break;

		case 3:

			operacion = num1 * num2;
			System.out.println("Resultado: " + operacion);
			break;

		case 4:

			operacion = (float) num1 / (float) num2;
			System.out.println("Resultado: " + operacion);
			break;

		}

	}

}
