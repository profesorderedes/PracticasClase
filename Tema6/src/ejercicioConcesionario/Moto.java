package ejercicioConcesionario;

public class Moto extends Vehiculo {
	
	private int clinidrada;
	
	public Moto() {
		super();
	}

	public Moto(int clinidrada) {
		super();
		this.clinidrada = clinidrada;
	}

	public Moto(int clinidrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.clinidrada = clinidrada;
	}

}
