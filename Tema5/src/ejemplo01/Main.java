package ejemplo01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		p1.nombre = "Carlos";
		p1.apellidos = "Martínez Solís";
		p1.dni = "22019100K";
		p1.anyoNacimiento = 1980;
		
		Persona p2; // Declarar una variable de tipo Persona
		
		p2 = new Persona(); // Inicializar la variable asignándole
							// un objeto nuevo de la clase Persona.
		
		p2.nombre = "Manuela";
		p2.apellidos = "Santos López";
		p2.dni = "10992299L";
//		p2.anyoNacimiento = 1985;
		
		
		System.out.println("Datos de p1:");
		p1.mostrar();
		
		System.out.println("\nDatos de p2:");
		p2.mostrar();
		
		
	}

}














