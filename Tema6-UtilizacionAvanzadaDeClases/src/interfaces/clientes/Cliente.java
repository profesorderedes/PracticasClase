package interfaces.clientes;

public class Cliente extends Persona implements IDescuentos {
	
	private String visa;
	
	public Cliente(String visa) {
		super();
		this.visa = visa;
	}
	
	public Cliente() {
		super();
	}

	@Override
	public double descuentoEnProductos() {
		return 2;
	}
	

}
