package hoja1;

public class Ejer3 {

	public static void main(String[] args) {

		int numeros[] = new int[20];

		// Rellenamos el array con números aleatorios entre 1 y 10.
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (Math.random() * 10 + 1);

		}

		// Mostramos los valores almacenados en el array.
		System.out.println("Números generados:");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + " ");

		}

	}

}
