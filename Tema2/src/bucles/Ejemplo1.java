package bucles;

public class Ejemplo1 {

	public static void main(String[] args) {

		int contador = 1;
		
		while (contador <= 10000000) {
			
			System.out.println(contador);
			contador++; // Como escribir contador = contador + 1
			contador += 10;
		}
		
		System.out.println("De nada.");

	}

}
