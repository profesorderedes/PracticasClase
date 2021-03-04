package ejercicioConcesionario;


public class Inicio {
	
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo("1234-AAA", "Citroen", "C3");
		
		Coche coche = new Coche(110);
		coche.setMatricula("1111-BBB");
		coche.setMarca("Renault");
		coche.setModelo("Megane");
		
		Moto moto = new Moto(600, "2233-CCC", "Honda", "CBR");
	}

}
