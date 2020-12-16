package hoja2;

public class Ejer07 {

	public static void main(String[] args) {

		int audiencia[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < audiencia.length; i++) {

			if (audiencia[i] < audiencia[posMin]) {
				posMin = i;
			}

			if (audiencia[i] > audiencia[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La audiencia más alta es: " + audiencia[posMax] + ", en la posición " + posMax);
		System.out.println("La audiencia más baja es: " + audiencia[posMin] + ", en la posición " + posMin);

	}

}