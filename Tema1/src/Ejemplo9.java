import java.util.Scanner;

public class Ejemplo9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();

		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();

		System.out.println("\nHola, " + nombre + ", no parece que tengas " + edad + " años.");

	}

}
