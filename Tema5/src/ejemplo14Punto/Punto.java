package ejemplo14Punto;

// Ejemplo añadiendo un atributo estático.

public class Punto {

	private int x; // Coordenada x del punto
	private int y; // Coordenada y del punto
	private String color; // Color del punto
	private static int numInstancias;
	
	// Constructor implícito.
	Punto() {
		numInstancias++;
	}

	Punto(int x, int y) {

		this(x, y, "Azul");

	}

	Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
		numInstancias++;
	}

	void mostrar() {

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);

	}

	void desplazar(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

	int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static int getNumInstancias() {
		return numInstancias;
	}

	public static void setNumInstancias(int numInstancias) {
		Punto.numInstancias = numInstancias;
	}
	
	

}
