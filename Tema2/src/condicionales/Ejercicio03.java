package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio: ");
		float precio = entrada.nextFloat();

		if (precio > 80) {
			precio = precio - precio * 10 / 100;
		}
		
		if(precio < 5) {
			precio = precio + 2;
		}

		System.out.println("Precio final: " 
				+ precio + " €.");

	}

}
