package interfaces.vehiculos;

public abstract class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    
    protected int velocidadMaxima;
    protected int numRuedas;
    
    private int velocidadActual;
    
    public Vehiculo() {
       
    }
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public int getVelocidadMaxima() {
		return velocidadMaxima;
    }
    
    public int getNumRuedas() {
		return numRuedas;
    }
	
	public abstract void setVelocidadMaxima();
	
	public abstract void setNumRuedas();
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
    

}
