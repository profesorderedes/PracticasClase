package condicionales;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el año: ");
		int anyo = entrada.nextInt();
		System.out.println("Escribe el número de mes:");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 días");
			break;
		case 2:
			// Si es divisible entre 4 pero no entre 100.
			// O
			// Si es divisible entre 100 y 400.
			// 1500 no bisiesto
			// 1600 bisiesto
			// 1700 no bisiesto
			if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {
				System.out.println("29 días");
			} else {
				System.out.println("28 días");
			}

			break;
		default:
			System.out.println("El número de mes no es válido.");
		}

	}

}
