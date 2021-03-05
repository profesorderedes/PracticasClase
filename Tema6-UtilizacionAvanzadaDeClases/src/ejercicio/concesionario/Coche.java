package ejercicio.concesionario;

public class Coche extends Vehiculo {
    
    private int potenciaCV;
    
    public Coche() {
        super();
    }
    
    public Coche(int potenciaCV) {
        super();
        this.potenciaCV=potenciaCV;
    }
    
    public Coche(int potenciaCV, String marca, String modelo, String matricula) {
        super(matricula, marca, modelo);
        this.potenciaCV=potenciaCV;
    }
    
	public int getPotenciaCV() {
		return potenciaCV;
	}
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}

	@Override
	public double calcularImpuestoCirculacion() {
		return potenciaCV * 0.5;
	}
    
    

}
