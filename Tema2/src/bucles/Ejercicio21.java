package bucles;

import java.util.Scanner;

/* Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de multiplicar.
Si el número introducido es 1, el programa escribirá el mensaje "¡No seas tonto!" y se volverá a formular la pregunta.
Utiliza la instrucción continue. */

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 1;

		int num;

		for (i = 1; i <= 5; i++) {

			System.out.print("Introoduce un número y te diré la tabla de multiplicar: ");
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("¡No seas tonto!");
				i--;
				continue;

			}

			int contadorTabla = 1;

			while (contadorTabla <= 10) {

				System.out.println(num + " x " + contadorTabla + " = " + (num * contadorTabla));
				contadorTabla++;

			}

		}

	}

}