package ejercicioMedios.puntos1al5;

public class Ogg extends Musica {

	private int version;

	//Constructor vacio
	//Se llama al constructor del padre
	public Ogg() {
		super();
	}
	
	//Constructor heredado (por facilidad)
	//A efectos prácticos, sería similar a generar un objeto Música con sus parámetros
	//Y construir un objeto Ogg sin parámetros
	public Ogg(String artista, String estilo, String nombre, double duracion) {
		super(artista, estilo, nombre, duracion);
	}
	
	//Constructor completo
	//Generamos un objeto Ogg, con su parámetro y también iniciamos su clase padre (en este caso, Música)
	public Ogg(int version, String artista, String estilo, String nombre, double duracion) {
		super(artista, estilo, nombre, duracion);
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	//Un detalle 
	//Como hemos definido Musica / Video como abstract, el método reproducir lo deben implementar las 
	//primeras clases "hijas" no abstractas
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub	
	}
	
	//Ejemplo de polimorfismo de métodos
	//Podemos sobreescribir el método toString, porque está definido en la clase Object
	//Recordad: aunque no pongamos extends, toda clase extiende de Object
	//El Override no es obligatorio (funciona igual), pero sí recomendable
	
	@Override
	public String toString() {
		return "version: " + version;
	}

	
}
