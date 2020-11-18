package bucles;

import java.util.Scanner;

public class Ejercicio20b {

	public static void main(String[] args) {

		int numero;
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el número secreto? Del 1 al 10");
		numero = entrada.nextInt();
		boolean acertado = false;

		for (int oportunidades = 1; oportunidades <= 10; oportunidades++) {

			if (numero == 6) {
				System.out.println("Felicidades, el número es 6.");
				acertado = true;
				break;
			}

			System.out.print("Error, prueba otra vez: ");
			numero = entrada.nextInt();

		}

		if (acertado == false) {
			System.out.println("Has perdido.");
		}

	}

}