package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int alturas[] = new int[10];
		int centimetros;
		boolean alturaEncontrada = false;
		int alturaBuscada = 190;
		int j = 0;

		System.out.println("Escribe la altura en centimetros");

		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Altura " + (i + 1) + ": ");
			centimetros = entrada.nextInt();

			alturas[i] = centimetros;

		}

		while (!alturaEncontrada && j < alturas.length) {

			if (alturas[j] > alturaBuscada) {
				System.out.println("Hay alguna estatura que es mas de 190 cm");
				alturaEncontrada = true;
			}

			j++;

		}

		if (!alturaEncontrada) {
			System.out.println("No hay ninguna estatura que sea mayor de 190 cm");
		}

	}

}