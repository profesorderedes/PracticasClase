package ejemplo04Rectangulo;

public class Rectangulo {
	
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
	// 					  del rectángulo.
	double x, y;
	double base, altura;
	
	void mostrar() {
		
		System.out.println("Coordenadas vértice superior izquierdo: (" + x 
				+ "," + y + ")");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		
	}
	

}
