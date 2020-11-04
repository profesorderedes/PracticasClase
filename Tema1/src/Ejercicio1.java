
// Crea un programa que pida dos números y los multiplique.

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Escribe dos números y te los multiplicaré!");
		System.out.println("Primer número:");
		int num1 = entrada.nextInt();

		System.out.println("Segundo número:");
		int num2 = entrada.nextInt();

		int producto = num1 * num2;

		System.out.println("Al multiplicar los dos números da " + producto);

	}

}
