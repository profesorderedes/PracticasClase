package bucles;

import java.util.Scanner;

public class Ejercicio18b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 1;
		while (i <= 5) {
			System.out.println("Dime una nota:");

			int nota = entrada.nextInt();

			if (nota < 0 || nota > 10) {
				System.out.println(nota + " no es una nota válida, por favor, intentelo de nuevo");
				i--;
			}
			
			i++;
			
		}
	}

}