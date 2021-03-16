package interfaces.figurasgeometricas;

public class Circulo implements Figura2D {

	// Atributos
	// x,y (posición del centro)
	// radio

	// Métodos
	// mostrar()
	// area(): Devuelve el área
	// perimetro: Devuelve el perímetro

	private double x, y; // Posición del centro
	private double radio; // Radio del círculo
	
	public Circulo() {

	}
	
	public Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
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

	public void mostrar() {
		System.out.println("Coordenadas del centro: (" + x + "," + y + ").");
		System.out.println("Radio: " + radio + ".");
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	

	

}













