package ejercicio.cuentabancaria.cliente;

import java.util.Date;

public abstract class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Lo hemos creado tipo Date...
	private Date fechaNacimiento;
	//pero para darle una mayor sencillez al ejemplo, otra opción era haberlo creado String directamente
	//es decir
	//private String fechaNacimiento;
	
	public Persona(String nombre, String apellidos, String dni, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "La persona se llama " + nombre + ", " + apellidos + ", su dni es: " + dni + " y su fecha de nacimiento es " + fechaNacimiento.toString();
	}
	

}
