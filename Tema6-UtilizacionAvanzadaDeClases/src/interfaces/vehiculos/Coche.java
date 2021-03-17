package interfaces.vehiculos;

public class Coche extends Vehiculo implements IConduccion {
    
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
	public void setVelocidadMaxima() {
		super.velocidadMaxima = potenciaCV * 2;
	}

	@Override
	public void setNumRuedas() {
		super.numRuedas = 4;
	}

	@Override
	public void arrancar() {
		setVelocidadActual(0);
	}

	@Override
	public void parar() {
		setVelocidadActual(0);
	}


	@Override
	public void frenar() {
		if (getVelocidadActual() != 0) {
			int velocidadFrenada = getVelocidadActual() - 10;
			setVelocidadActual(velocidadFrenada);
		}
	}

	@Override
	public void frenoDeMano() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		if (getVelocidadActual() + 10 <= getVelocidadMaxima()) {
			int velocidadAceleracion = getVelocidadActual() + 10;
			setVelocidadActual(velocidadAceleracion);
		}
		
	}

	@Override
	public void acelerar(int velocidad) {
		if (getVelocidadActual() + velocidad <= getVelocidadMaxima()) {
			int velocidadAceleracion = getVelocidadActual() + velocidad;
			setVelocidadActual(velocidadAceleracion);
		}
	}

	@Override
	public void frenar(int velocidad) {
		if (getVelocidadActual() != 0) {
			int velocidadFrenada = getVelocidadActual() - velocidad;
			setVelocidadActual(velocidadFrenada);
		}
		
	}
    
    

}
