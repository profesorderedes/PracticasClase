package condicionales;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		//double cantidadParaDescuento = 50;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Precio: ");
		double precio = entrada.nextDouble();
		
		if(precio > 50) {
			
			// Haremos descuento de 10%.
			System.out.println("Tienes derecho a descuento.");
			precio = precio - (precio * 10 /100);
			
		}else {
			System.out.println("No tienes derecho a un descuento.");
			
		}
		
		System.out.println("El precio a pagar es " + precio + " €.");

	}

}
