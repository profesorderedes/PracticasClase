package ejercicio.cuentabancaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ejercicio.cuentabancaria.cliente.Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		/**
		 * Creamos un cliente...
		 */
		
		Cliente cliente1 = new Cliente();
		cliente1.setDni("11111111A");
		cliente1.setNombre("Francisco");
		cliente1.setApellidos("Martínez Pérez");
		cliente1.setDireccion("C/De los pinos, 15...");
		cliente1.setTelefono("+34666234234");
		cliente1.setIdCliente("ES000001");
		
		//Forma de convertir una plantilla de fecha en String a tipo Date
		//Una versión más sencilla hubiera sido que cliente tuviera la fecha de nacimiento como String y no como tipo Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = sdf.parse("01/12/1980");
			cliente1.setFechaNacimiento(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//OJO
		//Cliente no tiene implementado el toString(), pero Persona sí (por lo que se utiliza ese)
		//Quizás sería interesante que lo hagáis por vuestra cuenta
		System.out.println("Cliente: " + cliente1.toString());
		
		
		/**
		 * Creamos su cuentas...
		 */
		
 		
		//Creación de cuenta Joven (constructor vacío + métodos set)
		CuentaJoven cuentaJoven = new CuentaJoven();
		//Le asignamos el dni del cliente a la cuenta
		cuentaJoven.setDocumentoTitular(cliente1.getDni());
		//
		cuentaJoven.setNumeroCuenta("0000-0000-0000-0000-0001");
		cuentaJoven.depositar(100);
		cuentaJoven.setDescuentosEnRestaurantes(5);
		
		//Añadimos la cuentaJoven a nuestro array de cuentas...
		//Si nos fijamos bien en esto, nuestro array es de tipo CuentaBancaria
		//Sin embargo, le estamos pasando una cuenta joven
		//¿Por qué no se queja, si son dos tipos diferentes?
		cliente1.anadirCuenta(cuentaJoven);
		
		//Creación de cuenta nómina (constructor vacío + métodos set)
		CuentaNomina cuentaNomina = new CuentaNomina();
		//Le asignamos el dni del cliente a la cuenta
		cuentaNomina.setDocumentoTitular(cliente1.getDni());
		//
		cuentaNomina.setNumeroCuenta("0000-0000-0000-0000-0002");
		cuentaNomina.depositar(1000);
		cuentaNomina.setNomina(1999);
		double[] recibos = new double[] {10, 20};
		cuentaNomina.setPagosRecibosMensuales(recibos);
		cliente1.anadirCuenta(cuentaNomina);
		
		//Constructor de cuenta ahorro (constructor vacío + métodos set)
		CuentaAhorro cuentaAhorro = new CuentaAhorro();
		cuentaAhorro.setDocumentoTitular(cliente1.getDni());
		cuentaAhorro.setNumeroCuenta("0000-0000-0000-0000-0003");
		cuentaAhorro.depositar(3000);
		//Esto es lo que ponemos ahora, si lo que guardamos es el % de interes mensual de los ahorros
		cuentaAhorro.setPorcentajeInteres(3);
		cliente1.anadirCuenta(cuentaAhorro);
		
		/**
		 * Hacemos un print con los valores de comisiones e intereses de la cuenta ahorro (10/03)
		 */
		System.out.println("Para la cuenta joven, mi comisión es de: " + cuentaJoven.getComisionMensual());
		System.out.println("Para la cuenta nomina, mi comisión es de: " + cuentaNomina.getComisionMensual());
		System.out.println("Para la cuenta ahorro, mi comisión es de: " + cuentaAhorro.getComisionMensual());
		
		System.out.println("Para la cuenta joven, mi interés mensual es de: " + cuentaJoven.getInteresMensual());
		System.out.println("Para la cuenta nomina, mi interés mensual es de: " + cuentaNomina.getInteresMensual());
		System.out.println("Para la cuenta ahorro, mi interés mensual es de: " + cuentaAhorro.getInteresMensual());
		
		//En la clase del 11/03, "reescribimos" la manera de obtener los métodos
		//En clase lo hemos visto así... pero os lo cambio un poco (lo tenéis comentado) para que sea más bonito y entendible
		
		//Os lo dejo comentado por si queréis trabajar con él.
		/*CuentaBancaria[] cuentasDelCliente1 = cliente1.getMisCuentas();
		for (int i = 0; i < cuentasDelCliente1.length; i++) {
			CuentaBancaria unaCuenta = cuentasDelCliente1[i];
			if (unaCuenta != null) {
				System.out.println("Mi comisión es de: " + unaCuenta.getComisionMensual());
				System.out.println("Mi interés mensual es de: " + unaCuenta.getInteresMensual());
			}
		}*/
		
		//MOFICIACIÓN
		//Que os parece, si en lugar de hacer el recorrido en el main (código comentado de arriba)... 
		//¿Creamos un método en cliente que nos calcule los valores mensuales?
		
		//Por ejemplo, queremos saber la liquidación del mes (es decir, que nos tocará pagar y que nos tocará recibir de intereses)
		//Ver clase Cliente, métodos getTotalInteresesMensuales() y getTotalComisionesMensuales()
		//Para usarlo, podemos mostrarlo con dos prints
		
		System.out.println("La comisión de las cuentas del cliente con ID " + cliente1.getIdCliente() + " para este mes es de: " + cliente1.getTotalComisionesMensuales());
		System.out.println("Los intereses generados por las cuentas del cliente con ID " + cliente1.getIdCliente() + " para este mes son de: " + cliente1.getTotalInteresesMensuales());
		
	}

}
