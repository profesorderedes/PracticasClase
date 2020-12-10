package hoja1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		/*
		 * 7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo
		 * las diez notas desde la consola, mediante un bucle while, y guardándolas en
		 * el array. A continuación, muestra las diez notas.8.- Modifica el programa
		 * anterior para que el programa pare de pedir notas si se le pasa un valor
		 * negativo.
		 */

		Scanner entrada = new Scanner(System.in);
		int i = 0;
		// Crear un array de 10 elementos.
		double notas[] = new double[10];
		double nota = 0;
		boolean notaNegativa = false;

		// Pedir notas.
		while (i < notas.length && !notaNegativa) {

			System.out.println("Escribe la nota número " + i + ": ");
			nota = entrada.nextDouble();

			if (nota < 0) {
				notaNegativa = true;
			} else {
				notas[i] = nota;
				i++;
			}
		}

		// Mostrar notas.
		for (i = 0; i < notas.length; i++) {

			if (notas[i] == 0) {
				break;
			}

			// Ejemplo de cómo podemos hacer que las notas se muestren
			// redondeadas sin decimales.
			System.out.printf("La nota %d es: %.0f\n", i, notas[i]);

		}
	}
}
