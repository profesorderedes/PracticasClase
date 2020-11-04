package condicionales;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entero entre 0 y 10");

		if (entrada.hasNextInt()) {
			int num = entrada.nextInt();
			System.out.println("El número elegido es " + num);
		} else {
			System.out.println("Te he dicho que escribieras un número " + "entre 0 y 10.");
		}

	}

}
