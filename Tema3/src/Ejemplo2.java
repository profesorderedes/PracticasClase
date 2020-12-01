
public class Ejemplo2 {

	public static void main(String[] args) {

		String nombres[] = { "Jordi", "Erik", "Sergio", "Jose", "Jorge", 
				"Ismael", "Enrique" };

		System.out.println("Listado de alumnos de 1º de ciclo superior");
		System.out.println("================================================");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("  " + nombres[i]);
		}

	}

}
