package bucles;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota;
		for (int i = 1; i <= 5; i++) {

			System.out.print("Nota? ");
			nota = entrada.nextDouble();

			while (nota < 0 || nota > 10) {

				System.out.println("La nota no es correcta. Tiene que " + "estar entre 0 y 10.");
				System.out.print("Nota? ");
				nota = entrada.nextDouble();

			}

		}

	}

}
