package hoja2;

public class Ejer09 {

	public static void main(String[] args) {

		double precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };
		double aux;
		int posMin;

		// Recorremos el array desde el principio hasta la penúltima posición.
		for (int i = 0; i < precios.length - 1; i++) {

			// Buscamos el menor elemento entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < precios.length; j++) {

				if (precios[j] < precios[posMin]) {
					posMin = j;
				}

			}

			// Intercambiamos el menor elemento (posición posMin) con
			// la posición i.
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

		}

		System.out.println("Array ordenado:");
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + " ");
		}

	}

}
