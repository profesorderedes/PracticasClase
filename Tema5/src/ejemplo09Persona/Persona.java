package ejemplo09Persona;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private int anyoNacimiento;

	Persona() {

	}

	Persona(String nombre, String apellidos) {

		this(nombre, apellidos, "DESCONOCIDO", 0);

	}

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
	
	// Métodos de acceso.
	String getNombre() {
		return nombre;
	}
	
	String getApellidos() {
		return apellidos;
	}

}

























