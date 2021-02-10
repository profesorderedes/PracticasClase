package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int altura, radio;

		System.out.println("CALCULADOR DE CILINDROS");
		System.out.println("=======================");
		System.out.println("Escribe la altura del cilindro: ");
		altura = entrada.nextInt();

		System.out.println("Escribe el radio del cilindro: ");
		radio = entrada.nextInt();

		Cilindro cilindro1 = new Cilindro(altura, radio);

		double area = cilindro1.getArea();
		double volumen = cilindro1.getVolumen();

		System.out.println("El área del cilindro 1 es: " + area);
		System.out.println("El volumen del cilindro 1 es: " + volumen);
		System.out.println("\nDatos del cilindro: \n" + cilindro1.toString());

		Cilindro cilindro2 = new Cilindro();

		cilindro2.setAltura(10);
		cilindro2.setRadio(5);

		System.out.println("\nEl area del cilindro2 es: " + cilindro2.getArea());
		System.out.println("El volumen del cilindro2 es: " + cilindro2.getVolumen());

		System.out.println("\nDatos del cilindro2: \n" + cilindro2.toString());

	}

}
