package interfaces.vehiculos;

public class Inicio {
	
	public static void main(String[] args) {
		
		//Imaginad que tenemos que programar un simulador de coches.
		
		Coche miCoche = new Coche();
		miCoche.setMarca("Renault");
		miCoche.setMatricula("1234DDD");
		miCoche.setModelo("Clio Confort Dynamic");
		miCoche.setPotenciaCV(90);
		miCoche.setVelocidadMaxima();
		
		miCoche.arrancar();
		
		//Y si en lugar de esto... que ha sido muy aburrido
		//¿No usamos el método acelerar con velocidad?
		/*miCoche.acelerar();
		miCoche.acelerar();
		miCoche.acelerar();
		miCoche.frenar();
		miCoche.frenar();*/
		
		miCoche.acelerar(30);
		miCoche.frenar(20);
		
		miCoche.acelerar();
		miCoche.acelerar();
		miCoche.acelerar();
		System.out.println("velocidad actual: " + miCoche.getVelocidadActual());
		
		miCoche.frenar();
		miCoche.frenar();
		miCoche.frenar();
		miCoche.frenar();
		miCoche.parar();
		
		System.out.println("velocidad actual: " + miCoche.getVelocidadActual());
		
		
		
		
		Moto miMoto = new Moto();
		miMoto.setCilindrada(250);
		miMoto.setMarca("Honda");
		miMoto.setMatricula("1234AAA");
		miMoto.setModelo("vision");
		miMoto.setVelocidadMaxima();
		
		//Ejemplos para moto...
		miMoto.arrancar();
		miMoto.acelerar(50);
		miMoto.parar();
		
	}

}
