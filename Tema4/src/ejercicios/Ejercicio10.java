package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el número del mes: ");
		mesNumero(entrada.nextInt());

	}

	static void mesNumero(int numero) {

		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
				"Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		if (numero < 0 || numero > 12) {
			return;
		}
		
		System.out.println(meses[numero - 1]);

	}
}