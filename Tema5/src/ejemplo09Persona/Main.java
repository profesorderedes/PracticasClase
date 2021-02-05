package ejemplo09Persona;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Carlos", "Martínez Solís", "22019100K", 1980);

		Persona p2 = new Persona("Miguel", "Sánchez Ramos", "10000119K", 1985);

		p2.mostrar();

		System.out.println();

		Persona p3 = new Persona("Antonio", "López Aragón");
		p3.mostrar();
		
		System.out.println("\nEl nombre de la persona 3 es " + p3.getNombre());
		System.out.println("Los apellidos de la persona 3 son " 
				+ p3.getApellidos());
		System.out.println("El DNI de la persona 3 es " 
				+ p3.getDni());
		System.out.println("El año de nacimiento de la persona 3 es " 
				+ p3.getAnyoNacimiento());

	}

}
