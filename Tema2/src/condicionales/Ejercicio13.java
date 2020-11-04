package condicionales;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Dime un número de mes!");
		int mes = entrada.nextInt();

		if (mes == 1) {
			System.out.println("Enero");
		} else if (mes == 2) {
			System.out.println("Febrero");
		} else if (mes == 3) {
			System.out.println("Marzo");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else {
			System.out.println("El número introducido debe estar entre 1 y 4.");
		}

	}

}
