package bucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce 5 notas");

		float nota;
		float suma = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Introduce el siguiente: ");
			nota = entrada.nextFloat();

			while (nota < 0 || nota > 10) {

				System.out.print("Nota introducida incorrecta. \nIntroduce una correcta: ");
				nota = entrada.nextFloat();

			}

			suma = nota + suma;

		}
		System.out.println("La media es: " + suma / 5);
	}
}