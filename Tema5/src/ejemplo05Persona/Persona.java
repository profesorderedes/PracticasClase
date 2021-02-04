package ejemplo05Persona;

public class Persona {

	String nombre;
	String apellidos;
	String dni;
	int anyoNacimiento;

	// El mñetodo constructor de la clase Persona se ejecuta automáticamente
	// cada vez que se crea new Persona();

	Persona() {

	}

	Persona(String nombre, String apellidos) {

		// al DNI y al anyo, le pondremos valores predetermindos
		// DNI=desconocido y anyo=0
		this(nombre, apellidos, "DESCONOCIDO", 0);

	}

	// this. hace referencia al atributo(variableGlobal)

	Persona(String nombre, String apellidos, String dni, int anyoNacimiento) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anyoNacimiento = anyoNacimiento;

	}

	void mostrar() {

		System.out.println("Nombre : " + nombre);
		System.out.println("Apellidos : " + apellidos);
		System.out.println("DNI : " + dni);
		System.out.println("Año nacimiento : " + anyoNacimiento);

	}

}