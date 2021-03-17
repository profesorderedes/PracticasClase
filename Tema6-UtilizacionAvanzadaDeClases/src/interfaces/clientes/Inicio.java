package interfaces.clientes;

public class Inicio {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setDni("43111111B");
		cliente.setNombre("Pepe");
		cliente.setApellidos("Garcia Garcia");
		
		System.out.println("Bienvenido " + cliente.getNombre() + ", tienes un descuento inicial de " + cliente.descuentoEnProductos());
		
		ClienteVip clienteVip = new ClienteVip();
		clienteVip.setDni("43222222A");
		clienteVip.setNombre("Juan");
		clienteVip.setApellidos("Perez Perez");
		
		System.out.println("Bienvenido " + clienteVip.getNombre() + ", tienes un descuento inicial de " + clienteVip.descuentoEnProductos());
		
		//Completo el ejemplo con lo que hemos visto de empleado.
		
		Empleado empleado = new Empleado(1);
		empleado.setDni("43333333C");
		empleado.setNombre("Maria");
		empleado.setApellidos("Martínez Sánchez");
		
		empleado.pedirDiasDeVacaciones(5);
		
		System.out.println("Bienvenida " + empleado.getNombre() + ", por ser empleado tienes un descuento inicial de " + empleado.descuentoEnProductos());
		System.out.println("Este mes cobrarás " + empleado.calcularNomina() + " y te quedan " + empleado.diasDeVacaciones() + " días de vacaciones");
		
	
	}
}
