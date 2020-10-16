import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cual es el nombre del artículo?");
		String articulo = entrada.nextLine();

		System.out.println("¿Cual es el precio del artículo?");
		float precio = entrada.nextFloat();

		System.out.println("¿Cuantas unidades has comprado?");
		int unidades = entrada.nextInt();

		float precioTotal = precio * unidades;

		System.out.println("El precio total de su compra es de " 
				+ precioTotal + " €");

	}

}
