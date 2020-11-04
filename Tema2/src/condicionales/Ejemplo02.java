package condicionales;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		final double CANTIDAD_PARA_DESCUENTO = 50;
		final double PORCENTAJE_DESCUENTO = 10;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		double precio = entrada.nextDouble();

		if (precio > CANTIDAD_PARA_DESCUENTO) {

			// Haremos descuento de 10%.
			System.out.println("Tienes derecho a descuento.");
			precio = precio - (precio * PORCENTAJE_DESCUENTO / 100);

		} else {
			System.out.println("No tienes derecho a un descuento.");

		}

		System.out.println("El precio a pagar es " + precio + " €.");

	}

}
