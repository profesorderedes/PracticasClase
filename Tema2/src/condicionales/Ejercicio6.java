package condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio del producto: ");
		float precio = entrada.nextFloat();

		System.out.print("Número de unidades: ");
		int unidades = entrada.nextInt();

		float total = precio * unidades;

		if (total > 75) {
			total = total - total * 15 / 100;
		}else {
			total = total - total * 5 / 100;
		}
		
		System.out.println("Total a pagar: " + total + " €.");

	}

}
