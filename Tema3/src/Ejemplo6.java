
// Cálculo del mínimo de un array.

public class Ejemplo6 {

	public static void main(String[] args) {

		int notas[] = { 7, 1, 9, 3, 0, 10 };
		int posMin = 0; // Posición del mínimo del array

		System.out.println("posMin = 0");

		for (int i = 1; i < notas.length; i++) {

			if (notas[i] < notas[posMin]) {

				posMin = i;
				System.out.println("posMin = " + i);

			}

		}

		System.out.println("\nEl elemento más pequeño del array se " + "encuentra en \nla posición " + posMin
				+ " y su valor es " + notas[posMin] + ".");

	}

}
