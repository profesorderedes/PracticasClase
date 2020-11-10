package bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		do {
			
			System.out.println("Escribe un número entre el 1 y el 20.");
			num = entrada.nextInt();
			
		} while (num < 1 || num > 20);

		System.out.println("Tú número elegido es: " + num);

	}

}
