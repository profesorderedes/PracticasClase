package ejercicioMedios.punto1;

public abstract class Musica extends Medio {

	private String artista;
	private String estilo;
	
	public Musica() {
		super();
	}
	
	public Musica (String nombre, double duracion) {
		super(nombre, duracion);
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
}
