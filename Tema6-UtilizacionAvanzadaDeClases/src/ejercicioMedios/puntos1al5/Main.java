package ejercicioMedios.puntos1al5;

public class Main {

	
	public static void main(String[] args) {
		//Si los descomentáis, dan error. 
		//Como hemos dicho, las clases abstractas no puedes ser instanciadas
		//Es decir, no se pueden hacer "news"
		
		//Medio me1 = new Medio();
		//Musica musica = new Musica();
		
		Mp3 mp1 = new Mp3();
		Ogg o1 = new Ogg();
		
		//Podemos usar el método reproducir(), porque al ser abstracto, tanto Mp3 como OGG están obligados a implementarlo
		mp1.reproducir();
		o1.reproducir();
		
		//Cómo en la clase Mp3 no hemos sobreescrito el método toString
		//Éste nos pintará la versión que tiene implementada la clase Object
		System.out.println(mp1.toString());
		
		//Cómo en la clase Ogg, sí hemos sobreescrito el método toString
		//Éste nos pintará la versión que tiene implementada la clase Ogg
		System.out.println(o1.toString());
	}
	
}
