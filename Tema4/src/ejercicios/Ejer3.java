package ejercicios;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		System.out.println("Mi nombre es " + mostrar());

	}

	static String mostrar() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nombre");

		String nombre = entrada.nextLine();

		return nombre;

	}

}