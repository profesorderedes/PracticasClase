package ejercicioConcesionario;

public class Coche extends Vehiculo {
	
	private int potenciaCV;
	//private double potenciaFiscal;

	public Coche() {
		super();
	}

	public Coche(int potenciaCV) {
		super();
		this.potenciaCV = potenciaCV;
	}

	public Coche(int potenciaCV, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.potenciaCV = potenciaCV;
	}
	
	
	
	

}
