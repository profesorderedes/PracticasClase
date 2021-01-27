package ejercicios;

public class Ejercicio08 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 100;

		System.out.println("El número más alto entre " + num1 + " y " + num2 
				+ " es " + max(num1, num2) + ".");
		System.out.println("El número más bajo entre " + num1 + " y " + num2 
				+ " es " + min(num1, num2) + ".");

	}

	static int max(int x, int y) {

		if (x < y) {
			return y;
		} else {
			return x;
		}

	}

	static int min(int x, int y) {

		if (x > y) {
			return y;
		} else {
			return x;
		}

	}

}
