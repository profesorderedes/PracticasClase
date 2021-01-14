package hoja2;

public class Ejer23 {

	public static void main(String[] args) {
		
		float temperaturas[ ][ ][ ] = new float[5][4][6];
		float total = 0;
		
		// Nos inventamos cinco temperaturas.
		temperaturas[0][0][0] = 15;
		temperaturas[2][2][0] = 23;
		temperaturas[1][2][2] = 10;
		temperaturas[0][1][0] = 21;
		temperaturas[2][0][1] = 21;
		
		// Calculamos la suma de todas las temperaturas del edificio.
		for (int planta = 0; planta < temperaturas.length; planta++) {
			
			// Para cada planta, recorremos sus filas.
			for (int fila = 0; fila < temperaturas[0].length; fila++) {
				
				// Para cada fila, recorremos sus celdas (columnas).+
				for (int col = 0; col < temperaturas[0][0].length; col++) {
					
//					System.out.println("p = " + planta + ", f = " + fila + 
//							", c = " + col);
					total = total + temperaturas[planta][fila][col];
					
				}
				
			}
			
		}
		
		System.out.println("Suma de todas las temperaturas del edificio: " 
				+ total + " ºC.");
		
	}
	
}











