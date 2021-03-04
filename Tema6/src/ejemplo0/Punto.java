package ejemplo0;

public class Punto {
	
	private Coordenada posicion;
	private String color; // Color del punto
	
	public Punto() {
		
	}

	public Punto(int x, int y, String color) {
		this.posicion = new Coordenada(x, y);
		this.color = color;
	}
	
	public Punto(Coordenada posicion) {
		this.posicion = posicion;
	}
	

	/*public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);

	}
	
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}*/

}
