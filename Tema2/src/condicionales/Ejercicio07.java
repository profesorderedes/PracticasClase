package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

//		7.- Juego de adivinar el número secreto. El ordenador nos preguntará un número del 1 al 10. 
//		Si coincide con el número secreto (que habrás codificado como una constante entera) nos felicitará. 
//		Si no, nos dirá que hemos fallado.

		Scanner entrada = new Scanner(System.in);
		int numero;
		final int NUMERO_SECRETO = 5;

		System.out.println("Adivina el número secreto: escribe un número " + "del 1 al 10");
		numero = entrada.nextInt();

		if (numero == NUMERO_SECRETO) {
			System.out.println("!!Felicidades!!, lo has adivinado");
		} else {
			System.out.println("Has fallado, otra vez será.");
		}

	}

}