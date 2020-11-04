package condicionales;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nombre:");
		String nombre = entrada.nextLine();

		nombre = nombre.equals("") ? "Desconocido" : nombre;

//		if (nombre.equals("")) {
//			nombre = "Desconocido";
//		} else {
//			// Nada
//		}

		System.out.println(nombre);

	}

}
