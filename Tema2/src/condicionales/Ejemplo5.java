package condicionales;

import java.util.Scanner;

/*
 Ejemplo de operador ternario
 Programa que pregunta un precio. Si ese precio es mayor de 50 euros, 
 aplica un descuento del 15%. Si no, no aplica descuento.
 Al final se mostrará el precio rebajado.
 */
public class Ejemplo5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio del producto? ");
		float precio = entrada.nextFloat();

		float descuento = precio > 50 ? 15 : 0;
//		float descuento;
//		if (precio > 50) {
//			descuento = 15;
//		} else {
//			descuento = 0;
//		}

		float precioFinal = precio - precio * descuento / 100;
		System.out.println("Precio rebajado: " + precioFinal + " €.");

	}

}
