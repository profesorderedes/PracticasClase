package condicionales;

import java.util.Scanner;

// Ejemplo de operador ternario
// Portero de discoteca
public class Ejemplo4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		int edad = entrada.nextInt();

		String respuesta;

		// variable = condición?valor_si_es_cierta:valor_si_es_falsa;

		respuesta = edad >= 18 ? "Puedes pasar." : "No puedes pasar.";

//		if(edad >= 18) {
//			respuesta = "Puedes pasar.";
//		} else {
//			respuesta = "No puedes pasar.";
//		}

		System.out.println(respuesta);

	}

}
