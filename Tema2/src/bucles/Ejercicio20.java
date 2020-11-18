package bucles;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		int oportunidades = 1;
		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el número secreto? Del 1 al 10");
		numero = entrada.nextInt();

		while (true) {

			if (numero == 6) {
				System.out.println("Felicidades, el número es 6.");
				break;
			}

			if (oportunidades == 10) {

				System.out.println("Has perdido");
				break;
			}

			System.out.print("Error, prueba otra vez: ");
			numero = entrada.nextInt();

			oportunidades++;

		}

	}

}