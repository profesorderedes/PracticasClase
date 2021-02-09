package ejemplo12Rectangulo;

public class Main {

	public static void main(String[] args) {

		Rectangulo rect = new Rectangulo();

		rect.setX(20);
		rect.setY(5);
		rect.setBase(30);
		rect.setAltura(10);

		rect.mostrar();

		double area = rect.area();
		double perimetro = rect.perimetro();

		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);

		System.out.println("\nDesplazando el rectángulo 20 px...");
		rect.mover(20);
		rect.mostrar();

		double x1 = 50;
		double y1 = 2;

		System.out.println(
				"\nAnalizando si el punto de coordenadas (" + x1 + "," + y1 + ") está dentro del rectángulo...");
		if (rect.estaDentro(x1, y1)) {
			System.out.println("El punto está dentro del rectángulo.");
		} else {
			System.out.println("El punto está fuera del rectángulo.");
		}

	}

}
