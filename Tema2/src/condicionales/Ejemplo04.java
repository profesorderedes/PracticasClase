package condicionales;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Aplicación que pregunte un número que será la categoría salarial
		// de un empleado y responde indicando el salario que le
		// corresponde.

		System.out.print("Categoría salarial? ");
		int categoria = entrada.nextInt();

		switch (categoria) {
		case 1:
			System.out.println("Salario = 1000 €");
		case 2:
			System.out.println("Salario = 1500 €");
		case 3:
			System.out.println("Salario = 2000 €");
			break;
		default:
			System.out.println("Salario = 2500 €");
		}

//		if (categoria == 1) {
//			System.out.println("Salario = 1000 €");
//		} else if (categoria == 2) {
//			System.out.println("Salario = 1500 €");
//		} else if (categoria == 3) {
//			System.out.println("Salario = 2000 €");
//		} else {
//			System.out.println("Salario = 2500 €");
//		}

	}

}
