package interfaces.clientes;

public class Empleado extends Persona implements IDescuentos, IEmpleado {
	
	private int categoriaEmpleado;
	
	//Nuevo atributo
	private int diasDeVacaciones;
	
	public Empleado(int categoriaEmpleado) {
		super();
		this.categoriaEmpleado = categoriaEmpleado;
		
		//Que os parece, si utilizamos el constructor para añadir los dias de vacaciones de un empleado (anuales)
		//Como hemos definido un método que inicia las vacaciones, lo podemos reutilizar
		iniciarVacaciones();
	}

	@Override
	public double descuentoEnProductos() {
		return 10;
	}

	@Override
	public double calcularNomina() {
		return 1000;
	}

	//He modificado un poco este ejemplo, en clase habiamos peusto directamente 22
	@Override
	public int diasDeVacaciones() {
		//En clase hemos puesto el valor directamente
		//return 22;
		
		//Pero ahora que tenemos el atributo, ¿mejor usamos ese?
		return this.diasDeVacaciones;
	}

	@Override
	public boolean pedirDiasDeVacaciones(int dias) {
		//Primero de todo, tendriamos que saber si nos quedan días de vacaciones.
		if (diasDeVacaciones() - dias > 0) {
			//Si nos quedan, los aplicamos
			this.diasDeVacaciones = diasDeVacaciones() - dias;
			return true;
		}
		
		//Como no podemos coger vacaciones, devolvemos false
		return false;
	}

	@Override
	public void iniciarVacaciones() {
		//Restauramos los días de vacaciones (anuales)
		this.diasDeVacaciones = 22;
	}
	
	

}
