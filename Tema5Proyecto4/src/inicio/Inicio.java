package inicio;

import java.util.Scanner;

// Con asterisco importa todo lo que hay en el package biblioteca.   
import biblioteca.*;

public class Inicio {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Vamos a dar de alta un libro escrito por dos autores.

		// Leemos los datos del primer autor.
		Autor autor1 = pedirAutor();

		System.out.println(autor1.toString());

		// Leemos los datos del segundo autor.
		entrada.nextLine();

		Autor autor2 = pedirAutor();

		System.out.println(autor2.toString());

		// Creamos el objeto libro cuyos autores son autor1 y autor2.

		Autor autores[] = new Autor[2];
		autores[0] = autor1;
		autores[1] = autor2;

		entrada.nextLine();
		System.out.print("\nTítulo del libro: ");
		String titulo = entrada.nextLine();

		System.out.print("ISBN del libro: ");
		String isbn = entrada.nextLine();

		Libro libro1 = new Libro(titulo, isbn, autores);
		
		System.out.println(libro1.toString());
		
		libro1.muestraAutores();
		
		

	}

	static Autor pedirAutor() {

		System.out.println("Introduce los datos del primer autor.");

		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();

		System.out.print("Email: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento: ");
		int anyoNacimiento = entrada.nextInt();

		Autor autor = new Autor(nombre, email, anyoNacimiento);

		return autor;

	}

}