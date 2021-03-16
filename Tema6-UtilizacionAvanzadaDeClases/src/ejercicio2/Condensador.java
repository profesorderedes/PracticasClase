package ejercicio2;

public class Condensador extends Componente {
	
	private double capacidad;
	
	public Condensador() {
		super();
	}
	
	public Condensador(double capacidad, double intensidadMaxima, double longitud) {
		super(intensidadMaxima, longitud);
		this.capacidad = capacidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void conectar() {
		System.out.println("Condensador conectado");
	}
	
	@Override
	public String toString() {
		return "Datos del condensador: capacidad " + capacidad + ", intesidad maxima: " + getIntensidadMaxima() + ", longitud: " + getLongitud();
	}

}
