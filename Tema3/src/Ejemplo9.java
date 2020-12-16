
public class Ejemplo9 {

	public static void main(String[] args) {

		int numeros[] = new int[1000];

		// Rellenamos con números aleatorios entre 1 y 10000.
		System.out.println("Rellenando el array...");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10000 + 1);
		}

		// Ordenamos el array.
		int aux;
		int posMin;

		System.out.println("\nOrdenando...");
		for (int i = 0; i < numeros.length - 1; i++) {

			// Fase de búsqueda.
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			// Fase de intercambio.
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}
		
		System.out.println("\nMostrando el array ordenado...");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
