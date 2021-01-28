package ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };
		int posicion = buscar(planetas, "Plutón");
		
		if(posicion == -1) {
			System.out.println("No se ha encontrado la palabra.");
		}else {
			System.out.println("La palabra buscada se encuentra en la posición " 
					+ posicion + ".");
		}

	}

	static int buscar(String palabras[], String palabra) {

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(palabra)) {
				return i;
			}
		}

		return -1;

	}

}