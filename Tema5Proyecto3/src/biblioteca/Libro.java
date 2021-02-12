package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual = 2021;

	// Métodos constructores:
	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	// Getters and Setters:
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public String toString() {
		return "El libro " + titulo + ", con el isbn: " + isbn 
				+ ". Ha sido escrito por "+ autor.getNombre() + " en el año " 
				+ anyoActual
				+ ".";
	}

}













