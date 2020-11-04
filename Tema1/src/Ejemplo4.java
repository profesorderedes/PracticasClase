
public class Ejemplo4 {

	public static void main(String[] args) {

		// Conversiones implícitas.

		byte num1 = 100;

		short num2 = 2000;

		int num3 = num2;

		long num4 = 1090; // Ocupa 8 bytes

		float num5 = num4; // Ocupa 4 bytes, pero permite guardar números
							// más grandes que un long,
							// perdiendo precisión.

		double num6 = num5;

	}

}
