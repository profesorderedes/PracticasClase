package ejercicio.cuentabancaria;

public class Main {
	
	public static void main(String[] args) {
		
		//Creación de cuenta Joven (constructor vacío + métodos set)
		CuentaJoven cuentaJoven = new CuentaJoven();
		cuentaJoven.setDocumentoTitular("11111111A");
		cuentaJoven.setNumeroCuenta("0000-0000-0000-0000-0001");
		cuentaJoven.depositar(100);
		cuentaJoven.setDescuentosEnRestaurantes(5);
		
		//Creación de cuenta nómina (constructor vacío + métodos set)
		CuentaNomina cuentaNomina = new CuentaNomina();
		cuentaNomina.setDocumentoTitular("21111111A");
		cuentaNomina.setNumeroCuenta("0000-0000-0000-0000-0002");
		cuentaNomina.depositar(1000);
		cuentaNomina.setNomina(1999);
		double[] recibos = new double[] {10, 20};
		cuentaNomina.setPagosRecibosMensuales(recibos);
		
		//Constructor de cuenta ahorro (constructor vacío + métodos set)
		CuentaAhorro cuentaAhorro = new CuentaAhorro();
		cuentaAhorro.setDocumentoTitular("31111111A");
		cuentaAhorro.setNumeroCuenta("0000-0000-0000-0000-0003");
		cuentaAhorro.depositar(3000);
		
		//He cambiado un poco este método. La explicación del "porqué" la tenéis en la clase CuentaAhorro.
		//Si no lo véis no so preocupéis, mañana lo comentamos
		//Esto es lo que habíamos puesto...
		//cuentaAhorro.setIntereses(3);
		
		//Esto es lo que ponemos ahora, si lo que guardamos es el % de interes mensual de los ahorros
		cuentaAhorro.setPorcentageInteres(2);
		
		System.out.println("Para la cuenta joven, mi comisión es de: " + cuentaJoven.getComisionMensual());
		System.out.println("Para la cuenta nomina, mi comisión es de: " + cuentaNomina.getComisionMensual());
		System.out.println("Para la cuenta ahorro, mi comisión es de: " + cuentaAhorro.getComisionMensual());
		
		System.out.println("Para la cuenta joven, mi interés mensual es de: " + cuentaJoven.getInteresMensual());
		System.out.println("Para la cuenta nomina, mi interés mensual es de: " + cuentaNomina.getInteresMensual());
		System.out.println("Para la cuenta ahorro, mi interés mensual es de: " + cuentaAhorro.getInteresMensual());
		
		
		
	}

}
