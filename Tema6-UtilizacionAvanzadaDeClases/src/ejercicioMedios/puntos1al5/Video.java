package ejercicioMedios.puntos1al5;

//En clase hemos visto como Video tambien podría ser abstract()
public abstract class Video extends Medio { 

	private String director;
	private String idioma;
	
	//Constructor vacio
	//Se llama al constructor del padre
	public Video() {
		super();
	}
	
	//Constructor heredado (por facilidad)
	//A efectos prácticos, sería similar a generar un objeto Medio con sus parámetros
	//Y construir un objeto música sin parámetros
	public Video (String nombre, double duracion) {
		super(nombre, duracion);
	}
	
	//Constructor completo
	//Generamos un objeto música, con sus parámetros y también iniciamos su clase padre
	public Video (String director, String idioma, String nombre, double duracion) {
		super(nombre, duracion);
		this.director = director;
		this.idioma = idioma;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
