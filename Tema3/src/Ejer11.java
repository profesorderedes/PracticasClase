import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String ordenes[] = new String[1000];
		String orden;

		// Leemos los datos.
		System.out.println("Escribe una de estas órdenes: izquierda, derecha, arriba, abajo, matar");
		orden = entrada.nextLine();
		ordenes[0] = orden;

		int i = 1;
		while (!orden.equals("ejecutar")) {

			System.out.print("Escribe la orden: ");
			orden = entrada.nextLine();

			ordenes[i] = orden;
			i++;
		}

		// Mostramos los datos.
		i = 0;

		System.out.println("\nListado de comandos: ");

		while (!ordenes[i].equals("ejecutar")) {
			System.out.println(ordenes[i]);
			i++;
		}
	}

}