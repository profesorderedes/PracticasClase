package ejercicio.cuentabancaria;

public class CuentaNomina extends CuentaBancaria {
	
	private double nomina;
	private double[] pagosRecibosMensuales;
	
	public CuentaNomina() {
		super();
	}

	public CuentaNomina(double nomina, double[] recibos, String documentoTitular, String numeroCuenta, double saldo) {
		super(documentoTitular, numeroCuenta, saldo);
		this.nomina = nomina;
		this.pagosRecibosMensuales = recibos;
	}

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public double[] getPagosRecibosMensuales() {
		return pagosRecibosMensuales;
	}

	public void setPagosRecibosMensuales(double[] pagosRecibosMensuales) {
		this.pagosRecibosMensuales = pagosRecibosMensuales;
	}
	
	@Override
	public double getComisionMensual() {
		if (nomina > 1000) {
			return super.getComisionMensual()/2;
		}
		return super.getComisionMensual();
	}

	@Override
	public double getInteresMensual() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
