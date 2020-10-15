import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Buenas ta voy a calcular la media.");
		System.out.println("¿Cuál es tu nombre?");
		String nombre = entrada.nextLine();

		System.out.println("Ahora dime tu nota de la primera evaluación.");
		int nota1 = entrada.nextInt();

		System.out.println("Y la de la segunda.");
		int nota2 = entrada.nextInt();

		System.out.println("Por último la nota de la tercera.");
		int nota3 = entrada.nextInt();

		float media = (nota1 + nota2 + nota3) / 3.0f;

		System.out.println("Entonces esto te da una media total de " + media);

	}

}