package inicio;

import geometria.Cilindro;

public class Inicio {
	
	public static void main(String[] args) {
		
		Cilindro Cilindro1 = new Cilindro();
		
		Cilindro1.setAltura(12);
		Cilindro1.setRadio(8);
		
		double area = Cilindro1.getArea();
		double volumen = Cilindro1.getVolumen();
		
		System.out.println("El área del cilindro 1 es: " + area);
		System.out.println("El volumen del cilindro 1 es: " + volumen);
		
		Cilindro cilindro2 = new Cilindro();
		
		cilindro2.setAltura(10);
		cilindro2.setRadio(5);
		
		System.out.println("\nEl area del cilindro2 es: " + cilindro2.getArea());
		System.out.println("El volumen del cilindro2 es: " + cilindro2.getVolumen());
		
		System.out.println("\nDatos del cilindro2: \n" + cilindro2.toString());
		
	}
	
}
