package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un carácter, por favor:");
		String caracter = entrada.nextLine();
		
		int contador = 1;
		while(contador <= 100) {
			
			System.out.println(caracter);
			contador++;
			
		}
	}
}
