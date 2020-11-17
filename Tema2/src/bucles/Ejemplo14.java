package bucles;

import java.util.Scanner;

// Ejemplo de break.

public class Ejemplo14 {
	
	public static void main(String[] args) {
		
		// Programa que va pidiendo nombres hasta que el usuario
		// escribe "parar".
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		
		while(!nombre.equals("parar")) {
			
			System.out.println("Nombre: ");
			nombre = entrada.nextLine();
			
		}
		
		System.out.println("Por fin has escrito parar.");
		
	}

}
