package bucles;

import java.util.Scanner;

// Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles
// respuestas numeradas.

public class Prueba {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean acertado = false;
		int pelicula;

		while (acertado == false) {

			System.out.println("¿Cual es la indiscutible mejor pelicula de viajes en el tiempo? (Escribir el número)");
			System.out
					.println("1) Terminator 2 \n2) Regreso al futuro \n3) Avengers: End Game \n4) El efecto mariposa");
			pelicula = entrada.nextInt();

			if (pelicula == 1) {
				acertado = true;
				System.out.println(
						"Efectivamente, Terminator 2 es la mejor pelicula de viajes en el tiempo sin ninuna duda");
			} else if (pelicula == 2) {

				System.out.println("He dicho pelicula, no saga, a si que respuesta incorrecta");
			} else if (pelicula == 3) {

				System.out.println("Respuesta incorrecta");

			} else if (pelicula == 4) {

				System.out.println("Respuesta incorrecta");
			} else {
				System.out.println("¿Sabes leer? He dicho que escribas el numero, y solo hay cuatro opciones.");
			}

		}

	}

}