package inicio;

import java.util.Scanner;

// Con asterisco importa todo lo que hay en el package biblioteca.   
import biblioteca.*;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Vamos a dar de alta un libro escrito por dos autores.

		// Leemos los datos del primer autor.
		System.out.println("Introduce los datos del primer autor.");

		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();

		System.out.print("Email: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento: ");
		int anyoNacimiento = entrada.nextInt();

		Autor autor1 = new Autor(nombre, email, anyoNacimiento);
		System.out.println(autor1.toString());

		// Leemos los datos del segundo autor.
		System.out.println("Introduce los datos del segundo autor.");

		entrada.nextLine();

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Email: ");
		email = entrada.nextLine();

		System.out.print("Año de nacimiento: ");
		anyoNacimiento = entrada.nextInt();

		Autor autor2 = new Autor(nombre, email, anyoNacimiento);
		System.out.println(autor2.toString());

		// Creamos el objeto libro cuyos autores son autor1 y autor2.

		Autor autores[] = new Autor[2];
		autores[0] = autor1;
		autores[1] = autor2;
		
		System.out.print("\nTítulo del libro: ");
		String titulo = entrada.nextLine();
		
		System.out.print("\nTítulo del libro: ");
		String isbn = entrada.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * System.out.println("Introduce los datos de un libro.");
		 * 
		 * System.out.print("Título: "); entrada.nextLine(); String titulo =
		 * entrada.nextLine();
		 * 
		 * System.out.print("ISBN: "); String isbn = entrada.nextLine();
		 * 
		 * Libro libro1 = new Libro(titulo, isbn, autor1);
		 * 
		 * System.out.println("Datos del autor: " + autor1.toString());
		 * System.out.println("Datos del libro: " + libro1.toString());
		 */
	}

}