package ejemplo03Circulo;

public class Main {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo();

		circulo1.x = 10;
		circulo1.y = 15;
		circulo1.radio = 5;

		circulo1.mostrar();

		double superficie = circulo1.area();

		System.out.println("\nEl área del círculo es: " + superficie);

		double perimetro = circulo1.perimetro();

		System.out.println("\nEl perímetro del círculo es: " + perimetro);
		
	}

}
