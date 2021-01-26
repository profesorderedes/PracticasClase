package ejercicios;

import java.util.Scanner;

public class Ejer3 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Mi nombre es " + mostrar());

	}

	static String mostrar() {

		System.out.println("Escribe tu nombre");

		String nombre = entrada.nextLine();

		return nombre;

	}

}