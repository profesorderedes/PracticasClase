package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * 
	 * 12.- Desarrolla modularmente (usando tres métodos, además de main( )) un
	 * 
	 * programa que solicite por consola una lista de números enteros, los ordene y
	 * 
	 * los muestre en pantalla.
	 * 
	 */

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numeros[] = new int[8];

		introduceNumeros(numeros);

		ordenaNumeros(numeros);

		muestraNumeros(numeros);

	}

	static void introduceNumeros(int numeros[]) {

		System.out.println("Introduce 8 números enteros.");

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = entrada.nextInt();

		}

	}

	static void ordenaNumeros(int numeros[]) {

		int aux, posMin = 0;

		for (int i = 0; i < numeros.length; i++) {

			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {

					posMin = j;

				}

			}

			aux = numeros[i];

			numeros[i] = numeros[posMin];

			numeros[posMin] = aux;

		}

	}

	static void muestraNumeros(int numeros[]) {

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] + " ");

		}

	}

}