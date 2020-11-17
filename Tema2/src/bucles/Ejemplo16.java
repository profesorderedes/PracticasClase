package bucles;

// Ejemplo de continue.

public class Ejemplo16 {

	public static void main(String[] args) {

		// Programa que muestra los múltiplos de 5 hasta el 500,
		// pero no los múltiplos de 100.

		int i = 5;

		while (i <= 500) {

			if(i % 100 == 0) {
				continue;
			}
			
			System.out.println(i);
			i = i + 5;

		}

	}

}
