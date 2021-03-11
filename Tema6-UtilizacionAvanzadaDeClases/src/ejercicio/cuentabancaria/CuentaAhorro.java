package ejercicio.cuentabancaria;

public class CuentaAhorro extends CuentaBancaria {
	
	//NOTA: Cambio el significado de esta variable.
	//En clase la hemos llamado intereses y la hemos pensado como un valor en euros...
	//Pero creo que queda más integrado el ejemplo si en lugar de un valor, lo pensamos como un porcentaje
	//Por ejemplo... La cuenta ahorro os da un 2% de vuestro saldo medio al mes
	//¿Que os parece?
	
	//private double intereses;
	private double porcentajeInteres;
	
	public CuentaAhorro() {
		super();
	}

	public CuentaAhorro(double porcentajeInteres, String documentoTitular, String numeroCuenta, double saldo) {
		super(documentoTitular, numeroCuenta, saldo);
		this.porcentajeInteres = porcentajeInteres;
	}

	public double getPorcentajeInteres() {
		return porcentajeInteres;
	}

	public void setPorcentajeInteres(double porcentajeInteres) {
		this.porcentajeInteres = porcentajeInteres;
	}

	@Override
	public double getInteresMensual() {
		//Comento lo que hemos hecho en clase... y le damos un sentido más claro
		//¿Y si en lugar de aplicarle un 2% (es decir, multiplicar por 0,02 directamente, como lo habíamos hecho), lo multiplicamos por el valor de la variable porcentajeInteres?
		//return super.obtenerSaldo() * 0.02;
		
		//Como lo guardamos en la variable sin convertir (por ejemplo, 2%), debemos aplicarle el cálculo sobre 100
		double calculoValorEnPorcentaje = porcentajeInteres / 100;
		return super.obtenerSaldo() * calculoValorEnPorcentaje;
		
		//Se podría hacer directamente "return super.obtenerSaldo() * (porcentajeInteres / 100)", pero he creado una variable para que quede más claro.
		
	}
	
	

}
