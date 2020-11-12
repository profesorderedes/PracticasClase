package bucles;

public class Ejercicio17 {

	public static void main(String[] args) {

		// Tabla del 1
		// Tabla del 2
		// ...
		// Tabla del 10

		for (int i = 1; i <= 10; i++) {

			// Mostramos la tabla de multiplicar del número i.
			for (int j = 1; j <= 10; j++) {

				System.out.println(i + " x " + j + " = " + i * j);

			}

			System.out.println();

		}

	}

}
