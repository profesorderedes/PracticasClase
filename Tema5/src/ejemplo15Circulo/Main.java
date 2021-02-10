package ejemplo15Circulo;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo2 = new Circulo(20, 22, 5);

		System.out.println("\nDatos del círculo 2:");
		circulo2.mostrar();

		Circulo circulo3 = new Circulo(5, 5);

		System.out.println("\nDatos del círculo 3:");
		circulo2.mostrar();
		
		System.out.println("El radio del círculo 3 es " + circulo3.getRadio());
		
		System.out.println("\nObjetos creados de la clase Circulo: " 
				+ Circulo.getNumObjetos());

	}

}
