package hoja2;

// En esta versión indicamos todas las apariciones de las humedades mínima 
// y máxima.

public class Ejer08b {

	public static void main(String[] args) {

		int humedades[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };
		int posMin = 0;
		int min = 0;
		int posMax = 0;
		int max = 0;

		for (int i = 0; i < humedades.length; i++) {

			if (humedades[i] < humedades[posMin]) {

				posMin = i;
				min = humedades[i];

			}

			if (humedades[i] > humedades[posMax]) {

				posMax = i;
				max = humedades[i];

			}

		}

		System.out.println(
				"La humedad relativa mínima del dia ha sido del " + humedades[posMin] + "% a las " + posMin + "h.");
		for (int i = 0; i < humedades.length; i++) {
			if (humedades[i] == min && i != posMin) {
				System.out.println("Hay otra humedad relativa del " + humedades[posMin] + "% a las " + i + "h.");
			}
		}

		System.out.println(
				"La humedad relativa máxima del dia ha sido del " + humedades[posMax] + "% a las " + posMax + "h.");
		for (int i = 0; i < humedades.length; i++) {
			if (humedades[i] == max && i != posMax) {
				System.out.println("Hay otra humedad relativa máxima del " + humedades[posMax] + "% a las " + i + "h.");
			}
		}

	}

}