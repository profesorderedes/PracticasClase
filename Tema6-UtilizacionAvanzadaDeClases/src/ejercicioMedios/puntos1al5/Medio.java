package ejercicioMedios.puntos1al5;

public abstract class Medio {

	protected String nombre;
	protected double duracion;
	
	public Medio() {
		super();
	}

	public Medio(String nombre, double duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public abstract void reproducir();
	
}
