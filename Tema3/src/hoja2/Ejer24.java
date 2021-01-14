package hoja2;

public class Ejer24 {

	public static void main(String[] args) {
		
		int huecos[][][] = new int[3][3][3];
		int rojas = 0, azules = 0;
		
		// Rellenamos el tablero de 3 en raya tridimensional.
		for (int planta = 0; planta < huecos.length; planta++) {
			
			for (int fila = 0; fila < huecos[0].length; fila++) {
				
				for (int col = 0; col < huecos[0][0].length; col++) {
					
					huecos[planta][fila][col] =(int) (Math.random() * 2 + 1);
					
				}
				
			}
			
		}
		
		// Contamos cuántas bolas azules y rojas hay.
		// 1 = rojo, 2 = azul.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
