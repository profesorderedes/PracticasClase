package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		/*
		 * 
		 * Escribe una aplicación que pida al usuario diez precios de productos. Después
		 * 
		 * devolverá el precio total a pagar y el número de productos cuyo precio sea
		 * 
		 * mayor de 10 euros.
		 * 
		 */

		Scanner entrada = new Scanner(System.in);
		double precios[] = new double[10];
		double precioTotal = 0;
		int mayores = 0;

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + (i + 1) + " : ");
			double precio = entrada.nextDouble();

			precios[i] = precio;

			precioTotal = precioTotal + precio;

			if (precio > 10) {

				mayores++;

			}

		}

		System.out.println(
				"El precio total es " + precioTotal + " y el número de productos mayor de 10 euros es " + mayores);

	}

}