package hoja2;

public class Ejer16 {

	public static void main(String[] args) {

		String notas[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" }, { "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, { "Alberto López", "7" } };

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

	}
}