package hoja2;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

//Pide 10 precios, al acabar devuelve la suma de todos ellos,
//si hay algun valor = 0, encambio, mostrara la posicion donde se encuentra.

		double productos[] = new double[10];
		double precio = 0;
		boolean preciosCorrectos = true;
		double suma = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime tus precios: ");

		for (int i = 0; i < productos.length; i++) {
			precio = entrada.nextDouble();
			productos[i] = precio;
		}

		for (int j = 0; j < productos.length && preciosCorrectos; j++) {

			if (productos[j] > 0) {
				suma = suma + productos[j];
			} else {
				System.out.println("Se ha encontrado un valor no válido en la posicion: " + (j + 1) + ""
						+ " El programa terminará.");
				preciosCorrectos = false;
			}

		}

		if (preciosCorrectos) {
			System.out.println("La suma de sus precios es:" + suma);
		}

	}

}