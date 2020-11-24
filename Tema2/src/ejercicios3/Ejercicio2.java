package ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int secreto = (int) (Math.random() * 10 + 1);

		int intento = 0;

		int intentos;

		System.out.println("El número secreto es: " + secreto);

		intentos = 1;

		boolean haAcertado = false;

		while (intentos <= 3) {

			System.out.println("Tienes que adivinar el numero del 1 al 10");

			intento = entrada.nextInt();

			haAcertado = intento == secreto;

			if (haAcertado) {
				break;
			}

			intentos++;

		}

		if (haAcertado) {
			System.out.println("Has acertado y el numero de intentos utilizados son: " + intentos);
		}

		switch (intentos) {
		case 1:
			System.out.println("has obtenido 10 puntos");
			break;
		case 2:
			System.out.println("has obtenido 5 puntos");
			break;
		case 3:
			System.out.println("has obtenido 2 puntos");
			break;
		default:
			System.out.println("Recibes 0 puntos");
			break;
		}

	}

}
