package hoja1;

public class Ejer14b {

	public static void main(String[] args) {

		int primos[] = new int[100];

		// Ir generando números desde 2 en adelante, de uno en uno

		// Para cada número generado compruebo si es primo (apartado a)

		// Si es primo, lo guardo en la posición del array que toque

		// Vuelvo a empezar, si no he llegado a los 100 primos.

		int candidato = 2; // Contador que generará los números 2, 3, 4, 5, 6, ...
		int pos = 0; // Indica la posición del array donde hay que escribir
		boolean esPrimo;

		while (pos != primos.length) {

			// Reseteamos el valor 
			esPrimo = true;
			
			// Comprobamos si candidato es primo.
			for (int i = 2; i < candidato; i++) {

				//System.out.println("Dividiendo " + candidato + " entre " 
			    //+ i + " ...");

				if (candidato % i == 0) {
					esPrimo = false;
					break;
				}

			}
			
			// Si es primo, lo guardo en la posición del array que toque
			if(esPrimo) {
				primos[pos] = candidato;
				pos++;
			}
			
			candidato++;

		}
		
		System.out.println("Listado de los cien primeros números primos:");
		for (int i = 0; i < primos.length; i++) {
			System.out.println("(" + i + ") " + primos[i]);
		}

	}

}
