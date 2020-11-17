package bucles;

public class Ejercicio9 {

	public static void main(String[] args) {

		int dividendo = 30;
		int divisor = 7;

		int resta = dividendo - divisor;

		System.out.println(dividendo + " - " + divisor + " = " + resta);

		while (resta >= divisor) {

			dividendo = resta;
			resta = dividendo - divisor;
			System.out.println(dividendo + " - " + divisor + " = " + resta);

		}

		System.out.println("Resto de la división: " + resta);

	}

}
