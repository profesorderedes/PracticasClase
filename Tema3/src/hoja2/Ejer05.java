package hoja2;

public class Ejer05 {

	public static void main(String[] args) {

		double temp[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < temp.length; i++) {

			if (temp[i] < temp[posMin]) {

				posMin = i;

			}

			if (temp[i] > temp[posMax]) {

				posMax = i;

			}

		}

		System.out.println("La temperatura más alta es: " + temp[posMax] + "ºC, en la posición " + posMax);

		System.out.println("La temperatura más Baja es: " + temp[posMin] + "ºC, en la posición " + posMin);

	}

}