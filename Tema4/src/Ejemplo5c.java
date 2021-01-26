
// Ejemplo con variables globales.

public class Ejemplo5c {

	static float precio1;
	static float precio2;
	
	public static void main(String[] args) {
		
		precio1 = 100;
		precio2 = 150;
		
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
