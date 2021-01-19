
public class ActividadesCadenas {

	public static void main(String[] args) {

		// Método length()
		String palabra = "león";
		System.out.println("La palabra " + palabra + " tiene " + palabra.length() + " caracteres.");

		// Método charAt()
		System.out.println("La primera letra de la palabra " + palabra + " es " + palabra.charAt(0) + ".");

		System.out.println();

		// Método replace
		// Sustituye un carácter por otro.
		String palabraClave = "otorrinolaringólogo";
		System.out.println("La palabra original es: " + palabraClave);
		System.out.println("Vamos a sustituir la letra o por la u: " + palabraClave.replace("o", "u"));

		// Método replace cadena
		// Sustituye una cadena de caracteres por otra.
		String frase = "tres tristes tigres comían trigo en un trigal";
		System.out.println("La frase original es: " + frase);
		System.out.println("Vamos a sustituir la cadena 'tri' por la 'bla': " + frase.replace("tri", "bla"));

		// Método indexOf
		// Dice la primera posición del carácter que buscas dentro de una cadena de
		// texto.
		String busqueda = "Martirio";
		System.out.println("La palabra es: " + busqueda + ". La posición de la letra 'r' es:" + busqueda.indexOf("r"));
		System.out.println("La palabra es: " + busqueda + ". La posición de la letra 'j' es:" + busqueda.indexOf("j"));

		// Método lastIndexOf
		// Dice la última posición del carácter que buscas dentro de una cadena de
		// texto.
		System.out.println(
				"La palabra es: " + busqueda + ". La posición de la letra 'r' es:" + busqueda.lastIndexOf("r"));

		System.out.println();

		// compareTo(String textoPorComparar)
		// compara dos String léxicograficamente, devuelve un entero

		String palabra1 = "león";
		String palabra2 = "gacela";
		int num = palabra1.compareTo(palabra2);
		if (num < 0) {
			System.out.println(palabra1 + " va antes que " + palabra2);
		} else if (num == 0) {
			System.out.println(palabra1 + " es igual a " + palabra2);
		} else {
			System.out.println(palabra1 + " va después que " + palabra2);
		}

		//// Método String substring(int inicio, int fin)
		// Devuelve un String que es una subString de esta String.
		frase = "Esto es una frase de ejemplo";
		int espacio = frase.indexOf(" ");
		String primeraPalabra = frase.substring(0, espacio);
		System.out.println("La primera palabra de la frase es " + primeraPalabra);

		// Método String[ ] split(String separador)
		// Divide este String alrededor de las coincidencias de la expresión entre("")
		String numeroTelefono = "34-976255687-0911";
		String[] arregloPrimerNumero = numeroTelefono.split("-");

		System.out.println("Número de teléfono separado por guiones:");
		for (int i = 0; i < arregloPrimerNumero.length; i++) {
			System.out.print(arregloPrimerNumero[i] + "  ");
		}
		System.out.println();

		if (arregloPrimerNumero[0].equals("34")) {
			System.out.println("Llamada entrante desde España");
		}
		if (arregloPrimerNumero[0].equals("44")) {
			System.out.println("Llamada entrante desde Reino Unido");
		}

		System.out.println("Extensión del primer número: " + arregloPrimerNumero[2]);

		// Método String String.valueOf(número)
		// Devuelve en un String un (int)(char)(boolean)(float)(double)
		int entero = 10;
		char caracter = 'D';
		boolean booleano = true;
		float flotante = 2.5f;
		double doble = 3.6;
		String cadena = String.valueOf(entero) + " " + String.valueOf(caracter) + " " + String.valueOf(booleano) + " "
				+ String.valueOf(flotante) + " " + String.valueOf(doble);
		System.out.println(cadena);

	}

}
