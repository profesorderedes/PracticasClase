
public class Ejemplo4 {

	public static void main(String[] args) {

		System.out.println("El cuadrado de 5 es " + cuadrado(5));
		System.out.println("El cubo de 10 es " + cubo(10));
		System.out.println("El precio final de un producto de 20 euros, "
				+ "con un descuento del 10% y un IVA del 16% es " + precioVenta(20, 10, 16));

	}

	static int cuadrado(int num) {

		int cuadrado = num * num;
		return cuadrado;

	}

	static double cubo(double num) {

		return num * num * num;

	}

	// Calcular el precio descontado, aplicarle el IVA y devolver el precio
	// final que tiene que pagar el cliente.
	// precioVenta(precio, descuento, iva)
	static float precioVenta(float precio, float descuento, int iva) {

		float precioDescontado = precio - precio * descuento / 100;
		float precioFinal = precioDescontado + precioDescontado * iva / 100;

		return precioFinal;

	}

	// Método que toma un número decimal y devuelve el volumen de una esfera con ese
	// radio.
	// volumenEsfera(radio)
	// Volumen = 1.33 * 3.14 * radio * radio * radio
	static double volumenEsfera(double radio) {

		return 1.33 * 3.14 * cubo(radio);

	}

}
