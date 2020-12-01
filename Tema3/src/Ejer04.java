public class Ejer04 {

	public static void main(String[] args) {

		/*
		 * 
		 * 4.- Crea un array llamado companyeros con 4 posiciones y ve asignando a cada
		 * 
		 * una de ellas el nombre de uno de los cuatro compañeros más cercanos a tu
		 * 
		 * sitio. Haz que después se muestren todos los valores mediante un bucle for.
		 * 
		 */

		String posiciones[] = new String[4];

		posiciones[0] = "Jordi";
		posiciones[1] = "Erik";
		posiciones[2] = "Sergio";
		posiciones[3] = "Jose";

		for (int i = 0; i < posiciones.length; i++) {

			System.out.println(posiciones[i]);

		}

	}

}