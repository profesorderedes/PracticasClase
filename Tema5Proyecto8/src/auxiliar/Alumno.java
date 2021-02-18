package auxiliar;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public String toString() {

		return "Núm. expediente: " + numExpediente + ", " + nombre + " " 
				+ apellidos + ", grupo: " + grupo.getCurso()
				+ "º " + grupo.getNivel() + " " + grupo.getClase();

	}

	
	
}
