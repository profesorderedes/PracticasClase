package hoja2;

public class Ejer18 {

	public static void main(String[] args) {

		String notas[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "5" },
				{ "Juana Herranz", "4" }, { "Alberto López", "10" } };

		float nota;
		float total = 0;

		System.out.println("Alumno\t\t|  Nota");
		System.out.println("================|=====");

		for (int fila = 0; fila < notas.length; fila++) {

			for (int col = 0; col < notas[0].length; col++) {

				System.out.print(notas[fila][col] + " \t");

			}
			System.out.println();
			nota = Float.parseFloat(notas[fila][1]);
			total = total + nota;
		}

		System.out.println();
		System.out.println("La nota media es: " + total / 5);

		// Buscar la nota mínima.
		int posMin = 0;
		for (int fila = 0; fila < notas.length; fila++) {

			if (Float.parseFloat((notas[fila][1])) < Float.parseFloat(notas[posMin][1])) {
				posMin = fila;
			}

		}

		System.out.println(notas[posMin][0] + " ha sacado la nota más baja, un " + notas[posMin][1] + ".");

		// Buscar la nota máxima.
		int posMax = 0;
		for (int fila = 0; fila < notas.length; fila++) {

			if (Float.parseFloat((notas[fila][1])) > Float.parseFloat(notas[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println(notas[posMax][0] + " ha sacado la nota más alta, un " + notas[posMax][1] + ".");

	}
}
