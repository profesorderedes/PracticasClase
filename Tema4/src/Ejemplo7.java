import java.util.Scanner;

//Programa que pide un nº al usuario y usa el método tablaMultiplicar 
// para mostrar la tabla.

public class Ejemplo7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿De qué número quieres saber la tabla de " + "multiplicar?");
		System.out.println("Introduce el número: ");

		tablaMultiplicar(entrada.nextInt());

	}

	// Mostrará la tabla de multiplicar del nº pasado como parametro.
	// Pero sí el número es negativo, mostrará un mensaje de error.

	static void tablaMultiplicar(int num) {

		if (num < 0) {
			System.out.println("Tienes que escribir un número positivo.");
			return;
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + (i * num));
		}

	}

}













