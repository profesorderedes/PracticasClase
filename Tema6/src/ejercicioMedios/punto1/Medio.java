package ejercicioMedios.punto1;

public abstract class Medio {

	private String nombre;
	private double duracion;
	
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
	
	
}
