package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombres[] = new String[10];

		boolean nombreEncontrado = false;
		String nombreBuscado = "Calderon";
		String parar = "nadie";
		String nombre;
		int j = 0;

		System.out.println("Escribe 10 nombres");
		System.out.println("Para parar antes escribe la palabra \"nadie\"");

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre " + (i + 1) + ": ");
			nombre = entrada.nextLine();

			if (nombre.equals(parar)) {
				break;
			}

			nombres[i] = nombre;

		}

		while (nombreEncontrado == false && j < nombres.length) {
			if (nombres[j].equals(nombreBuscado)) {
				System.out.println(nombres[j] + " de la Barca");
				nombreEncontrado = true;
			}
			j++;
		}

		if (nombreEncontrado == false) {
			System.out.println("Nombre no encontrado");
		}

	}

}