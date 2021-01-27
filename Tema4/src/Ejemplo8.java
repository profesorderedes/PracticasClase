
public class Ejemplo8 {

	public static void main(String[] args) {

		double radio = 5;
		String terminos[] = { "Juan", "Jose", "Pedro", "Luisa" };

		areaEsfera(radio);
		primerElemento(terminos);
		
		System.out.println("El valor actual de radio es " + radio);
		System.out.println("La primera posición del array es " + terminos[0]);

	}

	// Los tipos primitivos se pasan siempre por valor. 
	// O sea, se pasa una copia del valor de la variable original.
	// La variable original no se modificará aunque cambie el parámetro dentro
	// del método.
	static void areaEsfera(double radio) {

		System.out.println("El área de una esfera de radio " + radio + " es " 
		+ 4 * Math.PI * radio * radio + ".");
		
		radio = 10;

	}

	// Los objetos (no son tipos primitivos) se pasan siempre por referencia.
	// O sea, se pasa una referencia a la posición de memoria que ocupa
	// el parámetro. De manera que si cambiamos el valor del parámetro, 
	// cambiará también el valor de la variable original.
	static void primerElemento(String palabras[]) {

		System.out.println("El primer elemento del array es " + palabras[0] 
				+ ".");
		
		palabras[0] = "Carlos";

	}
	
}












