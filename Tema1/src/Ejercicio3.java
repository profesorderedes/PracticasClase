import java.util.Scanner;

public class Ejercicio3 {
	// 3. Crea un programa que haga la división entera entre dos números
	// (devolviendo cociente y resto).

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"\tHola soy tu calculadora 1.3" + "\n(hago divisiones y te entrego el cociente " + "y el resto)");
		System.out.println("Introduzca el dividendo, por favor.");
		int dividendo = entrada.nextInt();

		System.out.println("Introduzca el divisor");
		int divisor = entrada.nextInt();

		System.out.println("El cociente de su división es: " + (dividendo / divisor) + "\nEl resto de su división es: "
				+ (dividendo % divisor));

	}

}
