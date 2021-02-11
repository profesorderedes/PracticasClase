package ejemploCuenta;

public class CuentaBancaria {

	int saldo;

	CuentaBancaria() {
		this(0);
	}

	CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}

	void depositar(int cantidad) {

		saldo = saldo + cantidad;

	}

	boolean retirar(int cantidad) {

		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}

		return false;

	}
	
	boolean retirar(int cantidad, int comision) {
		
		if (cantidad + comision <= saldo) {
			saldo = saldo - cantidad - comision;
			return true;
		}

		return false;
		
	}

	int obtenerSaldo() {

		return saldo;

	}

}
