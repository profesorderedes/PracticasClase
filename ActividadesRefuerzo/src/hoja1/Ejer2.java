package hoja1;

public class Ejer2 {

	public static void main(String[] args) {

		int numeros[] = { 48, 120, 56, -23, 0, 0, 20, -4 };
		int positivos = 0, negativos = 0, ceros = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] < 0) {
				negativos++;
			} else if (numeros[i] > 0) {
				positivos++;
			} else {
				ceros++;
			}

		}

		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + ceros);

	}

}