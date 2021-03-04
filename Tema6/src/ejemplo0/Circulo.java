package ejemplo0;

public class Circulo {

	// Atributos
	// x,y (posición del centro)
	// radio

	// Métodos
	// mostrar()
	// area(): Devuelve el área
	// perimetro: Devuelve el perímetro

	//double x, y;
	private Coordenada centro;
	private double radio; // Radio del círculo
	
	//Añadido
	public Circulo() {
			
	}
	
	//Añadido
	public Circulo(int x, int y, double radio) {
		this.centro = new Coordenada(x, y);
		this.radio = radio;
	}
	
	//Añadido
	public Circulo(Coordenada centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	

	/*
	double area() {
		return Math.PI * radio * radio;
	}

	double perimetro() {
		return 2 * Math.PI * radio;
	}*/

}













