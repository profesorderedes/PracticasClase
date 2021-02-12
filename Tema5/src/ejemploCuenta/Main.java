package ejemploCuenta;

public class Main {
	
	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria(500);
		
		boolean retirado;
		
		cuenta.depositar(200);
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo() + " €.");
		
		
//		if(!cuenta.retirar(300)) {
//			System.out.println("No se ha podido retirar la cantidad.");
//		}
//		
//		System.out.println("Saldo actual: " + cuenta.obtenerSaldo() + " €.");
//		
//		if(!cuenta.retirar(1000)) {
//			System.out.println("No se ha podido retirar la cantidad.");
//		}
		
		cuenta.retirar(300, 5);
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo() + " €.");
		
		
		
	}

}
