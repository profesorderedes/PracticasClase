package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("dime el numero a multiplicar");
		int number = entrada.nextInt();

		int contador = 0;
		int resultado;
		
		while (contador < 11) {

			resultado = number * contador;

			System.out.println(number + "*" + contador + "=" + resultado);

			contador++;

		}

	}
}