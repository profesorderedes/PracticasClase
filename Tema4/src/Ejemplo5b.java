
// Ejemplo con variables locales.

public class Ejemplo5b {

	public static void main(String[] args) {
		
		float precio1 = 100;
		float precio2 = 150;
		
		System.out.println("Los precios que estamos comparando son " 
				+ precio1 + " y " + precio2);
		max(precio1, precio2);

	}

	static void max(float p1, float p2) {

		if (p1 > p2) {
			System.out.println("El mayor es " + p1);
		} else {
			System.out.println("El mayor es " + p2);
		}
		
	}

}
