package ejemplo13Concesionario;

public class App {

	public static void main(String[] args) {

		Coche coche1 = new Coche("Azul", "Renault", "Clío", "7827DFR", 100, 10);
		Coche coche2 = new Coche("Blanco", "Seat", "Ibiza", "1234AAB", 90, 15);

		System.out.println("Descuento del coche 1: " + coche1.descuento);
		System.out.println("Descuento del coche 2: " + coche2.descuento);

		coche1.descuento = 7;

		System.out.println("Descuento del coche 1: " + coche1.descuento);
		System.out.println("Descuento del coche 2: " + coche2.descuento);

		// Atributo descuento llamado a partir del nombre de la clase.
		System.out.println("El descuento del concesionario es " + Coche.descuento);

	}

}
