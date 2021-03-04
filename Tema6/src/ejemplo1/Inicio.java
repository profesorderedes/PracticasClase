package ejemplo1;

public class Inicio {
	
	public static void main(String[] args) {
		Persona persona = new Persona("Pedro", "Martínez López", "12345678Z");
		persona.mostrar();
		
		//Cliente cliente = new Cliente("1234-1234-1234-1234");
		Cliente cliente = new Cliente("1234-1234-1234-1234", "Mario", "Contreras Piqué", "12344321A");
		cliente.mostrar();
		
		//persona = cliente;
		//cliente = persona;
	}

}
