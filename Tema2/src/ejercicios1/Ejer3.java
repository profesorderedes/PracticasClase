package ejercicios1;

import java.util.Scanner;

/* Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o "No es impar".
Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String el resultado y mostrando después esta variable. */

public class Ejer3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número y te diré si es par o impar: ");
		int num = entrada.nextInt();

		String resultado = (num % 2 == 0) ? "Este número es par." : "Este número es impar.";
		System.out.println(resultado);

	}

}