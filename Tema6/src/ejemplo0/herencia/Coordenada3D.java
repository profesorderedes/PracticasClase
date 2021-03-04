package ejemplo0.herencia;

import ejemplo0.Coordenada;

public class Coordenada3D extends Coordenada {
	
	private int z; // Coordenada x del punto
	
	public Coordenada3D() {

	}
	
	public Coordenada3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

}
