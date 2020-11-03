package condicionales;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué sueldo tienes?");
		float sueldo = entrada.nextFloat();

		// Si el sueldo es mayor de 1500, el programa lo considerará bueno.
		if (sueldo > 1500) {
			System.out.println("Me parece un buen sueldo.");
			System.out.println("Enhorabuena.");
		}

		System.out.println("Gracias.");

	}

}
