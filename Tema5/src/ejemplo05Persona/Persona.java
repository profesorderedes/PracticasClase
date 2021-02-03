package ejemplo05Persona;

public class Persona {

	String nombre;
	String apellidos;
	String dni;
	int anyoNacimiento;

	// El método constructor de la clase Persona se ejecuta automáticamente
	// cada vez que se crea (new) un objeto Persona.
	Persona() {
		System.out.println("Creando un objeto Persona...");
	}

	void mostrar() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("Año de nacimiento: " + anyoNacimiento);

	}

}
