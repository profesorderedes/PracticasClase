package bucles;

// Ejemplo de continue.

public class Ejemplo16 {

	public static void main(String[] args) {

		// Programa que muestra los múltiplos de 5 hasta el 500,
		// pero no los múltiplos de 100.

		int i = 0;

		while (i < 500) {

			i = i + 5;

			if (i % 100 == 0) {
				continue;
			}

			System.out.println(i);

		}

		System.out.println("De nada.");

	}

}
