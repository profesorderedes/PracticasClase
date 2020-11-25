package bucles;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número:");
		int num = entrada.nextInt();

		int resultado;

		for (int i = 1; i <= 10; i++) {

			resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);

		}

	}
}
