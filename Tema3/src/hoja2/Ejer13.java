package hoja2;

public class Ejer13 {

	public static void main(String[] args) {

		double medidas[][] = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 } };

		int col;
		System.out.println("Registros meteorologicos");

		for (int fila = 0; fila < medidas.length; fila++) {

			for (col = 0; col < medidas[0].length; col++) {

				System.out.print(medidas[fila][col] + "\t ");

			}

			System.out.println();

		}

	}

}
