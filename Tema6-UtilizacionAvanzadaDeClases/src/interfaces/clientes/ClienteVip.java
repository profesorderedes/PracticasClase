package interfaces.clientes;

public class ClienteVip extends Cliente {
	
	public ClienteVip() {
		super();
	}

	@Override
	public double descuentoEnProductos() {
		return super.descuentoEnProductos() + 10;
	}
	
}
