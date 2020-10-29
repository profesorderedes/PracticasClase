package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		float precio = entrada.nextFloat();

		if (precio > 80) {
			precio = precio - precio * 10 / 100;
		}

		System.out.println("Precio final: " + precio + " €.");

	}

}
