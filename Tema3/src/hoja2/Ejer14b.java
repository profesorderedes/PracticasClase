package hoja2;

public class Ejer14b {

	public static void main(String[] args) {

		String precios[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };
		float precio;
		float total = 0;

		// Mostramos la tabla en pantalla.
		for (int fila = 0; fila < precios.length; fila++) {

			for (int col = 0; col < precios[0].length; col++) {

				System.out.print(precios[fila][col] + "\t");

			}

			System.out.println();
			
			// Vamos calculando el total de la columna 1 (precios).
			precio = Float.parseFloat(precios[fila][1]);

			total = total + precio;

		}

		System.out.println("Precio total: " + total);

	}

}
