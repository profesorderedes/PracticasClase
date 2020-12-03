package hoja1;
import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double notas[] = new double[10];
		double nota;
		int i = 0;

		while (i < notas.length) {

			System.out.print("Nota " + (i + 1) + ": ");
			nota = entrada.nextDouble();

			notas[i] = nota;
			i++;

		}

		System.out.println("\nNotas almacenadas:");
		for (int j = 0; j < notas.length; j++) {

			System.out.println(notas[j]);

		}

	}

}
