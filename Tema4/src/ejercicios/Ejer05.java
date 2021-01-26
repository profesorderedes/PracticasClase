package ejercicios;

public class Ejer05 {

	public static void main(String[] args) {

		int numeros[] = { 3, 9, 5, 2, 3, 8, 5, 12, 7, 6 };

		int numerosOrdenados[]  = numOrdenados(numeros);
		
		for (int i = 0; i < numerosOrdenados.length; i++) {
			System.out.print(numerosOrdenados[i] + " ");
		}

	}

	static int[] numOrdenados(int valores[]) {

		int posMin, aux;

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

		}
		
		return valores;

	}

}