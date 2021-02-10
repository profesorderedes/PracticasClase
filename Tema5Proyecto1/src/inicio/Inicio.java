package inicio;

import geometria.Cilindro;

public class Inicio {
	
	public static void main(String[] args) {
		
		Cilindro Cilindro1 = new Cilindro();
		
		Cilindro1.setAltura(12);
		Cilindro1.setRadio(8);
		
		double area = Cilindro1.getArea();
		double volumen = Cilindro1.getVolumen();
		
		System.out.println("El area del cilindro1 es: " + area);
		System.out.println("El volumen del cilindro1 es: " + volumen);
		
		Cilindro Cilindro2 = new Cilindro();
		
		Cilindro2.setAltura(10);
		Cilindro2.setRadio(5);
		
		System.out.println("\nEl area del cilindro2 es: " + area);
		System.out.println("El volumen del cilindro2 es: " + volumen);
		
		System.out.println("\nDatos del cilindro2 " + Cilindro2.toString());
		
	}
	
}
