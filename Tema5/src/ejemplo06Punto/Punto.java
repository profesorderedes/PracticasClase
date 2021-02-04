package ejemplo06Punto;

public class Punto {

	int x; // Coordenada x del punto
	int y; // Coordenada y del punto
	String color; // Color del punto
	
	// Constructor implícito.
	Punto(){
		
	}
	
	Punto(int x, int y){
		
		this(x, y, "Azul");
		
	}
	
	Punto(int x, int y, String color){
		this.x = x;
		this.y = y;
		this.color = color;
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

}
