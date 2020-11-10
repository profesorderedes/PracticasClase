package bucles;

public class Ejercicio14c {

	public static void main(String[] args) {

		for (int num = 1; num < 500; num++) {

			int resto = num % 3;
			if (resto == 0) {
				System.out.println(num);
			}

		}

	}

}
