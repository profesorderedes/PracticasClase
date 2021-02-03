package ejemplo05Persona;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona();

		p1.nombre = "Carlos";
		p1.apellidos = "Martínez Solís";
		p1.dni = "22019100K";
		p1.anyoNacimiento = 1980;

		Persona p2 = new Persona("Miguel", "Sánchez Ramos", "10000119K", 1985);
		
//		Persona p2 = new Persona();
//		p2.nombre = "Miguel";
//		p2.apellidos = "Sánchez Ramos";
//		p2.dni = "10000119K";
//		p2.anyoNacimiento = 1985;
		
		p2.mostrar();
		
		System.out.println();
		
		Persona p3 = new Persona("Antonio", "López Aragón");
		p3.mostrar();

	}

}
