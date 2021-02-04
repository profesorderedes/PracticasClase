package ejemplo06Punto;

public class Main {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();

		punto1.x = 50;
		punto1.y = 25;
		punto1.color = "Rojo";

		punto1.mostrar();

		System.out.println();

		// Desplazamos el punto 10 unidades a la derecha y
		// 5 hacia arriba.
		punto1.desplazar(10, 5);
		punto1.mostrar();

		System.out.println();
		Punto punto2 = new Punto(100, 150, "Rojo");
		punto2.mostrar();
		
		System.out.println();
		Punto punto3 = new Punto(5,10);
		punto3.mostrar();

	}

}
