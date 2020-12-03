public class Ejer15 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double media = 0;

		System.out.println("Temperaturas:");
		System.out.println("-------------");

		for (int i = 0; i < temperaturas.length; i++) {

			System.out.println(temperaturas[i]);

		}
		for (int i = 0; i < temperaturas.length; i++) {

			media = media + temperaturas[i];

		}

		media = media / 14;

		System.out.println("\nTemperatura media: " + media + " ºC");

	}

}