package hoja2;

public class Ejer01 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 
				20, 19 };

		boolean edadEncontrada = false;
		int i = 0, edadBuscada = 20;

		while (!edadEncontrada && i < edades.length) {

			if (edades[i] == edadBuscada) {

				System.out.println("Localizada persona de " + edadBuscada + " años en la "
						+ "posición " + i + ".");
				edadEncontrada = true;

			}

			i++;

		}

		if (edadEncontrada == false) {

			System.out.println("No se ha encontrado la edad " 
					+ edadBuscada + " en el array.");

		}

	}

}