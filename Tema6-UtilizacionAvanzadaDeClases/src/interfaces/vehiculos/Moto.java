package interfaces.vehiculos;

public class Moto extends Vehiculo implements IConduccion {

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
	public void setVelocidadMaxima() {
		super.velocidadMaxima = cilindrada / 4;
	}

	@Override
	public void setNumRuedas() {
		super.numRuedas = 2;
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
			int velocidadFrenada = getVelocidadActual() - 2;
			setVelocidadActual(velocidadFrenada);
		}
	}

	@Override
	public void frenoDeMano() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		if (getVelocidadActual() + 2 <= getVelocidadMaxima()) {
			int velocidadAceleracion = getVelocidadActual() + 2;
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
