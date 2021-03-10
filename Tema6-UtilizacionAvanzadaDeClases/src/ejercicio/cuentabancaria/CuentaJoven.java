package ejercicio.cuentabancaria;

public class CuentaJoven extends CuentaBancaria {
	
	private double descuentosEnRestaurantes;
	
	public CuentaJoven() {
		super();
	}
	
	public CuentaJoven(double descuentosEnRestaurantes) {
		super();
		this.descuentosEnRestaurantes = descuentosEnRestaurantes;
	}
	
	public CuentaJoven(double descuentosEnRestaurantes, String documentoTitular, String numeroCuenta, double saldo) {
		super(documentoTitular, numeroCuenta, saldo);
		this.descuentosEnRestaurantes = descuentosEnRestaurantes;
	}

	public double getDescuentosEnRestaurantes() {
		return descuentosEnRestaurantes;
	}

	public void setDescuentosEnRestaurantes(double descuentosEnRestaurantes) {
		this.descuentosEnRestaurantes = descuentosEnRestaurantes;
	}
	
	@Override
	public double getComisionMensual() {
		return 0;
	}

	@Override
	public double getInteresMensual() {
		// TODO Auto-generated method stub
		return 0;
	}

}
