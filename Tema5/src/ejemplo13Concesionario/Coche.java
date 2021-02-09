package ejemplo13Concesionario;

// Ejemplo de variables estáticas.
public class Coche {

	private String color;
	private String marca;
	private String modelo;
	private String matricula;
	private int potencia;

	// Variable estática
	static int descuento;

	public Coche(String color, String marca, String modelo, String matricula, 
			int potencia, int descuento) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.potencia = potencia;
		this.descuento = descuento;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
