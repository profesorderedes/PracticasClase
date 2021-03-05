package ejercicio.concesionario;

public class Moto extends Vehiculo{

    private int cilindrada;
    
    public Moto() {
        super();
    }
    public Moto(int cilindrada) {
        super();
        this.cilindrada=cilindrada;
    }
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public double calcularImpuestoCirculacion() {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}
