package ejercicio2;

public class Diodo extends Componente {
	
	private double tensionInversa;
	
	public Diodo() {
		super();
	}
	
	public Diodo(double tensionInversa, double intensidadMaxima, double longitud) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	public double getTensionInversa() {
		return tensionInversa;
	}

	public void setTensionInversa(double tensionInversa) {
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Diodo conectado");
	}
	
	@Override
	public String toString() {
		return "Datos del diodo: tension inversa " + tensionInversa + ", intensidad máxima: " + getIntensidadMaxima() + ", longitud: " + getLongitud() ;
	}

}
