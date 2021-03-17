package interfaces.clientes;

public interface IEmpleado {
	
	public double calcularNomina();
	public int diasDeVacaciones();
	
	//Este método no lo hemos visto por falta de tiempo
	//¿Pero también tendría sentido, no?
	//Fijaros que la respuesta del método podría ser un booleano, que nos indique si me han "aceptado" las vacaciones (o no)
	public boolean pedirDiasDeVacaciones(int dias);
	
	//Cada año tendriamos los mismos dias de vacaciones, por tanto, necesitariamos algo que nos "reinicie" los dias
	public void iniciarVacaciones();

}
