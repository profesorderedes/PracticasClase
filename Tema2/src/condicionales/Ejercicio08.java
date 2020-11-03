package condicionales;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se dice ordenador en inglés?");
		String ordenador = entrada.nextLine();

		if (ordenador.equals("computer")) {
			System.out.println("Enhorabuena, esa era la palabra correcta.");
		} else {
			System.out.println("Lo siento, puedes buscar la palabra en el traductor");
		}

	}

}