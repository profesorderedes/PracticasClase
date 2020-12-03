
// Ejemplo de búsqueda en un array.
public class Ejemplo5 {

	public static void main(String[] args) {

		String mascotas[] = { "gato", "loro", "perro", "canario", 
				"hamster" };

		boolean encontrado = false;
		String elementoBuscado = "periquito";
		int i = 0;

		while (encontrado == false && i < mascotas.length) {
			
			if(mascotas[i].equals(elementoBuscado)) {
				
				System.out.println(elementoBuscado 
						+ " encontrado en la posición " + i + ".");
				encontrado = true;
				
			}
			
			i++;
			
		}
		
		// Informamos al usuario si no se ha encontrado el elemento buscado.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
