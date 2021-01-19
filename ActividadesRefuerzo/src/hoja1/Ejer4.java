package hoja1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String sueldos[][] = new String[6][2];

		// Leemos los datos de los empleados.
		for (int i = 0; i < sueldos.length; i++) {

			System.out.println("Empleado " + (i + 1));
			System.out.println("--------------------");

			System.out.print("Nombre: ");
			sueldos[i][0] = entrada.nextLine();

			System.out.print("Sueldo: ");
			sueldos[i][1] = entrada.nextLine();

			System.out.println();

		}

		// Buscamos el mayor sueldo.
		int posMax = 0;
		for (int fila = 1; fila < sueldos.length; fila++) {

			if (Float.parseFloat(sueldos[fila][1]) > Float.parseFloat(sueldos[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println("\nEl empleado que más gana es " + sueldos[posMax][0] + ". Su sueldo es de "
				+ sueldos[posMax][1] + " euros.");
	}

}