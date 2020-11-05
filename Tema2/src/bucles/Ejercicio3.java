package bucles;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		int num = entrada.nextInt();
		
		while(num < 1 || num > 10 ) {
			
			System.out.print("Escribe un número: ");
			num = entrada.nextInt();
			
		}
		
		System.out.println(num);
		
	}

}
