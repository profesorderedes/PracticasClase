package ejercicio.cuentabancaria.cliente;

import java.util.Date;

import ejercicio.cuentabancaria.CuentaBancaria;

public class Cliente extends Persona {
	
	private static final int MAX_CUENTAS = 10;
	
	private String idCliente;
	private String direccion;
	private String telefono;
	
	private CuentaBancaria[] misCuentas;
	
	//Si no hubiera polimorfimos de clases... para cada cuenta bancaria "hija", tendríamos que tener esta estructura
	/*private CuentaJoven[] cuentaJovenes;
	private CuentaAhorro[] cuentaHorros;
	private CuentaNomina[] cuentaNominas;*/
	
	public Cliente() {
		super();
		this.misCuentas = new CuentaBancaria[MAX_CUENTAS];
	}

	public Cliente(CuentaBancaria[] misCuentas, String idCliente, String direccion, String telefono, String nombre, String apellidos, String dni, Date fechaNacimiento) {
		super(nombre, apellidos, dni, fechaNacimiento);
		this.misCuentas = misCuentas;
		this.idCliente = idCliente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.misCuentas = new CuentaBancaria[MAX_CUENTAS];
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public CuentaBancaria[] getMisCuentas() {
		return misCuentas;
	}

	public void setMisCuentas(CuentaBancaria[] misCuentas) {
		this.misCuentas = misCuentas;
	}
	
	public void anadirCuenta(CuentaBancaria nuevaCuenta) {
		int totalCuentas = misCuentas.length;
		for (int i = 0; i < totalCuentas; i++) {
			if (misCuentas[i] == null) {
				misCuentas[i] = nuevaCuenta;
				break;
			}
		}
	}
	
	public double getTotalInteresesMensuales() {
		//Creamos una variable que nos acumule los valores de todas nuestras cuentas
		double totalInteresesMensuales = 0;
		
		CuentaBancaria[] cuentasDelCliente1 = getMisCuentas();
		for (int i = 0; i < cuentasDelCliente1.length; i++) {
			//Recuperamos del array la cuenta bancaria de la posición i
			CuentaBancaria unaCuenta = cuentasDelCliente1[i];
			
			//OJO: Me ha dado error de nullPointer...
			//Me faltaba esta condición
			if (unaCuenta != null) {
				totalInteresesMensuales += unaCuenta.getInteresMensual();
			}
		}
		return totalInteresesMensuales;
	}
	
	public double getTotalComisionesMensuales() {
		//Creamos una variable que nos acumule los valores de todas nuestras cuentas
		double totalComisionesMensuales = 0;
		
		CuentaBancaria[] cuentasDelCliente1 = getMisCuentas();
		for (int i = 0; i < cuentasDelCliente1.length; i++) {
			//Recuperamos del array la cuenta bancaria de la posición i
			CuentaBancaria unaCuenta = cuentasDelCliente1[i];
			
			//OJO: Me ha dado error de nullPointer...
			//Me faltaba esta condición
			if (unaCuenta != null) {
				totalComisionesMensuales += unaCuenta.getComisionMensual();
			}
		}
		return totalComisionesMensuales;
	}

}
