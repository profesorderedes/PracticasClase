package ejemplo0.herencia;

public class Esfera {
	
	//double x, y;
	private Coordenada3D centro;
	private double radio; // Radio del círculo
	
	public Esfera() {
		
	}
	
	//Añadido
	public Esfera(int x, int y, int z, double radio) {
		this.centro = new Coordenada3D(x, y, z);
		this.radio = radio;
	}
		
	//Añadido
	public Esfera(Coordenada3D centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

}
