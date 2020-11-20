package ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int aleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(aleatorio);

		int i = 1;

		int valorUsuario;
		boolean acertado = false;

		do {

			System.out.println("Intenta adivinar el número secreto" + "\nEscribe un número entero:");

			valorUsuario = entrada.nextInt();

			i = i + 1;

			if (valorUsuario == aleatorio) {
				acertado = true;
			}

		} while (acertado == false && i <= 3);

		if (acertado) {
			System.out.println("Enhorabuena por haber acertado.");
		} else {
			System.out.println("Más suerte la próxima vez.");
		}

	}

}