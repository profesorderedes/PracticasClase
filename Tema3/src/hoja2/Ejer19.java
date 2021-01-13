package hoja2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nominas[][] = new String[4][3];

		// Leemos el apellido, nombre y sueldo de cada uno de los cuatro
		// empleados. Estos tres datos formarán una fila de la tabla.

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println("Empleado " + (fila + 1));
			System.out.println("================");

			System.out.print("Apellido: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Nombre: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo: ");
			nominas[fila][2] = entrada.nextLine();

			System.out.println();

		}

		// Mostramos los datos en la pantalla.
		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println(nominas[fila][0] + "\t" + nominas[fila][1] + "\t" + nominas[fila][2]);

		}

		// Calculamos el salario total.
		float total = 0;
		for (int fila = 0; fila < nominas.length; fila++) {

			total = total + Float.parseFloat(nominas[fila][2]);

		}

		System.out.println("El salario total es de " + total + " euros.");

		// Buscamos a la persona con menor salario.
		int posMin = 0;
		for (int fila = 1; fila < nominas.length; fila++) {

			if (Float.parseFloat(nominas[fila][2]) < Float.parseFloat(nominas[posMin][2])) {
				posMin = fila;
			}

		}

		System.out.println("El salario más bajo corresponde a " 
				+ nominas[posMin][1] + " " + nominas[posMin][0]
				+ ", y es de " + nominas[posMin][2] + " euros.");

	}

}
