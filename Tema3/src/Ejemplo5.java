
// Ejemplo de búsqueda en un array.
public class Ejemplo5 {

	public static void main(String[] args) {

		String mascotas[] = { "gato", "loro", "perro", "canario", "hamster" };

		boolean encontrado = false;
		String elementoBuscado = "perro";
		int i = 0;

		while (!encontrado && i < mascotas.length) {

			if (mascotas[i].equals(elementoBuscado)) {

				System.out.println(elementoBuscado + " encontrado en la posición " + i + ".");
				encontrado = true;

			}

			i++;

		}

		// Informamos al usuario si no se ha encontrado el elemento buscado.
		if (!encontrado) {
			System.out.println("No se ha encontrado el " + elementoBuscado);
		}

	}
}
