package ejercicio.cuentabancaria;

public abstract class CuentaBancaria {

	private static final double COMISION_MENSUAL = 10;
	
	private String documentoTitular;
	private String numeroCuenta;
	private double saldo;
	

	public CuentaBancaria() {
		this(0);
	}

	public CuentaBancaria(String documentoTitular, String numeroCuenta, double saldo) {
		this.documentoTitular = documentoTitular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
	}

	public boolean retirar(double cantidad, double comision) {
		if (cantidad + comision <= saldo) {
			saldo = saldo - cantidad - comision;
			return true;
		}
		return false;

	}

	public boolean retirar(double cantidad) {
		return retirar(cantidad, 0);
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public String getDocumentoTitular() {
		return documentoTitular;
	}

	public void setDocumentoTitular(String documentoTitular) {
		this.documentoTitular = documentoTitular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public double getComisionMensual() {
		return COMISION_MENSUAL;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double getInteresMensual();

}
