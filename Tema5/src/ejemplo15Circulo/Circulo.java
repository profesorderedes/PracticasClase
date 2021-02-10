package ejemplo15Circulo;

// Ejemplo con una variable estática, numObjetos, que registra cuántos objetos 
// se han creado de esta clase.
public class Circulo {

	// Atributos
	// x,y (posición del centro)
	// radio

	// Métodos
	// mostrar()
	// area(): Devuelve el área
	// perimetro: Devuelve el perímetro

	private double x, y; // Posición del centro
	private double radio; // Radio del círculo
	private static int numObjetos;

	Circulo() {
		numObjetos++;
	}

	Circulo(double x, double y) {

		this(x, y, 10);

	}

	Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		numObjetos++;
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

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static int getNumObjetos() {
		return numObjetos;
	}

	public static void setNumObjetos(int numObjetos) {
		Circulo.numObjetos = numObjetos;
	}
	
	
	
	

}
