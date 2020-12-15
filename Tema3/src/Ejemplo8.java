
// Algoritmo de selección para ordenar un array.

public class Ejemplo8 {

	public static void main(String[] args) {

		int numeros[] = { 9, 4, 7, 6, 1, 8 };
		int aux; // Variable para intercambiar los valores de dos posiciones
		int posMin;

		// Recorremos el array desde la primera posición hasta la penúltima.
		// La última posición estará ordenada cuando el resto del array lo esté.
		for (int i = 0; i < numeros.length - 1; i++) {

			// La variable i nos indica desde qué punto del array hay que empezar
			// a buscar el mínimo.

			// Vamos a buscar el mínimo entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {

				// Comprobamos si el valor de la posición j es menor que el
				// de la posición posMin.
				if (numeros[j] < numeros[posMin]) {

					// La nueva posición del mínimo pasará a ser j.
					posMin = j;

				}

			}

			// Intercambiamos los valores de las posiciones i y posMin.
			// O sea, colocamos el valor más pequeño de la parte aún sin ordenar
			// del array, en la posición i.
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}

	}

}
















