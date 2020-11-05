package bucles;

// Muestra los números del 500 al 10, bajando de 10 en 10.
public class Ejemplo06 {

	public static void main(String[] args) {

		int contador = 500;

		while (contador >= 10) {

			System.out.println(contador);
			contador = contador - 10; // También podría ser contador -= 10

		}

		System.out.println("De nada.");

	}

}
