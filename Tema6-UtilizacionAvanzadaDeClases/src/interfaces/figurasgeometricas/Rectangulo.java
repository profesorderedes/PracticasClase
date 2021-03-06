package interfaces.figurasgeometricas;

public class Rectangulo implements Figura2D {

	// Atributos
	// (x,y) del vértice superior izquierdo
	// Base, altura

	// Métodos
	// mostrar()
	// area(): Devuelve el área del rectángulo
	// perimetro(): Devuelve el perímetro del rectángulo

	// Después:
	// mover(dx): Desplaza el rectángulo en horizontal
	// estaDentro(x1,y1): Devuelve true si el punto (x1,y1) está dentro
	// del rectángulo.
	double x, y;
	double base, altura;

	public Rectangulo() {
		
	}

	public Rectangulo(double x, double y, double base, double altura) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
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

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	void mostrar() {

		System.out.println("Coordenadas vértice superior izquierdo: (" + x + "," + y + ")");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);

	}

	

	void mover(int dx) {
		x = x + dx;
	}

	boolean estaDentro(double x1, double y1) {

		boolean interno;
		if (x1 >= x && x1 <= x + base && y1 >= y - altura && y1 <= y) {
			interno = true;
		} else {
			interno = false;
		}

		return interno;

	}


	@Override
	public double perimetro() {
		return 2 * base + 2 * altura;
	}



	@Override
	public double area() {
		return base * altura;
	}

}
