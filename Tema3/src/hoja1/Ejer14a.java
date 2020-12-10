package hoja1;

import java.util.Scanner;

public class Ejer14a {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int candidato;
		boolean esPrimo = true;

		System.out.println("Dime un número y te diré si es primo o no:");
		candidato = entrada.nextInt();

		for (int i = 2; i < candidato; i++) {

			System.out.println("Dividiendo " + candidato + " entre " + i + " ...");

			if (candidato % i == 0) {
				System.out.println("No es primo, ya que es divisible por " + i + ".");
				esPrimo = false;
				break;
			}

		}

		if (esPrimo == true) {
			System.out.println(candidato + " es primo.");
		}

	}

}
