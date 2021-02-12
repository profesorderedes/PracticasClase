package inicio;

import biblioteca.*;

public class Inicio {

	public static void main(String[] args) {

		/*
		Ejercicio:
		
		- Pedir al usuario los datos de un autor.
		- Pedir al usuario el título, el isbn y el año actual de un libro.
		- Crear el objeto Libro que tendrá como autor el que se ha introducido
			antes.
		- Ejecutar el toString() del libro.
		 */

		Autor autor1 = new Autor("Manuel", "manuel@gmail.com", 1970);
//		System.out.println(autor1.toString());

		autor1.setFechaNacimiento(1989);
//		System.out.println(autor1.toString());

		Autor autor2 = new Autor("Maria");

		Libro libro1 = new Libro("Crónicas", "1910-110-1-11-1", autor1);

		System.out.println(libro1.toString());

	}

}
