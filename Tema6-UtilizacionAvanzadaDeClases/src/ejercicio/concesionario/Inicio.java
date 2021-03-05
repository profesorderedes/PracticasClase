package ejercicio.concesionario;

public class Inicio {
	
	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		miCoche.setMarca("Renault");
		miCoche.setMatricula("1234DDD");
		miCoche.setModelo("Clio Confort Dynamic");
		miCoche.setPotenciaCV(90);
		
		Moto miMoto = new Moto();
		miMoto.setCilindrada(250);
		miMoto.setMarca("Honda");
		miMoto.setMatricula("1234AAA");
		miMoto.setModelo("vision");
		
		double impuestos = 0;
		impuestos = impuestos + miCoche.calcularImpuestoCirculacion();
		impuestos = impuestos + miMoto.calcularImpuestoCirculacion();
		
		System.out.println("Debo pagar: " + impuestos);
		
	}

}
