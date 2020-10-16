import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el nombre del artículo?");
		String articulo = entrada.nextLine();

		System.out.println("¿Cuál es el precio del artículo?");
		float precio = entrada.nextFloat();

		System.out.println("¿Qué descuento tiene? (Solo el número)");
		int descuento = entrada.nextInt();

		float cantidadDescontada = precio * descuento / 100;
		float precioDescontado = precio - cantidadDescontada;

		System.out.println(articulo + " tiene un precio de " + precio 
				+ ", con un descuento" + " de " + cantidadDescontada
				+ " €. Su precio final es de " + precioDescontado + " €");
	}

}