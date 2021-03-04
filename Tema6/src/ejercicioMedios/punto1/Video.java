package ejercicioMedios.punto1;

public abstract class Video extends Medio { 

	private String director;
	private String idioma;
	
	public Video() {
		super();
	}

	public Video(String director, String idioma) {
		super();
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
