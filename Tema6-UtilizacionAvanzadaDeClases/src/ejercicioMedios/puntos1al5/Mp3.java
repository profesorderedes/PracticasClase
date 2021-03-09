package ejercicioMedios.puntos1al5;

public class Mp3 extends Musica {

	private int modo;

	//Constructor vacio
	//Se llama al constructor del padre
	public Mp3() {
		super();
	}
	
	//Constructor heredado (por facilidad)
	//A efectos prácticos, sería similar a generar un objeto Música con sus parámetros
	//Y construir un objeto Mp3 sin parámetros
	public Mp3(String artista, String estilo, String nombre, double duracion) {
		super(artista, estilo, nombre, duracion);
	}
	
	//Constructor completo
	//Generamos un objeto Mp3, con su parámetro y también iniciamos su clase padre (en este caso, Música)
	public Mp3(int modo, String artista, String estilo, String nombre, double duracion) {
		super(artista, estilo, nombre, duracion);
		this.modo = modo;
	}

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}


	//Un detalle 
	//Como hemos definido Musica / Video como abstract, el método reproducir lo deben implementar las 
	//primeras clases "hijas" no abstractas
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
	}
	
	
}
