package auxiliar;

import java.util.Scanner;

public class Grupo {

	private int id; // Identificador grupo
	private String nivel; // ESO, BACHILLERATO, etc
	private int curso; // 1º, 2º, etc
	private String clase; // A, B, etc

	public Grupo() {

	}

	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}

	public String toString() {

		return "Id: " + id + ", " + curso + "º " + nivel + " " + clase;

	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Datos del grupo");
		System.out.println("============================");

		System.out.print("Id: ");
		id = entrada.nextInt();

		entrada.nextLine();

		System.out.print("Nivel (ESO, BACHILLERATO, ...): ");
		nivel = entrada.nextLine();

		System.out.print("Curso (1, 2, ...): ");
		curso = entrada.nextInt();

		entrada.nextLine();

		System.out.print("Clase (A, B, ...): ");
		clase = entrada.nextLine();

	}

	public String getNivel() {
		return nivel;
	}

	public int getCurso() {
		return curso;
	}

	public String getClase() {
		return clase;
	}

}
