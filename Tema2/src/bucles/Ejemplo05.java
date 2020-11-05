package bucles;

// Muestra los números del 500 al 10, bajando de 1 en 1.
public class Ejemplo05 {

	public static void main(String[] args) {

		int contador = 500;
		
		while (contador >= 10) {
			
			System.out.println(contador);
			contador--; // Lo mismo que contador = contador - 1
			// También valdría contador -= 1
			
		}
		
		System.out.println("De nada.");

	}

}
