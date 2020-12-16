package hoja2;

public class Ejer08 {

	public static void main(String[] args) {

		double hum[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 
				70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < hum.length; i++) {

			if (hum[i] < hum[posMin]) {

				posMin = i;

			}

			if (hum[i] > hum[posMax]) {

				posMax = i;

			}

		}

		System.out.println("El mayor valor de humedad es: " + hum[posMax] 
				+ ", a las " + posMax);

		System.out.println("El menor valor de humedad es: " + hum[posMin] 
				+ ", a las " + posMin);
	}

}