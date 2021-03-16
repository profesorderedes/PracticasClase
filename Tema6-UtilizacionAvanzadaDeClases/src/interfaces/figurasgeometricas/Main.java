package interfaces.figurasgeometricas;

public class Main {
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo(0, 0, 5);
		//Lamada al método área, usando la clase circulo
		circulo.area();
		
		//Como circulo implementa una interfaz
		//Podemos asignar a una variable del tipo interfaz, el valor de un nuevo círculo
		Figura2D fig = new Circulo(0, 0, 5);
		//Y podemos llamar a su área
		fig.area();
		
		
		//Otra opción, creamos un rectangulo
		Rectangulo rect = new Rectangulo(10, 6, 3, 2);
		//Y la variable rectángulo se la asignamos a una variable del tipo de la interfaz
		Figura2D fig2 = rect;
		//De igual forma, llamamos al área
		fig2.area();
		
		
		//Aunque estemos poniendo como parámetro los objetos circulo o rect
		//Realmente lo que usa el método es la interfaz
		System.out.println("Area del circulo " + calcularArea(circulo));
		System.out.println("Area del rectángulo " + calcularArea(rect));
		
	}
	
	//Por poliformismo, en lugar de pasarle el tipo estático de la clase (es decir, Circulo o Rectangulo)
	//Le pasamos como parámetro el tipo de la interfaz
	public static double calcularArea(Figura2D fig) {
		return fig.area();
	}

}
