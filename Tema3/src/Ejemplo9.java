
public class Ejemplo9 {
	
	public static void main(String[] args) {
		
		// double medidas[][] = new double[4][3];
		double medidas[][] = {
				{8.5, 1020, 40}, 
				{14.2, 1020, 35},
				{11, 1022, 45},
				{7, 1023, 50}
				};
		
		int fila, col;

		// Mostrar la primera fila.
		System.out.println("Fila 0:");
		System.out.println(medidas[0][0] + " " + medidas[0][1] + " " + medidas[0][2]);

		System.out.println("Fila 0:");
		for (col = 0; col < 3; col++) {
			System.out.print(medidas[0][col] + " ");
		}
		System.out.println();
		
		// Mostrar la fila "fila".
		fila = 3;
		System.out.println("Fila " + fila + ":");
		for(col = 0; col< 3; col++) {
			System.out.print(medidas[fila][col] + " ");
		}
		
		// Mostrar la columna 0.
		System.out.println("\nColumna 0:");
		System.out.println(medidas[0][0] + " " + medidas[1][0] + " " 
				+ medidas[2][0] + " " + medidas[3][0]);

		System.out.println("\nColumna 0:");
		for(fila = 0; fila < 4; fila++) {
			System.out.println(medidas[fila][0]);
		}
		
		 
		
		
	}

}















