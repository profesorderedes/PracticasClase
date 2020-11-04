package condicionales;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		int edad = entrada.nextInt();

		boolean mayorDeEdad = edad >= 18 ? true : false;

		System.out.println(mayorDeEdad);

	}

}