import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float precio;
		float precios[] = new float[10];

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Escribe el precio " + i + ": ");
			precio = entrada.nextFloat();

			precios[i] = precio;

		}

		System.out.println("Los precios de tu compra son:");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}

	}

}