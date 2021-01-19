
public class Ejemplo11 {
	
	public static void main(String[] args) {
		
		// Array indicando día de la semana y temperatura media ese día.
		String temperaturas[][] = {
				{"Lunes", "20.5"},
				{"Martes", "21.5"},
				{"Miércoles", "23"},
				{"Jueves", "22"},
				{"Viernes", "20"},
				{"Sábado", "16"},
				{"Domingo", "14.5"}
		};
		
		int posMin = 0;
		int posMax = 0;
		for (int fila = 1; fila < temperaturas.length; fila++) {
			
			if(Float.parseFloat(temperaturas[fila][1]) 
					< Float.parseFloat(temperaturas[posMin][1])) {
				posMin = fila;
			}
			
			if(Float.parseFloat(temperaturas[fila][1]) 
					> Float.parseFloat(temperaturas[posMax][1])) {
				posMax = fila;
			}
			
		}
		
		System.out.println("El día más frío fue el " + temperaturas[posMin][0] 
				+ ", con " + temperaturas[posMin][1] + "ºC.");
		System.out.println("El día más caluroso fue el " + temperaturas[posMax][0] 
				+ ", con " + temperaturas[posMax][1] + "ºC.");
		
	}

}
