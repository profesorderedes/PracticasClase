package hoja1;

public class Ejer16 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double media = 0;
		int tempAltas = 0;

		System.out.println("Temperaturas:");
		System.out.println("-------------");

		for (int i = 0; i < temperaturas.length; i++) {

			media = media + temperaturas[i];

		}

		media = media / 14;

		System.out.println("\nTemperatura media: " + media + " ºC");

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > 12) {
				tempAltas++;
			}

		}

		System.out.println("Hay " + tempAltas + " temperaturas mayores de 12 ºC.");

	}

}