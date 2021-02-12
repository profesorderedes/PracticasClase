package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int fechaNacimiento; // año

	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
	}

	public Autor(String nombre, String email, int anyo) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = anyo;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	public String toString() {
		return "\tNombre: " + nombre + "\n\tEmail: " + email 
				+ "\n\tAño de nacimiento: " + fechaNacimiento;
	}

}















