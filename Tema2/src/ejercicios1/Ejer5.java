package ejercicios1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige el idioma para el saludo: \n1) Francés\n2) Inglés\n3) Alemán\n4) Italiano\n");
		int numero = entrada.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Bonjour");
			break;
		case 2:
			System.out.println("Good morning");
			break;
		case 3:
			System.out.println("guten Morgen");
			break;
		case 4:
			System.out.println("Buongiorno");

		}
	}

}