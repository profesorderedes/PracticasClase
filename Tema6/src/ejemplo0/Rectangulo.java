package ejemplo0;

public class Rectangulo extends Coordenada {

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
	
	//double x, y;
	private Coordenada posicionInicial;
	private double base, altura;
	
	//Añadido
	public Rectangulo() {
		
	}
	
	//Añadido
	public Rectangulo(Coordenada posicionInicial, double base, double altura) {
		this.posicionInicial = posicionInicial;
		this.base = base;
		this.altura = altura;
	}
	
	
	//Añadido
	public Rectangulo(int x, int y, double base, double altura) {
		this.posicionInicial = new Coordenada(x, y);
		this.base = base;
		this.altura = altura;
	}

	/*public void mostrar() {
		//Si quisiéramos llamar al método mostrar() del padre
		//super.mostrar();
		
		System.out.println("Coordenadas vértice superior izquierdo: (" + x + "," + y + ")");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);

	}

	double area() {
		return base * altura;
	}

	double perimetro() {
		return 2 * base + 2 * altura;
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

	}*/

}
