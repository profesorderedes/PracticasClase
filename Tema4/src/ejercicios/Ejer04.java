package ejercicios;

public class Ejer04 {

	public static void main(String[] args) {

		int numeros[] = { 3, 9, 5, 2, 3, 8, 5, 12, 7, 6 };

		numOrdenados(numeros);

	}

	static void numOrdenados(int valores[]) {

		int posMin, aux;

		System.out.println("Números ordenados ");

		for (int i = 0; i < valores.length; i++) {

			posMin = i;

			for (int j = i + 1; j < valores.length; j++) {

				if (valores[j] < valores[posMin]) {

					posMin = j;

				}

			}

			aux = valores[i];

			valores[i] = valores[posMin];

			valores[posMin] = aux;

			System.out.print(valores[i] + " ");

		}

	}

}