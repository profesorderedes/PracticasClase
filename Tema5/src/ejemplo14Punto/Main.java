package ejemplo14Punto;

public class Main {

	public static void main(String[] args) {

		System.out.println();

		System.out.println();
		Punto punto2 = new Punto(100, 150, "Rojo");
		punto2.mostrar();

		System.out.println();
		Punto punto3 = new Punto(5, 10);
		punto3.mostrar();

		// Usamos un método set para cambiar la coordenada x del punto 3.
		punto3.setX(7);
		punto3.mostrar();
		
		// Miramos cuántos objetos se han creado de la clase Punto.
		System.out.println("Hemos creado " 
		     + Punto.numInstancias + " instancias de la clase Punto.");
		
		Punto punto4 = new Punto();
		System.out.println("Hemos creado " 
			     + Punto.numInstancias + " instancias de la clase Punto.");

	}

}
