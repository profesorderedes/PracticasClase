
// Cálculo del máximo de un array.

public class Ejemplo7 {

	public static void main(String[] args) {

		int notas[] = { 7, 1, 9, 3, 0, 10 };
		int posMax = 0; // Posición del mínimo del array

		System.out.println("posMax = 0");

		for (int i = 1; i < notas.length; i++) {

			if (notas[i] > notas[posMax]) {

				posMax = i;
				System.out.println("posMax = " + i);

			}

		}

		System.out.println("\nEl elemento más grande del array se " + "encuentra en \nla posición " + posMax
				+ " y su valor es " + notas[posMax] + ".");

	}

}
