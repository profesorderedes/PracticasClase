package ejercicio2;

public class Led extends Diodo {
	
	private String color;
	
	public Led() {
		super();
	}
	
	public Led(String color, double tensionInversa, double intensidadMaxima, double longitud) {
		super(tensionInversa, intensidadMaxima, longitud);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void conectar() {
		System.out.println("Led conectado");
	}
	
	@Override
	public String toString() {
		return "Datos del led: color " + color + ", tension inversa: " + getTensionInversa() + ", intensidad máxima: " + getIntensidadMaxima() 
				+ ", longitud: " + getLongitud();
	}

}
