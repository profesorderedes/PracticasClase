import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Array para almacenar edades de ingresados en un hospital.
		int edades[] = new int[2000];
		int edad;

		// Leemos los datos del array. El usuario introducirá un valor 0
		// para indicar que ha terminado de pasar los datos.
		int i = 0;
		do {

			System.out.print("Edad " + i + ": ");
			edad = entrada.nextInt();

			edades[i] = edad;
			i++;

		} while (edad != 0);

		// Mostramos en la pantalla todas las edades leídas.
		System.out.println("\nEdades registradas:");
		i = 0;
		while (edades[i] != 0) {

			System.out.println(edades[i]);
			i++;

		}

	}

}
