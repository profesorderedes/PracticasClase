package ejemplo1.abstracto;

public class Inicio {
	
	public static void main(String[] args) {
		//Al ser una clase abstracta, no se puede instancia
		//Persona persona = new Persona("Pedro", "Martínez López", "12345678Z");
		//persona.mostrar();
		
		Cliente cliente = new Cliente("1234-1234-1234-1234");
		cliente.setNombre("Pedro");
		cliente.setApellidos("Martíez López");
		cliente.setDni("12345678Z");
		
		cliente.mostrar();
		
		//persona = cliente;
		//cliente = persona;
	}

}
