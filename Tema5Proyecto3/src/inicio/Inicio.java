package inicio;

import java.util.*;

import biblioteca.*;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ALTA DE LIBROS EN LA BIBLIOTECA\n");

		System.out.println("Introduce los datos del autor");
		System.out.println("=============================");
		System.out.print("Nombre: ");

		String nombre = entrada.nextLine();

		System.out.print("Email: ");
		String email = entrada.nextLine();
		
		System.out.print("Año de nacimiento: ");
		int fechaNacimiento = entrada.nextInt();
		
		Autor autor1 = new Autor(nombre, email, fechaNacimiento);
		
		System.out.println("Introduce los datos del libro");
		System.out.println("=============================");
		
		entrada.nextLine();
		
		System.out.println("Introduce el titulo");

		String titulo = entrada.nextLine();

		System.out.println("Introduce el isbn");

		String isbn = entrada.nextLine();

		Libro libro1 = new Libro(titulo, isbn, autor1);

		System.out.println("Información del libro: " + libro1.toString());

	}

}