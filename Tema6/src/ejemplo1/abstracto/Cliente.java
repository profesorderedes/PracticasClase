package ejemplo1.abstracto;

public class Cliente extends Persona {
	
	private String visa;
	
	public Cliente() {
		
	}
	
	public Cliente(String visa) {
		super();
		this.visa = visa;
	}
	
	public Cliente(String visa, String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		this.visa = visa;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Visa: " + visa);
	}

	@Override
	public void darDeAlta() {
		// TODO Auto-generated method stub
		
	}

}
