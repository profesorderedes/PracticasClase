package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autor;
	private static int anyoActual = 2021;

	// Métodos constructores:
	public Libro(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String titulo, String isbn, Autor[] autor) {
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

	public Autor[] getAutor() {
		return autor;
	}

	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public String toString() {
		
		// Compruebo si hay un autor o varios. Si sólo hay uno, pongo su nombre,
		// y si hay varios, pongo "Varios autores".
		String nombre;
		if(autor.length == 1) {
			nombre = autor[0].getNombre();
		}else {
			nombre = "Varios autores";
		}
		
		return "El libro " + titulo + ", con el isbn: " + isbn 
				+ ". Ha sido escrito por " + nombre + ".";
		
	}
	
	public void muestraAutores() {
		
		for (int i = 0; i < autor.length; i++) {
			System.out.print(autor[i].getNombre()" - ");
		}
		
	}

}



















