package ejemplo02Punto;

public class Main {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		
		punto1.x = 50;
		punto1.y = 25;
		punto1.color = "Rojo";
		
		punto1.mostrar();
		
		// Desplazamos el punto 10 unidades a la derecha y 
		// 5 hacia arriba.
		punto1.desplazar(10, 5);
		punto1.mostrar();
		
	}
	
}
