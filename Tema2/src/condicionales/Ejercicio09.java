package condicionales;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Precio: ");
		float precio = entrada.nextFloat();
		
		System.out.print("Unidades: ");
		int unidades = entrada.nextInt();
		
		float total = precio * unidades;
		
		if(total < 100) {
			System.out.println("No hay descuento.");
		} else if (total >= 100 && total <= 200) {
			System.out.println("Hay un descuento del 10%");
			total = total - total * 10 / 100;
		} else {
			System.out.println("Hay un descuento del 15%");
			total = total - total * 15 / 100;
		}
		
//		if(total < 100) {
//			System.out.println("No hay descuento.");
//		} else if (total > 200) {
//			total = total - total * 15 / 100;
//		} else {
//			total = total - total * 10 / 100;
//		}
		
		System.out.println("Total de la compra: " + total + " €.");

	}

}
