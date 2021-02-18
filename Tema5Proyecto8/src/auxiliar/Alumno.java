package auxiliar;

import java.util.Scanner;

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
	
	public void leeDatos() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Número de expediente: ");
		numExpediente = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();
		
		System.out.print("Nombre: ");
		nombre = entrada.nextLine();
		
		System.out.print("Grupo: ");
		
		System.out.print("Id del grupo: ");
		int id = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Nivel del grupo: ");
		String nivel = entrada.nextLine();
		
		System.out.print("Clase del grupo: ");
		String clase = entrada.nextLine();
		
		System.out.print("Curso del grupo: ");
		int curso = entrada.nextInt();
		
		Grupo grupo1 = new Grupo(id,nivel,curso,clase);
		grupo = grupo1;
		
	}

	
	
}



















