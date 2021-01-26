
// Ejemplo con variables globales.

public class Ejemplo5 {

	static float precio1 = 100;
	static float precio2 = 150;
	
	public static void main(String[] args) {
		
		System.out.println("Los precios que estamos comparando son " + precio1 
				+ " y " + precio2);
		max();

	}
	
	static void max() {
		
		
		if (precio1 > precio2) {
			System.out.println("El mayor es " + precio1);
		} else {
			System.out.println("El mayor es " + precio2);
		}
	}

}
