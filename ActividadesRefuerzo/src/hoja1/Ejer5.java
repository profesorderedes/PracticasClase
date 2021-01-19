package hoja1;

public class Ejer5 {

	public static void main(String[] args) {

		String[][] socios = { { "Manuela", "30", "70.5" }, { "Ramón", "35", "82" }, { "Juan", "20", "77" },
				{ "Daniel", "28", "90.2" } };
		int posEdadMin = 0;
		int posPesoMax = 0;
		float pesoMedio = 0;

		// Mostramos los datos en la pantalla.
		System.out.println("Listado de socios del gimnasio");
		System.out.println("==========================================");
		System.out.println("NOMBRE\tEDAD\tPESO");

		for (int fila = 0; fila < socios.length; fila++) {

			System.out.println(socios[fila][0] + "\t" + socios[fila][1] + "\t" + socios[fila][2]);

		}

		// Buscamos el socio de menor edad.
		for (int fila = 1; fila < socios.length; fila++) {

			if (Float.parseFloat(socios[fila][1]) < Float.parseFloat(socios[posEdadMin][1])) {
				posEdadMin = fila;
			}

		}

		System.out.println(
				"\nEl socio más joven es " + socios[posEdadMin][0] + ", con " + socios[posEdadMin][1] + " años.");

		// Buscamos el socio con mayor peso.
		for (int fila = 1; fila < socios.length; fila++) {

			if (Float.parseFloat(socios[fila][2]) > Float.parseFloat(socios[posPesoMax][2])) {
				posPesoMax = fila;
			}

		}

		System.out
				.println("El socio más pesado es " + socios[posPesoMax][0] + ", con " + socios[posPesoMax][2] + " kg.");

		// Calculamos el peso medio.
		for (int fila = 0; fila < socios.length; fila++) {

			pesoMedio = pesoMedio + Float.parseFloat(socios[fila][2]);

		}
		
		pesoMedio = pesoMedio / 4;

		System.out.println("El peso medio de los socios del gimnasio es " + pesoMedio + " kg.");

	}

}