package hoja2;

public class Ejer15 {

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

		}

		// Averiguamos el precio total de los artículos.
		for (int fila = 0; fila < precios.length; fila++) {

			// Convierto el String de la fila i, columna 1, a float.
			precio = Float.parseFloat(precios[fila][1]);

			total = total + precio;

		}

		System.out.println("Precio total: " + total);
		
		// Buscamos el menor y el mayor precio.
		int posMin = 0, posMax = 0;
		for (int fila = 0; fila < precios.length; fila++) {
			
			if(Float.parseFloat(precios[fila][1]) < 
					Float.parseFloat(precios[posMin][1])) {
				posMin = fila;
			}
			
			if(Float.parseFloat(precios[fila][1]) > 
					Float.parseFloat(precios[posMax][1])) {
				posMax = fila;
			}
			
		}
		
		System.out.println("El artículo más barato es " + precios[posMin][0] 
				+ ", que vale " + precios[posMin][1] + " euros.");
		
		System.out.println("El artículo más caro es " + precios[posMax][0] 
				+ ", que vale " + precios[posMax][1] + " euros.");

	}

}















