
public class Ejemplo9 {
	
	public static void main(String[] args) {
		
		// double medidas[][] = new double[4][3];
		double medidas[][] = {
				{8.5, 1020, 40}, 
				{14.2, 1020, 35},
				{11, 1022, 45},
				{7, 1023, 50}
				};

		// Mostrar la primera fila.
		System.out.println(medidas[0][0] + " " + medidas[0][1] + " " + medidas[0][2]);

		for (int col = 0; col < 3; col++) {
			System.out.print(medidas[0][col] + " ");
		}
		System.out.println();
		
		// Mostrar la fila "fila".
		int fila = 3;
		for(int col = 0; col< 3; col++) {
			System.out.print(medidas[fila][col] + " ");
		}
		
		

	}

}