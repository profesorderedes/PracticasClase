package ejercicioMedios.puntos1al5;

//En clase hemos visto como Musica tambien podría ser abstract()
public abstract class Musica extends Medio {

	private String artista;
	private String estilo;
	
	//Constructor vacio
	//Se llama al constructor del padre
	public Musica() {
		super();
	}
	
	//Constructor heredado (por facilidad)
	//A efectos prácticos, sería similar a generar un objeto Medio con sus parámetros
	//Y construir un objeto música sin parámetros
	public Musica (String nombre, double duracion) {
		super(nombre, duracion);
	}
	
	//Constructor completo
	//Generamos un objeto música, con sus parámetros y también iniciamos su clase padre
	public Musica (String artista, String estilo, String nombre, double duracion) {
		super(nombre, duracion);
		this.artista = artista;
		this.estilo = estilo;
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
