package ejercicio2;

public class Simulador {
	
	public static void main(String[] args) {
		
		Condensador condensador = new Condensador();
		condensador.setCapacidad(25);
		condensador.setIntensidadMaxima(55);
		condensador.setLongitud(2);
		
		Diodo diodo = new Diodo();
		diodo.setIntensidadMaxima(12);
		diodo.setLongitud(2.7);
		diodo.setTensionInversa(4);
		
		Led led = new Led();
		led.setColor("rojo");
		led.setIntensidadMaxima(3.5);
		led.setLongitud(0.5);
		led.setTensionInversa(2);
		
		condensador.conectar();
		System.out.println(condensador.toString());
		
		diodo.conectar();
		System.out.println(diodo.toString());
		
		led.conectar();
		System.out.println(led.toString());
		
	}

}
