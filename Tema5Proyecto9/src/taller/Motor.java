package taller;

public class Motor {

	private int id;
	private String fabricante;
	private String modelo;

	public Motor(int id, String fabricante, String modelo) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}
	
}
