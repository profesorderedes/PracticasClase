package ejercicios;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un año: ");
		int anyo = entrada.nextInt();
		
		if (anyoBisiesto(anyo)) {
			System.out.println(anyo + " es bisiesto.");
		} else {
			System.out.println(anyo + " no es bisiesto.");
		}

	}

	static boolean anyoBisiesto(int anyo) {

		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0)
			return true;
		else
			return false;

	}
}