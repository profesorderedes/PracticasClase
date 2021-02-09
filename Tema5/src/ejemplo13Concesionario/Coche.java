package ejemplo13Concesionario;

public class Coche {

	private String color;
	private String marca;
	private String modelo;
	private String matricula;
	private int potencia;

	int descuento;

	public Coche(String color, String marca, String modelo, String matricula, 
			int potencia, int descuento) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.potencia = potencia;
		this.descuento = descuento;
	}

}
