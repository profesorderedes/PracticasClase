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

	boolean retirar(int cantidad, int comision) {

		if (cantidad + comision <= saldo) {
			saldo = saldo - cantidad - comision;
			return true;
		}

		return false;

	}

	boolean retirar(int cantidad) {

		return retirar(cantidad, 0);

	}

	int obtenerSaldo() {

		return saldo;

	}

}
