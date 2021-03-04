package ejemplo1;

public class Empleado extends Persona {
	
	private int categoriaEmpleado;

	public Empleado() {
		super();
	}	
	
	public Empleado(int categoriaEmpleado) {
		super();
		this.categoriaEmpleado = categoriaEmpleado;
	}
	
	public Empleado(int categoriaEmpleado, String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		this.categoriaEmpleado = categoriaEmpleado;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Categoría: " + categoriaEmpleado);
	}
	

}
