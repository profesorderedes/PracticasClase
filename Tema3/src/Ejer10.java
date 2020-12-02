import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[100];
		double precio;
		int i = 0;
		double total = 0;
		
		// Leemos los precios.
		do {
			System.out.println("Introduce el precio:");
			precio = entrada.nextDouble();

			precios[i] = precio;
			total = total + precio;
			i++;
		} while (precio != 0);

		// Mostramos los precios.
		System.out.println("\nPrecios de su compra.");
		i = 0;
		while (precios[i] != 0) {
			System.out.println(precios[i]);
			i++;
		}
		System.out.println("El total es:" + total);
	}

}