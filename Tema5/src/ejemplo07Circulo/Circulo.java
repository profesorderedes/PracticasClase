package ejemplo07Circulo;

public class Circulo {

	// Atributos
	// x,y (posición del centro)
	// radio

	// Métodos
	// mostrar()
	// area(): Devuelve el área
	// perimetro: Devuelve el perímetro

	double x, y; // Posición del centro
	double radio; // Radio del círculo

	Circulo() {

	}

	Circulo(double x, double y) {

		this(x, y, 10);

	}

	Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	void mostrar() {
		System.out.println("Coordenadas del centro: (" + x + "," + y + ").");
		System.out.println("Radio: " + radio + ".");
	}

	double area() {
		return Math.PI * radio * radio;
	}

	double perimetro() {
		return 2 * Math.PI * radio;
	}

}
