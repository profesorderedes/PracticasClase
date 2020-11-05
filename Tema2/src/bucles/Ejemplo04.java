package bucles;

//Muestra los números del 10 al 500.
public class Ejemplo04 {

	public static void main(String[] args) {

		int contador = 10;
		
		while (contador <= 500) {
			
			System.out.println(contador);
			contador = contador + 5;
			//contador += 5;
		}
		
		System.out.println("De nada.");

	}

}
