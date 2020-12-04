package hoja1;

public class Ejer13 {

	public static void main(String[] args) {

		int potencias[] = new int[20];
		int potencia = 1;

		for (int i = 0; i < potencias.length; i++) {

			potencia = potencia * 2;
			potencias[i] = potencia;

		}

		for (int i = 0; i < potencias.length; i++) {
			System.out.println(potencias[i]);
		}

	}

}
